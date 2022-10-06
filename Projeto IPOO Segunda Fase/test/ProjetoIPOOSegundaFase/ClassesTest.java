/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.time.DayOfWeek;
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
public class ClassesTest {
    
    public ClassesTest() {
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
     * Test of getDayOfWeek method, of class Classes.
     */
    @Test
    public void testGetDayOfWeek() {
        System.out.println("getDayOfWeek");
        String weekDay = "";
        DayOfWeek expResult = null;
        DayOfWeek result = Classes.getDayOfWeek(weekDay);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Classes.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Classes instance = null;
        ClassesType expResult = null;
        ClassesType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekDay method, of class Classes.
     */
    @Test
    public void testGetWeekDay() {
        System.out.println("getWeekDay");
        Classes instance = null;
        DayOfWeek expResult = null;
        DayOfWeek result = instance.getWeekDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Classes.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Classes instance = null;
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoom method, of class Classes.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Classes instance = null;
        Room expResult = null;
        Room result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeacher method, of class Classes.
     */
    @Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        Classes instance = null;
        Teacher expResult = null;
        Teacher result = instance.getTeacher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeekLength method, of class Classes.
     */
    @Test
    public void testGetWeekLength() {
        System.out.println("getWeekLength");
        Classes instance = null;
        int expResult = 0;
        int result = instance.getWeekLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
