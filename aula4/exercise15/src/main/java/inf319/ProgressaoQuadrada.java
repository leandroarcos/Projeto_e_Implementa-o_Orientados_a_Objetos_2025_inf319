package inf319;

/**
 * Representa uma progressão onde cada termo é o quadrado do termo
 * correspondente de outra progressão.
 *
 * <p><b>Decisão de Projeto:</b>
 * A classe `ProgressaoQuadrada` foi projetada utilizando o padrão de projeto
 * <strong>Decorator</strong>. Ela estende a classe abstrata `Progressao` (cumprindo o
 * requisito de herança) e, ao mesmo tempo, "decora" ou "envolve" outra
 * instância de `Progressao` através da composição.
 *
 * <p>Esta abordagem oferece grande flexibilidade. Em vez de criar uma classe
 * que calcula apenas o quadrado de uma progressão aritmética, podemos agora
 * criar a progressão quadrada de *qualquer* tipo de progressão (aritmética,
 * geométrica, etc.), simplesmente passando a instância desejada para o
 * construtor.
 *
 * <p>Os métodos `inicia()` e `proxTermo()` delegam a chamada para a progressão
 * envolvida e, em seguida, transformam o resultado (elevando-o ao quadrado)
 * antes de retorná-lo. Isso preserva a API de `Progressao` e permite que
 * `ProgressaoQuadrada` se comporte como qualquer outra `Progressao`.
 */
public class ProgressaoQuadrada extends Progressao {

    /** A progressão base que será decorada. */
    private final Progressao p;

    /**
     * Construtor que recebe a progressão a ser decorada.
     * @param p A instância de Progressao cujos termos serão elevados ao quadrado.
     */
    public ProgressaoQuadrada(Progressao p) {
        this.p = p;
    }

    @Override
    public int inicia() {
        valCor = p.inicia();
        return valCor * valCor;
    }

    @Override
    public int proxTermo() {
        valCor = p.proxTermo();
        return valCor * valCor;
    }
}
