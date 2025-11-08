package inf319.exercise06;

    public class Vendedor extends Empregado {
    
    private double comissaoVenda;

    public double getComissaoVenda() {
	return comissaoVenda;
    }

    public void setComissaoVenda(double comissaoVenda) {
	this.comissaoVenda = comissaoVenda;
    }

    @Override
    public double salario() {
        return super.salario() + this.comissaoVenda;
    }

}
