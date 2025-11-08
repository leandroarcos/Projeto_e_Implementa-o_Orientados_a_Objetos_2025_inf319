package inf319.exercise01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PessoaTest {
    private static Pessoa pa, pb, pc;

    private static Companhia cc;

    @Before
    public void setUp() throws Exception {

        pa = new Pessoa();
        pb = new Pessoa("Ana", "Karenina");

        cc = new Companhia("Iceberg");
        pc = new Pessoa("Janus", "Kamasarov", cc, 1.00);

    }

    @After
    public void tearDown() throws Exception {
        // Nesse caso nenhuma ação é necessária.
    }

    @Test
    public void test() {
    // Teste de construção
        assertEquals(pa.getNome(), "");
        assertEquals(pa.getSobrenome(), "");
        assertNull(pa.getCompanhia());
        assertEquals(pa.getSalario(), 0.0, 0.0);

        assertEquals(pc.getNome(), "Janus");
        assertEquals(pc.getSobrenome(), "Kamasarov");
        assertEquals(pc.getCompanhia(), cc);
        assertEquals(pc.getSalario(), 1.0, 0.0);
        // a instanciação de pc garante que o número de empregados de cc
        // é atualizado corretamente
        assertEquals(cc.getNumeroEmpregados(), 1);

        // Teste de demitese
        pc.demiteSe();
        assertNull(pc.getCompanhia());
        assertEquals(pc.getSalario(), 0.0, 0.0);

        pc.contrataSe(cc, 10.0);
        assertEquals(cc.getNumeroEmpregados(), 1);
        assertEquals(pc.getSalario(), 10.0, 0.0);

        // É possível decrementar e incrementar o número de empregados
        // de uma companhia sem que haja contratação ou demissão de empregados
        // É possível realizar um projeto que impeça esses comportamentos
        // anomalos?
        cc.incrementaEmpregados();
        cc.incrementaEmpregados();
        cc.decrementaEmpregados();
        assertEquals(cc.getNumeroEmpregados(), 2);

    }


}
