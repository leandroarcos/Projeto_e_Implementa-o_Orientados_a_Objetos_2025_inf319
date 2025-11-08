package inf319.exercise03;

public class Pessoa {

	private String nome;
	private String sobrenome;
    private Companhia emprego;
    private double salario;

    public Pessoa() {
        this.salario = 0.0;
    }
    
    public Pessoa(String nome, String sobrenome) {
        this();
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public String getSobrenome() {
    	return sobrenome;
    }
    
    public Companhia getEmprego() {
        return emprego;
    }
    
    public double getSalario() {
        return salario;
    }

    public void emprega(Companhia emprego, double salario) {
        // Se a pessoa já estiver empregada, primeiro ela se demite.
        if (this.emprego != null) {
            this.emprego.demite(this);
        }
        
        // Define o novo emprego e salário
        this.emprego = emprego;
        this.salario = salario;
        
        // Garante a consistência chamando o método da companhia, se necessário.
        if (emprego != null) {
            emprego.emprega(this, salario);
        }
    }
    
    public void demite() {
        this.emprego = null;
        this.salario = 0.0;
    }
}
