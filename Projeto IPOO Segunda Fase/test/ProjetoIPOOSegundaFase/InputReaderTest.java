/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class InputReaderTest {
    
    public InputReaderTest() {
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

    /**
     * Test of getRealNumber method, of class InputReader.
     */
    @Test
    public void testGetRealNumber() {
        System.out.println("getRealNumber");
        String question = "";
        InputReader instance = new InputReader();
        double expResult = 0.0;
        double result = instance.getRealNumber(question);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntegerNumber method, of class InputReader.
     */
    @Test
    public void testGetIntegerNumber() {
        System.out.println("getIntegerNumber");
        String question = "";
        InputReader instance = new InputReader();
        int expResult = 0;
        int result = instance.getIntegerNumber(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class InputReader.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        String question = "";
        InputReader instance = new InputReader();
        String expResult = "";
        String result = instance.getText(question);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
