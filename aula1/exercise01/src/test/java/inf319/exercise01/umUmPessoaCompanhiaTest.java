package inf319.exercise01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class umUmPessoaCompanhiaTest {

	Pessoa p, pa;
	Companhia c, ca;
	
	@Before
	public void setUp() throws Exception {
		
	   p = new Pessoa();
	   c = new Companhia();
	   
	   pa = new Pessoa("Caroline","Garcia");
	   ca = new Companhia("Wimbledon");
	}

	@Test
	public void test() {
		// test the construction of Pessoa (Caroline Garcia)
		assertEquals(pa.getNome(),"Caroline");
		assertEquals(pa.getSobrenome(), "Garcia");
		// test the construction of Companhia (Wimbledon)
		assertEquals(ca.getNome(), "Wimbledon");
		assertEquals(ca.getNumeroEmpregados(), 0);
		// Caroline se contrata em Wimbledon
		pa.contrataSe(ca, 2000.00);
		// Wimbledon tem 1 empregado agora
		assertEquals(ca.getNumeroEmpregados(),1);
		// Wimbledon diminui o seu numero de empregados unilateralmente.
		ca.decrementaEmpregados();
		assertEquals(ca.getNumeroEmpregados(),0);
		// Roger Federer se contrata em Wimbledon
		// O que acontece com o objeto que contém o estado de Caroline Garcia?
		pa = new Pessoa("Roger","Federer",ca,1530.00);
		assertEquals(pa.getNome(), "Roger");
		assertEquals(pa.getSobrenome(), "Federer");
		assertEquals(pa.getSalario(), 1530.00, 0.0);
		assertEquals(ca.getNumeroEmpregados(),1);

		// Teste dos construtores default (sem parâmetros)
		assertEquals(c.getNome(),"");
		assertEquals(c.getNumeroEmpregados(), 0);
        c.setNome("Roland Garros");
		c.incrementaEmpregados();

		p.setNome("Gustavo");
		p.setSobrenome("Kuerten");

	    p.contrataSe(c,1000.0);
	    assertEquals(p.getSalario(), 1000.0, 0.0);
	    assertEquals(p.getCompanhia(), c);
		assertEquals(c.getNumeroEmpregados(), 2);
	}

}