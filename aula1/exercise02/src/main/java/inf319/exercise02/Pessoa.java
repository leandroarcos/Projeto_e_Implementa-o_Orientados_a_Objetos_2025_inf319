package inf319.exercise02;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private double salario;

    public Pessoa() {
    	nome = "";
    	sobrenome = "";
        salario = 0.0;
    }
    
    public Pessoa(String nome, String sobrenome) {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.salario = 0.0;    	
    }
    
    
    public Pessoa(String nome, String sobrenome, double salario) {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.salario = salario;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome() {
    	return sobrenome;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
