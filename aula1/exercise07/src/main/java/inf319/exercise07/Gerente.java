package inf319.exercise07;

public class Gerente extends Empregado {

    private double bonusSucesso;

    public double getBonusSucesso() {
        return bonusSucesso;
    }

    public void setBonusSucesso(double bonusSucesso) {
        this.bonusSucesso = bonusSucesso;
    }

    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public double salario() {
        return super.salario() + this.bonusSucesso;
    }

}
