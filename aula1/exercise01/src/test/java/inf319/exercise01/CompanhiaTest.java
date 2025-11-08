package inf319.exercise01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CompanhiaTest {

    private static Companhia ca, cb, cc;

    @Before
    public void setUp() throws Exception {

        ca = new Companhia();
        cb = new Companhia("CB");
        cc = new Companhia("CC");

    }

    @After
    public void tearDown() throws Exception {
        // Nesse caso nenhuma ação é necessária.
    }

    @Test
    public void test() {
        // Teste do estado após construção sem parâmtro
       assertEquals(ca.getNome(), "");
       assertEquals(ca.getNumeroEmpregados(), 0);

       // Teste do construtor com parâmetro
        assertEquals(cb.getNome(), "CB");
        assertEquals(cb.getNumeroEmpregados(), 0);

        assertEquals(cc.getNome(), "CC");
        assertEquals(cc.getNumeroEmpregados(), 0);

        // É possível incrementar e decrementar o número de empregados
        // de uma Companhia mesmo que não exista a correspondente associação
        // a Pessoas.
        // Como a especificação do relacionamento entre Pessoa e Companhia
        // não estabelece nenhuma condição de consistência entre o número de empregados
        // de uma Companhia e pessoas esse comportamento é aceitável.
        for (int i = 0; i < 5; i++) {
            ca.incrementaEmpregados();
        }
        assertEquals(ca.getNumeroEmpregados(), 5);
        ca.decrementaEmpregados();
        assertEquals(ca.getNumeroEmpregados(), 4);
        ca.incrementaEmpregados();
        assertEquals(ca.getNumeroEmpregados(), 5);
        for (int i = 0; i < 6; i++) {
            ca.decrementaEmpregados();
        }
        // numero de empregados é sempre >= 0
        assertFalse(ca.getNumeroEmpregados() < 0);
    }

}
