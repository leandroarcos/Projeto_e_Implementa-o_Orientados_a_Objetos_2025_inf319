package inf319.exercise07;

public class Engenheiro extends Empregado {

    private double comissaoProjeto;

    public double getComissaoProjeto() {
        return comissaoProjeto;
    }

    public void setComissaoProjeto(double comissaoProjeto) {
        this.comissaoProjeto = comissaoProjeto;
    }

    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public double salario() {
        return super.salario() + this.comissaoProjeto;
    }

}
