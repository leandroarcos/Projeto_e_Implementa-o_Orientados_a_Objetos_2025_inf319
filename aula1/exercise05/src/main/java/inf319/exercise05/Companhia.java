package inf319.exercise05;

public class Companhia {

    private String nome_companhia;
    private ContratosDeTrabalho contratos;

    public Companhia(String nome_companhia) {
        this.nome_companhia = nome_companhia;
    }

    public String getNome() {
        return nome_companhia;
    }

    public void setNome(String nome) {
        this.nome_companhia = nome;
    }

    public void setContratos(ContratosDeTrabalho contratos) {
        this.contratos = contratos;
    }

    public ContratosDeTrabalho getContratos() {
        return contratos;
    }

    public void emprega(Pessoa empregado, double salario) {
        if (contratos != null) {
            contratos.emprega(this, empregado, salario);
        }
    }

    public void demite(Pessoa empregado) {
        if (contratos != null) {
            contratos.demite(this, empregado);
        }
    }

    public double custoTotal() {
        if (contratos == null) {
            return 0.0;
        }
        return contratos.custoTotal(this);
    }

    public boolean isEmpregado(Pessoa pessoa) {
        if (contratos == null) {
            return false;
        }
        return contratos.getEmpregados(this).stream()
                .anyMatch(c -> c.getEmpregado().equals(pessoa));
    }

    public int getNumeroEmpregados() {
        if (contratos == null) {
            return 0;
        }
        return contratos.getEmpregados(this).size();
    }

    @Override
    public String toString() {
        return "Companhia [nome=" + nome_companhia + "]";
    }
}