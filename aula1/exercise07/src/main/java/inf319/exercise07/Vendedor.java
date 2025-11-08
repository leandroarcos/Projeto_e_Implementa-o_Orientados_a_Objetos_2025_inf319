package inf319.exercise07;

public class Vendedor extends Empregado {

    private double comissaoVenda;

    public double getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(double comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }

    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public double salario() {
        return super.salario() + this.comissaoVenda;
    }

}
