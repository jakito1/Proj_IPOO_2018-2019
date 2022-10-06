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
public class MenuTest {
    
    public MenuTest() {
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
     * Test of displayMainMenu method, of class Menu.
     */
    @Test
    public void testDisplayMainMenu() {
        System.out.println("displayMainMenu");
        Menu instance = new Menu();
        instance.displayMainMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayEditMenu method, of class Menu.
     */
    @Test
    public void testDisplayEditMenu() {
        System.out.println("displayEditMenu");
        Menu instance = new Menu();
        instance.displayEditMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayViewMenu method, of class Menu.
     */
    @Test
    public void testDisplayViewMenu() {
        System.out.println("displayViewMenu");
        Menu instance = new Menu();
        instance.displayViewMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readMainOption method, of class Menu.
     */
    @Test
    public void testReadMainOption() {
        System.out.println("readMainOption");
        Menu instance = new Menu();
        int expResult = 0;
        int result = instance.readMainOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetSchedule method, of class Menu.
     */
    @Test
    public void testResetSchedule() {
        System.out.println("resetSchedule");
        Menu instance = new Menu();
        boolean expResult = false;
        boolean result = instance.resetSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
