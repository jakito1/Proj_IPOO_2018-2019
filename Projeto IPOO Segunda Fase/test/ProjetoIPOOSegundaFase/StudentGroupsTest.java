/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

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
public class StudentGroupsTest {
    
    public StudentGroupsTest() {
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
     * Test of addStudent method, of class StudentGroups.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = null;
        StudentGroups instance = null;
        instance.addStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudent method, of class StudentGroups.
     */
    @Test
    public void testRemoveStudent() {
        System.out.println("removeStudent");
        String deleteStudent = "";
        StudentGroups instance = null;
        boolean expResult = false;
        boolean result = instance.removeStudent(deleteStudent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentList method, of class StudentGroups.
     */
    @Test
    public void testGetStudentList() {
        System.out.println("getStudentList");
        StudentGroups instance = null;
        HashSet expResult = null;
        HashSet result = instance.getStudentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAlone method, of class StudentGroups.
     */
    @Test
    public void testIsIsAlone() {
        System.out.println("isIsAlone");
        StudentGroups instance = null;
        boolean expResult = false;
        boolean result = instance.isIsAlone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurricularUnit method, of class StudentGroups.
     */
    @Test
    public void testGetCurricularUnit() {
        System.out.println("getCurricularUnit");
        StudentGroups instance = null;
        CurricularUnit expResult = null;
        CurricularUnit result = instance.getCurricularUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class StudentGroups.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        StudentGroups instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class StudentGroups.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        StudentGroups instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
