package inf319;

/**
 * Representa uma progressão matemática genérica.
 * Esta classe abstrata define a estrutura e o comportamento comuns a todas as progressões,
 * como o valor inicial, o valor atual e métodos para interagir com a sequência.
 */
public abstract class Progressao {

    /** O primeiro termo da progressão. */
    protected int primeiro;

    /** O termo atual da progressão. */
    protected int atual;

    /**
     * Construtor que inicializa a progressão com um valor inicial.
     * @param primeiro O primeiro termo da progressão.
     */
    public Progressao(int primeiro) {
        this.primeiro = primeiro;
        this.atual = primeiro;
    }

    /**
     * Reinicia a progressão para o primeiro termo.
     * @return O primeiro termo da progressão.
     */
    public int inicia() {
        this.atual = this.primeiro;
        return this.atual;
    }

    /**
     * Avança para o próximo termo da progressão. O cálculo específico é definido pelas subclasses.
     * @return O próximo termo da progressão.
     */
    public abstract int proxTermo();

    /**
     * Calcula o i-ésimo termo da progressão (base 0) sem alterar o estado atual.
     * A fórmula de cálculo é definida pelas subclasses.
     * @param i O índice do termo a ser calculado (começando em 0).
     * @return O valor do i-ésimo termo.
     */
    public abstract int iesimoTermo(int i);

}