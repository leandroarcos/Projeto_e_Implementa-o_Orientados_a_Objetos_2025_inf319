package inf319;

public class ProgressaoGeometrica extends Progressao {

    private int razao;

    /**
     * Construtor padrão.
     * Inicia uma PG com primeiro termo 1 e razão 2.
     */
    public ProgressaoGeometrica() {
        super(1); // O primeiro termo de uma PG é 1 por definição do problema
        this.razao = 2;
    }

    /**
     * Construtor que define a razão.
     * Inicia uma PG com primeiro termo 1.
     * @param razao A razão da progressão.
     */
    public ProgressaoGeometrica(int razao) {
        super(1); // O primeiro termo de uma PG é 1 por definição do problema
        this.razao = razao;
    }

    /**
     * Avança para o próximo termo da progressão multiplicando o termo atual pela razão.
     * @return O próximo termo da progressão.
     */
    @Override
    public int proxTermo() {
        this.atual *= this.razao;
        return this.atual;
    }

    /**
     * Calcula o i-ésimo termo da progressão geométrica (base 0).
     * A fórmula é: primeiro * (razao ^ i).
     * @param i O índice do termo a ser calculado (começando em 0).
     * @return O valor do i-ésimo termo.
     */
    @Override
    public int iesimoTermo(int i) {
        return (int) (this.primeiro * Math.pow(this.razao, i));
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
