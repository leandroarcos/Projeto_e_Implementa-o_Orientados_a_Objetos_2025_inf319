package inf319.exercise06;

    public class Engenheiro extends Empregado {
    
    private double comissaoProjeto;

    public double getComissaoProjeto() {
	return comissaoProjeto;
    }

    public void setComissaoProjeto(double comissaoProjeto) {
	this.comissaoProjeto = comissaoProjeto;
    }

    @Override
    public double salario() {
        return super.salario() + this.comissaoProjeto;
    }

}
