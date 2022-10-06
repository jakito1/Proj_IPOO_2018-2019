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
public class RoomManagerTest {
    
    public RoomManagerTest() {
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
     * Test of removeRoom method, of class RoomManager.
     */
    @Test
    public void testRemoveRoom() {
        System.out.println("removeRoom");
        String deleteRoom = "";
        boolean expResult = false;
        boolean result = RoomManager.removeRoom(deleteRoom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchRoom method, of class RoomManager.
     */
    @Test
    public void testSearchRoom() {
        System.out.println("searchRoom");
        String newRoom = "";
        Room expResult = null;
        Room result = RoomManager.searchRoom(newRoom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allRooms method, of class RoomManager.
     */
    @Test
    public void testAllRooms() {
        System.out.println("allRooms");
        String expResult = "";
        String result = RoomManager.allRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
