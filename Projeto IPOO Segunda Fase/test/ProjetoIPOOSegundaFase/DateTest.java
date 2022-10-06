/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.time.LocalDate;
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
public class DateTest {
    
    public DateTest() {
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
     * Test of compareDates method, of class Date.
     */
    @Test
    public void testCompareDates() {
        System.out.println("compareDates");
        LocalDate date1 = null;
        LocalDate date2 = null;
        Date instance = null;
        int expResult = 0;
        int result = instance.compareDates(date1, date2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearsTillToday method, of class Date.
     */
    @Test
    public void testGetYearsTillToday() {
        System.out.println("getYearsTillToday");
        Date instance = null;
        int expResult = 0;
        int result = instance.getYearsTillToday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentDate method, of class Date.
     */
    @Test
    public void testGetCurrentDate() {
        System.out.println("getCurrentDate");
        Date instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getCurrentDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentYear method, of class Date.
     */
    @Test
    public void testGetCurrentYear() {
        System.out.println("getCurrentYear");
        Date instance = null;
        int expResult = 0;
        int result = instance.getCurrentYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentMonth method, of class Date.
     */
    @Test
    public void testGetCurrentMonth() {
        System.out.println("getCurrentMonth");
        Date instance = null;
        int expResult = 0;
        int result = instance.getCurrentMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentDay method, of class Date.
     */
    @Test
    public void testGetCurrentDay() {
        System.out.println("getCurrentDay");
        Date instance = null;
        int expResult = 0;
        int result = instance.getCurrentDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Date.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Date instance = null;
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonth method, of class Date.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Date instance = null;
        int expResult = 0;
        int result = instance.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Date.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Date instance = null;
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullDate method, of class Date.
     */
    @Test
    public void testGetFullDate() {
        System.out.println("getFullDate");
        Date instance = null;
        String expResult = "";
        String result = instance.getFullDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalDate method, of class Date.
     */
    @Test
    public void testGetLocalDate() {
        System.out.println("getLocalDate");
        Date instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getLocalDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
