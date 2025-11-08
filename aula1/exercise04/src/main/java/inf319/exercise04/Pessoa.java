package inf319.exercise04;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	
    private Contrato contratoTrabalho;
    
    public Pessoa() {
    	nome = "";
    	sobrenome = "";
    	contratoTrabalho =  null;
    }
    
    public Pessoa(String nome, String sobrenome) {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.contratoTrabalho = null;
    }
    
    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
    
    public void setSobreNome(String sobrenome) { this.sobrenome = sobrenome; }
    public String getSobreNome() { return sobrenome; }
    
    public Companhia getEmprego() {
        if (contratoTrabalho != null) {
            return contratoTrabalho.getEmpregador();
        }
        return null;
    }
    
    public double getSalario() {
        if (contratoTrabalho != null) {
            return contratoTrabalho.getSalario();
        }
        return 0.0;
    }

    public void emprega(Contrato contratoTrabalho) {
        this.contratoTrabalho = contratoTrabalho;
    }
    
    public void demite() {
        this.contratoTrabalho = null;
    }
}
