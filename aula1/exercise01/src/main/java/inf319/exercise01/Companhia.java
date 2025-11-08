package inf319.exercise01;

/**
 * 
 * @author Luiz Eduardo Busato
 * 
 * <p> Especificação: Companhia</p>
 * <p> Companhia participa, passivamente, de uma associação unidirecional de Pessoa para Companhia.</p>
 * <p> Toda companhia recém criada não tem empregados. </p>
 * <p> O nome de uma Companhia é iniciado somente na sua construção e não pode ser mudado posteriormente. </p>
 * <p> A associação unidirecional implica que Companhia não tem controle sobre os seus empregados.
 * Apesar disso, a interface pública de Companhia fornece métodos que permitem a atualização do seu número de empregados:
 * incrementaEmpregados() e decrementaEmpregados().</p>
 * <p> Esses métodos devem ser utilizados na implementação dos métodos de Pessoa que realizam a associação
 * de forma a garantir que o número corrente de empregados de uma companhia é consistente com o número
 * de pessoas que se contratou ou se demitiu da companhia.</p>
 */

public class Companhia {

	// Nome da companhia
	private String nome;
	
    // Número corrente de empregados
	private int numeroEmpregados;
	/*
	 * Construtor padrão.
	 * Inicia os atributos com os valores default
	 * consistentes com a especificação.
	 */
	public Companhia() {
		this.nome = "";
		this.numeroEmpregados = 0;
	}
	
	/*
	 * Construtor que inicia o nome da companhia
	 * com o valor do parâmetro.
	 * Inicia o número de empregados de forma consistente
	 * com a especificação.
	 * @param nome: nome da companhia, uma vez iniciado não pode ser alterado.
	 */
	public Companhia(String nome) {
		this.nome = nome;
		this.numeroEmpregados = 0;
	}
	
	/*
	 * Getters
	 */
	/**
	 * @return nome_companhia: retorna o nome da companhia.
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return numeroEmpregados: retorna o número corrente de empregados da companhia.
	 */
	public int getNumeroEmpregados() {
		return numeroEmpregados;
	}
	
	/*
	 * Setters
	 */
	/**
	 * @param nome: o novo nome da companhia
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/*
	 * Métodos que incrementam e decrementam
	// o número de empregados de uma companhia
	 */
	/**
	 * Incrementa o número de empregados da companhia.
	 */
	public void incrementaEmpregados() {
		this.numeroEmpregados++;
	}
	/**
	 * Decrementa o número de empregados da empresa
	 */
	public void decrementaEmpregados() {
		if (this.numeroEmpregados > 0) {
			this.numeroEmpregados--;
		}
	}
	
}
