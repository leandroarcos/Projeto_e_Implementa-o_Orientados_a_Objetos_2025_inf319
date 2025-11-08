package inf319;

public class ProgressaoQuadrada extends Progressao {
	
	private Progressao progressao;
    private int termoCor;  

    public ProgressaoQuadrada(Progressao progressao) {
    	this.progressao = progressao;
    }
    
	public int inicia() {
		termoCor = progressao.inicia();
		termoCor = termoCor * termoCor;
		return termoCor;
	}

	public int proxTermo() {
        termoCor = progressao.proxTermo();
        return (termoCor * termoCor);
	}
	
	public int iesimoTermo(int i) {
		termoCor = progressao.iesimoTermo(i);
		return (termoCor * termoCor);
	}

}
