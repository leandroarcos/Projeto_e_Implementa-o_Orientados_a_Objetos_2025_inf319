package inf319;

public class ProgressaoAritmetica extends Progressao {

    private int razao;

    /**
     * Construtor padrão.
     * Inicia uma PA com primeiro termo 0 e razão 1.
     */
    public ProgressaoAritmetica() {
        super(0); // O primeiro termo de uma PA é 0 por definição do problema
        this.razao = 1;
    }

    /**
     * Construtor que define a razão.
     * Inicia uma PA com primeiro termo 0.
     * @param razao A razão da progressão.
     */
    public ProgressaoAritmetica(int razao) {
        super(0); // O primeiro termo de uma PA é 0 por definição do problema
        this.razao = razao;
    }

    /**
     * Avança para o próximo termo da progressão somando a razão ao termo atual.
     * @return O próximo termo da progressão.
     */
    @Override
    public int proxTermo() {
        this.atual += this.razao;
        return this.atual;
    }

    /**
     * Calcula o i-ésimo termo da progressão aritmética (base 0).
     * A fórmula é: primeiro + i * razao.
     * @param i O índice do termo a ser calculado (começando em 0).
     * @return O valor do i-ésimo termo.
     */
    @Override
    public int iesimoTermo(int i) {
        return this.primeiro + i * this.razao;
    }

    /**
     * Gera uma representação em String dos n+1 primeiros termos da progressão (de 0 a n).
     * Este método utiliza o cálculo do i-ésimo termo para gerar a sequência.
     * @param n O índice do último termo a ser incluído na string.
     * @return Uma string com os termos da progressão, separados por espaço e terminando com uma nova linha.
     */
    public String imprimeProgressao(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(iesimoTermo(i)).append(" ");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1); // Remove o último espaço
        }
        sb.append('\n');
        return sb.toString();
    }
}
