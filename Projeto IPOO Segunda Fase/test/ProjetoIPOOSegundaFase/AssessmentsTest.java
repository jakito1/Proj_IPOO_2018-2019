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
public class AssessmentsTest {
    
    public AssessmentsTest() {
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
     * Test of getType method, of class Assessments.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
      //Assessments instance = new Assessments();
        String expResult = "Teste";
      //String result = instance.getType();
      //assertEquals(expResult, result);

    }

    /**
     * Test of getDescription method, of class Assessments.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Assessments instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRoom method, of class Assessments.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Assessments instance = null;
        Room expResult = null;
        Room result = instance.getRoom();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTimetable method, of class Assessments.
     */
    @Test
    public void testGetTimetable() {
        System.out.println("getTimetable");
        Assessments instance = null;
        Timetable expResult = null;
        Timetable result = instance.getTimetable();
        assertEquals(expResult, result);

    }
    
}
