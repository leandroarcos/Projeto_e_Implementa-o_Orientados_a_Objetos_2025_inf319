package inf319.exercise06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestEmpregado {
	
	 Empregado ep;
	 Vendedor v;
	 Gerente  g;
	 Engenheiro e;

	@Before
	public void setUp() throws Exception {
		
		ep = new Empregado();
		ep.setSalario(1200.00);
		
		v = new Vendedor();
		v.setSalario(1000.00);
		v.setComissaoVenda(10.00);
		
        g = new Gerente();		
		g.setSalario(1000.00);
		g.setBonusSucesso(20.00);
		
		e = new Engenheiro();
	    e.setSalario(1000.00);
	    e.setComissaoProjeto(30.00);
	    
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals(1200.00, ep.salario(), 0.00);		
		assertEquals(1030.00, e.salario(), 0.00);
		assertEquals(1020.00, g.salario(), 0.00);
		assertEquals(1010.00, v.salario(), 0.00);
		
	}

}
