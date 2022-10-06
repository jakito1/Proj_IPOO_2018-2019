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
public class TimetableTest {
    
    public TimetableTest() {
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
     * Test of getStartDate method, of class Timetable.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Timetable instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartHour method, of class Timetable.
     */
    @Test
    public void testGetStartHour() {
        System.out.println("getStartHour");
        Timetable instance = null;
        int expResult = 0;
        int result = instance.getStartHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartMinute method, of class Timetable.
     */
    @Test
    public void testGetStartMinute() {
        System.out.println("getStartMinute");
        Timetable instance = null;
        int expResult = 0;
        int result = instance.getStartMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullStartDate method, of class Timetable.
     */
    @Test
    public void testGetFullStartDate() {
        System.out.println("getFullStartDate");
        Timetable instance = null;
        String expResult = "";
        String result = instance.getFullStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullEndDate method, of class Timetable.
     */
    @Test
    public void testGetFullEndDate() {
        System.out.println("getFullEndDate");
        Timetable instance = null;
        String expResult = "";
        String result = instance.getFullEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Timetable.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Timetable instance = null;
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndHour method, of class Timetable.
     */
    @Test
    public void testGetEndHour() {
        System.out.println("getEndHour");
        Timetable instance = null;
        int expResult = 0;
        int result = instance.getEndHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndMinute method, of class Timetable.
     */
    @Test
    public void testGetEndMinute() {
        System.out.println("getEndMinute");
        Timetable instance = null;
        int expResult = 0;
        int result = instance.getEndMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Timetable.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Timetable instance = null;
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
