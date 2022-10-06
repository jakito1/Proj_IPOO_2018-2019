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
public class DegreeTypeTest {
    
    public DegreeTypeTest() {
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
     * Test of values method, of class DegreeType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        DegreeType[] expResult = null;
        DegreeType[] result = DegreeType.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class DegreeType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        DegreeType expResult = null;
        DegreeType result = DegreeType.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegree method, of class DegreeType.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        DegreeType degreeType = null;
        String[] expResult = null;
        String[] result = DegreeType.getDegree(degreeType);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDepartment method, of class DegreeType.
     */
    @Test
    public void testFindDepartment() {
        System.out.println("findDepartment");
        String degree = "";
        String expResult = "";
        String result = DegreeType.findDepartment(degree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCredits method, of class DegreeType.
     */
    @Test
    public void testGetCredits() {
        System.out.println("getCredits");
        DegreeType degreeType = null;
        int i = 0;
        int expResult = 0;
        int result = DegreeType.getCredits(degreeType, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
