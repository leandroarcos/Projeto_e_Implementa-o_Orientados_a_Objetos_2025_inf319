package inf319.exercise05;

import java.util.Set;
import java.util.stream.Collectors;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private ContratosDeTrabalho contratos;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void setContratos(ContratosDeTrabalho contratos) {
        this.contratos = contratos;
    }

    public ContratosDeTrabalho getContratos() {
        return contratos;
    }

    public String getName() {
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Set<Companhia> getEmpregos() {
        if (contratos == null) {
            return Set.of();
        }
        return contratos.getEmpregadores(this).stream()
                .map(Contrato::getEmpregador)
                .collect(Collectors.toSet());
    }

    public double getSalarioTotal() {
        if (contratos == null) {
            return 0.0;
        }
        return contratos.salarioTotal(this);
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + "]";
    }
}