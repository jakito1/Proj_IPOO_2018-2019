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
public class DegreeTest {
    
    public DegreeTest() {
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
     * Test of getName method, of class Degree.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Degree instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegreeTypeToString method, of class Degree.
     */
    @Test
    public void testGetDegreeTypeToString() {
        System.out.println("getDegreeTypeToString");
        Degree instance = null;
        String expResult = "";
        String result = instance.getDegreeTypeToString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCode method, of class Degree.
     */
    @Test
    public void testGetIdCode() {
        System.out.println("getIdCode");
        Degree instance = null;
        String expResult = "";
        String result = instance.getIdCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCredits method, of class Degree.
     */
    @Test
    public void testGetCredits() {
        System.out.println("getCredits");
        Degree instance = null;
        int expResult = 0;
        int result = instance.getCredits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class Degree.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        Degree instance = null;
        Department expResult = null;
        Department result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
