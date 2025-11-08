package inf319.exercise03;

import java.util.HashSet;
import java.util.Set;

public class Companhia {
	
    private String nome_companhia;
    private Set<Pessoa> empregados;
    
    public Companhia() {
        this.empregados = new HashSet<>();
    }
    
    public Companhia(String nome_companhia) {
        this();
        this.nome_companhia = nome_companhia;
    }
    
    public String getNome() {
    	return nome_companhia;
    }
        
    public void emprega(Pessoa empregado, double salario) {
        if (empregado != null && !empregados.contains(empregado)) {
            empregados.add(empregado);
            empregado.emprega(this, salario);
        }
    }
    
    public void demite(Pessoa empregado) {
        if (empregado != null && empregados.contains(empregado)) {
            empregados.remove(empregado);
            empregado.demite();
        }
    }

    public double custoTotal() {
        double custo = 0.0;
        if (empregados != null) {
            for (Pessoa p : empregados) {
                custo += p.getSalario();
            }
        }
        return custo;
    }
}
