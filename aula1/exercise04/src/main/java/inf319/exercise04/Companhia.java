package inf319.exercise04;

import java.util.HashMap;
import java.util.Map;

public class Companhia {

	private String nome_companhia;
    private Map<Pessoa, Contrato> contratosTrabalho;
    
    public Companhia() {
        this.nome_companhia = "";
        this.contratosTrabalho = new HashMap<>();
    }
    
    public Companhia(String nome_companhia) {
        this.nome_companhia = nome_companhia;
        this.contratosTrabalho = new HashMap<>();
    }
 
    public String getNome() {
    	return nome_companhia;
    }
     
    public void emprega(Pessoa empregado, double salario) {
        Contrato novoContrato = new Contrato(this, empregado, salario);
        this.contratosTrabalho.put(empregado, novoContrato);
        empregado.emprega(novoContrato);
    }
    
    public void demite(Pessoa empregado) {
        if (this.contratosTrabalho.containsKey(empregado)) {
            this.contratosTrabalho.remove(empregado);
            empregado.demite();
        }
    }

    public double custoTotal() {
        double custo = 0.0;
        for (Contrato contrato : contratosTrabalho.values()) {
            custo += contrato.getSalario();
        }
        return custo;
    }
    
}
