package inf319.daisy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDaisy {
	
	Daisy d = new Daisy();
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(d.getState(), DaisyState.off);
		d.pull();
		assertEquals(d.getState(), DaisyState.lowSpeed);
		d.pull();
		assertEquals(d.getState(), DaisyState.medSpeed);
		d.pull();
		assertEquals(d.getState(), DaisyState.higSpeed);
		d.pull();
		assertEquals(d.getState(), DaisyState.off);
	}

}
