package inf319.exercise06;

    public class Gerente extends Empregado {
    
    private double bonusSucesso;

    public double getBonusSucesso() {
	return bonusSucesso;
    }

    public void setBonusSucesso(double bonusSucesso) {
	this.bonusSucesso = bonusSucesso;
    }

    @Override
    public double salario() {
        return super.salario() + this.bonusSucesso;
    }

}
