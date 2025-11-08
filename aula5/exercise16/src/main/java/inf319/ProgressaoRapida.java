package inf319;

import java.util.HashMap;
import java.util.Map;

/**
 * A classe ProgressaoRapida implementa o padrão de projeto Decorator para adicionar
 * funcionalidade de cache a qualquer objeto Progressao.
 * 
 * Decisão de Projeto:
 * Foi escolhido o padrão Decorator (usando delegação/composição) em vez de herança direta
 * das classes de progressão concretas. Essa abordagem é mais flexível, pois permite
 * "decorar" qualquer subclasse de Progressao com a funcionalidade de cache sem
 * modificar o código original dessas classes. Isso adere ao princípio Aberto/Fechado
 * (aberto para extensão, fechado para modificação).
 * 
 * A classe atua como um invólucro para uma instância de Progressao, interceptando
 * chamadas ao método iesimoTermo() para fornecer resultados em cache.
 */
public class ProgressaoRapida extends Progressao {

    /**
     * A instância de Progressao que está sendo decorada.
     */
    private final Progressao progressao;

    /**
     * O cache para armazenar os termos já calculados pelo método iesimoTermo.
     * A chave (Integer) é o índice do termo e o valor (Integer) é o resultado.
     * Usamos HashMap por sua eficiência em operações de get/put.
     */
    private final Map<Integer, Integer> cache;

    public ProgressaoRapida(Progressao progressao) {
        this.progressao = progressao;
        this.cache = new HashMap<>();
    }

    @Override
    public int inicia() {
        // Ao reiniciar a progressão, o cache deve ser limpo para evitar
        // retornar valores de uma sequência anterior.
        cache.clear();
        return progressao.inicia();
    }

    @Override
    public int proxTermo() {
        // A lógica de proxTermo depende do estado interno da progressão,
        // então delegamos diretamente sem usar o cache.
        return progressao.proxTermo();
    }

    @Override
    public int iesimoTermo(int i) {
        // Se o valor não estiver no cache, calcula, armazena e retorna.
        // Se já estiver, retorna diretamente do cache.
        return cache.computeIfAbsent(i, k -> progressao.iesimoTermo(k));
    }
}
