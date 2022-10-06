/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.HashSet;
import java.util.Iterator;

/**This class manages the room's class.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class RoomManager {
    
    private static HashSet<Room> room = new HashSet<>();
    
    
    /**This method adds a new classroom.
     * 
     * @param newRoom Type: String.
     */
    private static void addNewRoom(String newRoom){
        newRoom = newRoom.trim();
        System.out.println("Sala não encontrada. Especifique o tamanho da sala " + newRoom);
        InputReader input = new InputReader();
        room.add(new Room(newRoom, input.getIntegerNumber("Tamanho: ")));
    }
    
    
    /**This method removes a roomclass from the system(room class list).
     * 
     * @param deleteRoom String.
     * @return returns true if a room is sucessfully removed.
     */
    public static boolean removeRoom(String deleteRoom){
        if (deleteRoom != null){
            deleteRoom = deleteRoom.trim();
            Iterator<Room> iterator = room.iterator();
            while(iterator.hasNext()) {
                Room room1 = iterator.next();
                if(room1.getFullRoomNumber().equalsIgnoreCase(deleteRoom)){
                    iterator.remove();
                    return true;
                }
            }
        }
        return false;
    }
    
    
    /**This method finds a requested classroom (if exists).
     * 
     * @param newRoom Type: String.
     * @return returns a room depending on the conditions (the requested room).
     */
    public static Room searchRoom(String newRoom){
        if (newRoom != null){
            newRoom = newRoom.trim();
            for (Room room1 : room) {
                if (room1.getFullRoomNumber().equalsIgnoreCase(newRoom)){
                    return room1;
                }
            } 
            addNewRoom(newRoom);
            return searchRoom(newRoom);
        }
        return null;
    }
    

    /**This method shows all classrooms.
     * 
     * @return returns a string with all the classrooms in the school.
     */
    public static String allRooms() {
        String string = "Todas as salas: " + "\n";
        for (Room room1 : room) {
            string += room1.getFullRoomNumber() + "\n";
        }
        return string;
    }
    
}
