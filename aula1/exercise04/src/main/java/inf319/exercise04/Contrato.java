package inf319.exercise04;

public class Contrato {

    private Companhia empregador;
    private Pessoa empregado;
    private double salario;
    
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

}
