package inf319.exercise07;

/**
 * Representa um empregado genérico na empresa.
 *
 * Esta classe é declarada como 'abstract' porque não faz sentido instanciar um
 * "Empregado" genérico. Empregados sempre serão de um tipo específico (Gerente,
 * Vendedor, etc.). A classe abstrata serve como um modelo comum, garantindo que
 * todos os tipos de empregados compartilhem uma estrutura e comportamento base.
 *
 * --- Respostas às Questões Teóricas ---
 *
 * 1. Como decidir qual a melhor estratégia de implementação dos métodos (classe
 * mãe vs. classe filha)?
 * A decisão de onde implementar um método depende do comportamento esperado:
 * - Implementar na Classe Mãe (Superclasse): Ideal para comportamentos comuns a
 *   TODAS as classes filhas. Isso centraliza a lógica e promove o reuso de
 *   código. Por exemplo, o método `setSalario` é comum a todos e, portanto,
 *   implementado aqui.
 * - Implementar na Classe Filha (Subclasse): Necessário para comportamentos
 *   específicos de um tipo. O cálculo do salário total (`salario()`) varia para
 *   cada tipo de empregado (adicionando bônus ou comissão), então cada subclasse
 *   fornece sua própria implementação, aproveitando a implementação base da
 *   superclasse.
 *
 * 2. Que implicação essa decisão traz para a especialização?
 * A estratégia de implementação define a natureza da especialização:
 * - Especialização por Extensão: A classe filha adiciona funcionalidades ou
 *   estende o comportamento da mãe. Em nosso caso, as subclasses estendem o
 *   cálculo do salário base adicionando seus próprios valores. Elas chamam
 *   `super.salario()` e adicionam o bônus.
 * - Especialização por Substituição: A classe filha substitui completamente um
 *   comportamento da mãe. Se o método `salario()` nas subclasses não utilizasse
 *   o `super.salario()`, seria uma substituição.
 *
 * A abordagem usada aqui (extensão) é vantajosa porque reutiliza a lógica da
 * classe base, tornando o código mais limpo e fácil de manter.
 */
public abstract class Empregado {

    private double salario;

    protected double salario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

}
