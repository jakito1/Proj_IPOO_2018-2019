/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.ArrayList;
import java.util.HashSet;
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
public class CurricularUnitTest {
    
    public CurricularUnitTest() {
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
     * Test of addClasses method, of class CurricularUnit.
     */
    @Test
    public void testAddClasses() {
        System.out.println("addClasses");
        Classes newClass = null;
        CurricularUnit instance = null;
        instance.addClasses(newClass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAssessments method, of class CurricularUnit.
     */
    @Test
    public void testAddAssessments() {
        System.out.println("addAssessments");
        Assessments newAssessment = null;
        CurricularUnit instance = null;
        instance.addAssessments(newAssessment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTeacher method, of class CurricularUnit.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        String newTeacher = "";
        CurricularUnit instance = null;
        instance.addTeacher(newTeacher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHeadTeacher method, of class CurricularUnit.
     */
    @Test
    public void testAddHeadTeacher() {
        System.out.println("addHeadTeacher");
        String newTeacher = "";
        CurricularUnit instance = null;
        instance.addHeadTeacher(newTeacher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class CurricularUnit.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CurricularUnit instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class CurricularUnit.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CurricularUnit instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemester method, of class CurricularUnit.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        CurricularUnit instance = null;
        int expResult = 0;
        int result = instance.getSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCredits method, of class CurricularUnit.
     */
    @Test
    public void testGetCredits() {
        System.out.println("getCredits");
        CurricularUnit instance = null;
        int expResult = 0;
        int result = instance.getCredits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClasses method, of class CurricularUnit.
     */
    @Test
    public void testGetClasses() {
        System.out.println("getClasses");
        CurricularUnit instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssessments method, of class CurricularUnit.
     */
    @Test
    public void testGetAssessments() {
        System.out.println("getAssessments");
        CurricularUnit instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAssessments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class CurricularUnit.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        CurricularUnit instance = null;
        Department expResult = null;
        Department result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacher method, of class CurricularUnit.
     */
    @Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        CurricularUnit instance = null;
        HashSet expResult = null;
        HashSet result = instance.getTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegree method, of class CurricularUnit.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        CurricularUnit instance = null;
        Degree expResult = null;
        Degree result = instance.getDegree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeadTeacher method, of class CurricularUnit.
     */
    @Test
    public void testGetHeadTeacher() {
        System.out.println("getHeadTeacher");
        CurricularUnit instance = null;
        Teacher expResult = null;
        Teacher result = instance.getHeadTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
