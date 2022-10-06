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
public class TeacherManagerTest {
    
    public TeacherManagerTest() {
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
     * Test of removeTeacher method, of class TeacherManager.
     */
    @Test
    public void testRemoveTeacher() {
        System.out.println("removeTeacher");
        String deleteTeacher = "";
        boolean expResult = false;
        boolean result = TeacherManager.removeTeacher(deleteTeacher);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTeacher method, of class TeacherManager.
     */
    @Test
    public void testSearchTeacher() {
        System.out.println("searchTeacher");
        String newTeacher = "";
        Teacher expResult = null;
        Teacher result = TeacherManager.searchTeacher(newTeacher);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allTeachers method, of class TeacherManager.
     */
    @Test
    public void testAllTeachers() {
        System.out.println("allTeachers");
        String expResult = "";
        String result = TeacherManager.allTeachers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
