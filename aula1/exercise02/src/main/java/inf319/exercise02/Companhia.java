package inf319.exercise02;

import java.util.ArrayList;
import java.util.List;

public class Companhia {

    private String nomeCompanhia;
    private List<Pessoa> empregados;

    public Companhia() {
        nomeCompanhia = "";
        empregados = new ArrayList<>();
    }

    public Companhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
        this.empregados = new ArrayList<>();
    }

    public String getNome() {
        return nomeCompanhia;
    }

    public void setNome(String nome) {
        this.nomeCompanhia = nome;
    }

    public int getNumeroEmpregados() {
        return empregados.size();
    }

    /**
     * Emprega uma pessoa se ela estiver desempregada (salario == 0.0).
     * @param empregado A pessoa a ser empregada.
     * @param salario O novo salário da pessoa.
     */
    public void emprega(Pessoa empregado, double salario) {
        if (empregado.getSalario() == 0.0 && salario > 0.0) {
            empregado.setSalario(salario);
            empregados.add(empregado);
        }
    }

    /**
     * Demite um empregado, zerando seu salário.
     * @param empregado A pessoa a ser demitida.
     */
    public void demite(Pessoa empregado) {
        if (empregados.contains(empregado)) {
            empregado.setSalario(0.0);
            empregados.remove(empregado);
        }
    }

    public double getFolhaPagamento() {
        double folha = 0.0;
        for (Pessoa p : empregados) {
            folha += p.getSalario();
        }
        return folha;
    }
}
