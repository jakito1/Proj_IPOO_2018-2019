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
public class TeacherTest {
    
    public TeacherTest() {
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
     * Test of getName method, of class Teacher.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Teacher instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Teacher.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Teacher instance = null;
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Teacher.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Teacher instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInicials method, of class Teacher.
     */
    @Test
    public void testGetInicials() {
        System.out.println("getInicials");
        Teacher instance = null;
        String expResult = "";
        String result = instance.getInicials();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class Teacher.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        Teacher instance = null;
        Department expResult = null;
        Department result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimetable method, of class Teacher.
     */
    @Test
    public void testGetTimetable() {
        System.out.println("getTimetable");
        Teacher instance = null;
        Timetable expResult = null;
        Timetable result = instance.getTimetable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoom method, of class Teacher.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Teacher instance = null;
        Room expResult = null;
        Room result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoom method, of class Teacher.
     */
    @Test
    public void testSetRoom() {
        System.out.println("setRoom");
        String room = "";
        Teacher instance = null;
        instance.setRoom(room);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
