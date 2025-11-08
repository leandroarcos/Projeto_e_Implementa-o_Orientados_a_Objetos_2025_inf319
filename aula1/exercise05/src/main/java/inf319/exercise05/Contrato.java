package inf319.exercise05;

public class Contrato {

    private final Companhia empregador;
    private final Pessoa empregado;
    private final double salario;

    public Contrato(Companhia empregador, Pessoa empregado, double salario) {
        this.empregador = empregador;
        this.empregado = empregado;
        this.salario = salario;
    }

    public Companhia getEmpregador() {
        return empregador;
    }

    public Pessoa getEmpregado() {
        return empregado;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Contrato [empregador=" + empregador.getNome() + ", empregado=" + empregado.getName() + ", salario=" + salario + "]";
    }
}