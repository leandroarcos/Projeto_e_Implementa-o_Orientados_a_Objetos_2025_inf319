package inf319.exercise05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContratosDeTrabalho {

    private final Map<Pessoa, HashSet<Contrato>> contratosEmpregados = new HashMap<>();
    private final Map<Companhia, HashSet<Contrato>> contratosEmpregadores = new HashMap<>();

    public Set<Contrato> getEmpregadores(Pessoa pessoa) {
        return contratosEmpregados.getOrDefault(pessoa, new HashSet<>());
    }

    public Set<Contrato> getEmpregados(Companhia companhia) {
        return contratosEmpregadores.getOrDefault(companhia, new HashSet<>());
    }

    public void emprega(Companhia companhia, Pessoa pessoa, double salario) {
        // Check if person is already employed by this company
        boolean empregado = getEmpregadores(pessoa).stream()
                .anyMatch(c -> c.getEmpregador().equals(companhia));

        if (empregado) {
            System.out.println(pessoa.getName() + " já é empregado da " + companhia.getNome());
            return; // Or throw an exception
        }

        Contrato contrato = new Contrato(companhia, pessoa, salario);

        contratosEmpregados.computeIfAbsent(pessoa, k -> new HashSet<>()).add(contrato);
        contratosEmpregadores.computeIfAbsent(companhia, k -> new HashSet<>()).add(contrato);
    }

    public void demite(Companhia companhia, Pessoa pessoa) {
        Set<Contrato> empregos = contratosEmpregados.get(pessoa);
        if (empregos != null) {
            empregos.removeIf(c -> c.getEmpregador().equals(companhia));
        }

        Set<Contrato> empregados = contratosEmpregadores.get(companhia);
        if (empregados != null) {
            empregados.removeIf(c -> c.getEmpregado().equals(pessoa));
        }
    }

    public double salarioTotal(Pessoa pessoa) {
        return getEmpregadores(pessoa).stream()
                .mapToDouble(Contrato::getSalario)
                .sum();
    }

    public double custoTotal(Companhia companhia) {
        return getEmpregados(companhia).stream()
                .mapToDouble(Contrato::getSalario)
                .sum();
    }
}