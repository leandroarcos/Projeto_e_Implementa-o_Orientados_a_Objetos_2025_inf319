/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf319.exercise07;

import java.lang.reflect.Modifier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INF319
 */
public class EmpregadoTest {
    
    public EmpregadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testClassEmpregadoIsAbstract() {
        assertTrue("Por que a classe Empregado é " + Modifier.toString(Empregado.class.getModifiers()) + " ?", Modifier.isAbstract(Empregado.class.getModifiers()));
    }

    
    
}
