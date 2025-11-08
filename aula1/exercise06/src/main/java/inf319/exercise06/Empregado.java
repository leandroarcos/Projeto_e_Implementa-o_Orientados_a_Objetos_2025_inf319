package inf319.exercise06;
/**
 * Implemente o método salario() na classe Empregado, de forma que ele retorne o salário
 * base acrescido das comissões ou bônus, se houver.

 * @author Luiz Eduardo Busato
 */
    public class Empregado {

    private double salario;
    
    public void setSalario(double salario) {
    	this.salario = salario;
    }
    
    public double salario() {
        /*
         * ESTRATÉGIA DE IMPLEMENTAÇÃO:
         * A classe base `Empregado` define o comportamento padrão para o cálculo do salário,
         * que é simplesmente retornar o valor do atributo `salario`.
         *
         * Esta abordagem permite que as subclasses (`Gerente`, `Engenheiro`, `Vendedor`)
         * herdem e, mais importante, sobrescrevam (override) este método para adicionar
         * sua lógica específica (bônus, comissões).
         *
         * Isso é um exemplo clássico de polimorfismo, resultando em um código mais flexível,
         * extensível e de fácil manutenção, pois a classe base não precisa conhecer os detalhes
         * de suas subclasses.
         */
        return this.salario;
    }
    
}