package inf319.exercise02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CompanhiaTest {
    Pessoa p1;
    Pessoa p2;
    Pessoa p3;
    Companhia c;
    
	@Before
	public void setUp() throws Exception {
		
		p1 = new Pessoa();
		p2 = new Pessoa();
		p3 = new Pessoa();

		c = new Companhia();
		
	}

	@Test
	public void test() {
		// Check the construction is ok
		assertEquals(p1.getSalario(), 0.0, 0.0);
		assertEquals(p2.getSalario(), 0.0, 0.0);	

		// c hires two employees
		c.emprega(p1, 1000.0);
		c.emprega(p2, 1200.0);
		c.emprega(p3, 1500.0);
		// the payroll cost should be equal to the sum of the salaries of
		// the employees
		assertEquals(c.getNumeroEmpregados(), 3);
		
		assertEquals(p1.getSalario(), 1000.0, 0.0);
		assertEquals(p2.getSalario(), 1200.0, 0.0);
		assertEquals(p3.getSalario(), 1500.0, 0.0);
		c.demite(p1);
		assertEquals(p1.getSalario(), 0.0, 0.0);
	}

}
