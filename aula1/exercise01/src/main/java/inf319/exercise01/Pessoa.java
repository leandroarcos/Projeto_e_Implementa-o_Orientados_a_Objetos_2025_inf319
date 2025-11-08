package inf319.exercise01;

/**
 * 
 * @author Luiz Eduardo Busato
 * 
 * <p>Especificação: Pessoa</p>
 * <p> </p>
 * <p>A classe Pessoa descreve uma pessoa e a companhia onde ela trabalha, se ela tiver se contratado junto a esta companhia.</p>
 * <p>Associação: </p>
 * <p>Sentido: Pessoa para Companhia</p>
 * <p>Cardinalidade: 0 ou 1. Uma pessoa trabalha para extamente uma companhia ou para nenhuma. </p>
 * <p>Uma pessoa se associa a uma companhia ao executar o método <b>contrataSe</b></p>
 * <p>Uma Pessoa se desassocia de uma Companhia ao executar o método <b>demiteSe</b></p><br>
 * 
 * 
 * <p>Na vida real, pessoas não podem escolher livremente as empresas às quais</p>
 * <p>querem se filiar. Neste projeto, entretanto, uma pessoa pode decidir que</p>
 * quer vincular-se ou desvincular-se a uma empresa sem que a empresa tenha controle</p>
 * <p>sobre esse vínculo (emprego).</p> 
 * <p>Assim, neste projeto a empresa é passiva, isto é, todas as ações ocorrem por iniciativa</p>
 * <p>da Pessoa.</p>
 * 
 * <p> Ao admitir-se numa companhia, uma pessoa deve incrementar o número de empregados da companhia a qual se associa.</p>
 * <p> Ao demitir-se de uma companhia, uma pessoa de decrementar o número de empregados da companhia que deixa.</p>
 * 
 * Esta especificação e a análise dos parâmetros e retornos dos métodos permite que o aluno deduza
 * quais são os atributos necessários e suficientes para que Pessoa e seu relacionamento com Companhia
 * sejam implementados.
 */

public class Pessoa {
	
    private String nome;
    private String sobrenome;
    private Companhia companhia;
    private double salario;

    /**
     * Construtor default; os valores iniciais dos atributos devem ser consistentes com a especificação de Pessoa.
     */
    public Pessoa() {
        this.nome = "";
        this.sobrenome = "";
    }
    
  /**
   * Este construtor permite a iniciação de nome e sobrenome da pessoa.
   * 
   * @param nome
   * @param sobrenome
   */
    public Pessoa(String nome, String sobrenome) {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    }

    /**
     * Este construtor permite a iniciação do nome, sobrenome e salario da pessoa, além
     * de estabelecer a sua associação com uma companhia.
     * 
     * @param nome
     * @param sobrenome
     * @param aCompanhia
     * @param salario
     */
    public Pessoa(String nome, String sobrenome, Companhia aCompanhia, double salario) {
    	this(nome, sobrenome);
    	contrataSe(aCompanhia, salario);
    }
    
    /**
     *  Retorna o nome da pessoa.
     *  
     * @return nome
     */
    public String getNome() {
    	return nome;
    }
    /**
     * Retorna o sobrenome da pessoa.
     * 
     * @return sobrenome
     */
    public String getSobrenome() {
    	return sobrenome;
    }
    /**
     * Retorna a companhia onde a pessoa trabalha, se trabalhar. Retorna um objeto nulo (null) se ela não estiver empregada.
     * 
     * @return companhia 
     */
    
    public Companhia getCompanhia() {
        return companhia;
    }
    /**
     * Retorna o salário da pessoa, se trabalhar. Retorna zero se ela não estiver empregada.
     * 
     * @return salario
     */
    public double getSalario() {
        return salario;
    }
    

    /**
     * Inicia ou muda o nome da pessoa.
     * 
     * @param oNome
     */
    public void setNome(String oNome) {
    	this.nome = oNome;
    }
    /**
     * Inicia ou muda o sobrenome da pessoa.
     * 
     * @param oSobrenome
     */
    public void setSobrenome(String oSobrenome) {
    	this.sobrenome = oSobrenome;
    }

    /**
     * Estabelece ou muda o salário da pessoa na companhia.
     * 
     * @param oSalario
     */
    public void setSalario(double oSalario) {
    	this.salario = oSalario;
    }
    
    /**
     * <p> O método <b>contrataSe</b> realiza a associação entre uma <b>Pessoa</b> e uma <b>Companhia</b>.</p>
     * 
     * @param empresa: nome da empresa onde a Pessoa se contratou (onde a pessoa passará a trabalhar após a contratação).
     * @param salario: salario da Pessoa.
     */
    public void contrataSe(Companhia empresa, double salario) {
    	if (this.companhia != null) {
    		demiteSe();
    	}
    	this.companhia = empresa;
    	this.salario = salario;
    	this.companhia.incrementaEmpregados();
    }
    /**
     * <p>O método <b>demiteSe</b> remove a associação entre uma <b>Pessoa</b> e uma <b>Companhia</b>. A pessoa deixa de trabalhar para a companhia após demitir-se dela.</p>
     * 
     * <p>O método <b>demiteSe</b> garante que o salário é zerado e que o relacionamento entre a Pessoa e a Empresa é removido.</p>
     */
    public void demiteSe() {
    	this.companhia.decrementaEmpregados();
    	this.companhia = null;
    	this.salario = 0.0;
    }
}
