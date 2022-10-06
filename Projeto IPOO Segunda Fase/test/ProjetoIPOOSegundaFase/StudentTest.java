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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of addSchedules method, of class Student.
     */
    @Test
    public void testAddSchedules() {
        System.out.println("addSchedules");
        Schedule newSchedule = null;
        Student instance = null;
        instance.addSchedules(newSchedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSchedule method, of class Student.
     */
    @Test
    public void testGetCurrentSchedule() {
        System.out.println("getCurrentSchedule");
        Student instance = null;
        Schedule expResult = null;
        Schedule result = instance.getCurrentSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCurricularUnits method, of class Student.
     */
    @Test
    public void testAddCurricularUnits() {
        System.out.println("addCurricularUnits");
        CurricularUnit newCurricularUnit = null;
        Student instance = null;
        instance.addCurricularUnits(newCurricularUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetSchedules method, of class Student.
     */
    @Test
    public void testResetSchedules() {
        System.out.println("resetSchedules");
        Student instance = null;
        instance.resetSchedules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Student.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Student instance = null;
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthDate method, of class Student.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Student instance = null;
        Date expResult = null;
        Date result = instance.getBirthDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class Student.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Student instance = null;
        char expResult = ' ';
        char result = instance.getGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegree method, of class Student.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        Student instance = null;
        Degree expResult = null;
        Degree result = instance.getDegree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScheduleList method, of class Student.
     */
    @Test
    public void testGetScheduleList() {
        System.out.println("getScheduleList");
        Student instance = null;
        HashSet expResult = null;
        HashSet result = instance.getScheduleList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurricularUnitList method, of class Student.
     */
    @Test
    public void testGetCurricularUnitList() {
        System.out.println("getCurricularUnitList");
        Student instance = null;
        HashSet expResult = null;
        HashSet result = instance.getCurricularUnitList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Student.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Student instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Student instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
