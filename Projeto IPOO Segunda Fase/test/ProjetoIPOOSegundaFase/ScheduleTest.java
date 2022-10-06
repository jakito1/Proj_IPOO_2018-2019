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
public class ScheduleTest {
    
    public ScheduleTest() {
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
     * Test of addCurricularUnit method, of class Schedule.
     */
    @Test
    public void testAddCurricularUnit() {
        System.out.println("addCurricularUnit");
        CurricularUnit newCurricularUnit = null;
        Schedule instance = null;
        instance.addCurricularUnit(newCurricularUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTeacher method, of class Schedule.
     */
    @Test
    public void testAddTeacher() {
        System.out.println("addTeacher");
        String newTeacher = "";
        Schedule instance = null;
        instance.addTeacher(newTeacher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudentGroups method, of class Schedule.
     */
    @Test
    public void testAddStudentGroups() {
        System.out.println("addStudentGroups");
        StudentGroups newStudentGroup = null;
        Schedule instance = null;
        instance.addStudentGroups(newStudentGroup);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeGroup method, of class Schedule.
     */
    @Test
    public void testRemoveGroup() {
        System.out.println("removeGroup");
        Student student = null;
        Schedule instance = null;
        boolean expResult = false;
        boolean result = instance.removeGroup(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalCredits method, of class Schedule.
     */
    @Test
    public void testGetTotalCredits() {
        System.out.println("getTotalCredits");
        Schedule instance = null;
        int expResult = 0;
        int result = instance.getTotalCredits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalClassesDuration method, of class Schedule.
     */
    @Test
    public void testGetTotalClassesDuration() {
        System.out.println("getTotalClassesDuration");
        Schedule instance = null;
        int expResult = 0;
        int result = instance.getTotalClassesDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAssessments method, of class Schedule.
     */
    @Test
    public void testGetAllAssessments() {
        System.out.println("getAllAssessments");
        Schedule instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAllAssessments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartSemester method, of class Schedule.
     */
    @Test
    public void testGetStartSemester() {
        System.out.println("getStartSemester");
        Schedule instance = null;
        Date expResult = null;
        Date result = instance.getStartSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndSemester method, of class Schedule.
     */
    @Test
    public void testGetEndSemester() {
        System.out.println("getEndSemester");
        Schedule instance = null;
        Date expResult = null;
        Date result = instance.getEndSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurricularUnitList method, of class Schedule.
     */
    @Test
    public void testGetCurricularUnitList() {
        System.out.println("getCurricularUnitList");
        Schedule instance = null;
        HashSet expResult = null;
        HashSet result = instance.getCurricularUnitList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacherList method, of class Schedule.
     */
    @Test
    public void testGetTeacherList() {
        System.out.println("getTeacherList");
        Schedule instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getTeacherList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentGroupsList method, of class Schedule.
     */
    @Test
    public void testGetStudentGroupsList() {
        System.out.println("getStudentGroupsList");
        Schedule instance = null;
        HashSet expResult = null;
        HashSet result = instance.getStudentGroupsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEvenSemester method, of class Schedule.
     */
    @Test
    public void testIsEvenSemester() {
        System.out.println("isEvenSemester");
        Schedule instance = null;
        boolean expResult = false;
        boolean result = instance.isEvenSemester();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Schedule.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Schedule instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Schedule.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Schedule instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
