/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.util.Arrays;

/**This class manages the room's class.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class RoomManager {
    
    private static int roomElements;
    private static Room[] room;
    static {
        roomElements = 0;
        room = new Room[10];
    }
    
    /**This method adds a new classroom.
     * 
     * @param newRoom Type: String.
     */
    private static void addNewRoom(String newRoom){
        newRoom = newRoom.trim();
        System.out.println("Sala não encontrada. Especifique o tamanho da sala " + newRoom);
        InputReader input = new InputReader();
        if (roomElements > room.length - 3){
            room = Arrays.copyOf(room, room.length * 2);
        }
        room[roomElements++] = new Room(newRoom, input.getIntegerNumber("Tamanho: "));
    }
    
    /**This method removes a roomclass from the system(room class list).
     * 
     * @param deleteRoom String.
     * @return returns true if a room is sucessfully removed.
     */
    public static boolean removeRoom(String deleteRoom){
        if (deleteRoom != null){
            deleteRoom = deleteRoom.trim();
            for (int i = 0; i < roomElements; i++){
                if (room[i].getFullRoomNumber().equalsIgnoreCase(deleteRoom)){
                    for (int k = i; i < roomElements; k++){
                        room[k]=room[k+1];
                        roomElements--;
                        System.out.println("Removida com sucesso.");
                        return true;
                    }
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
            for (int i = 0; i < roomElements; i++){
                if (room[i].getFullRoomNumber().equalsIgnoreCase(newRoom)){
                    return room[i];
                }
            }
            addNewRoom(newRoom);
            if (room[roomElements - 1].getCapacity() != 0){
                return room[roomElements - 1]; 
            }else{
                System.out.println("Sala inválida.");
                roomElements--;
            }
            return room[roomElements];
        }
        return null;
    }

    /**This method shows all classrooms.
     * 
     * @return returns a string with all the classrooms in the school.
     */
    public static String allRooms() {
        String string = "Todas as salas: " + "\n";
        for (int i = 0; i < roomElements; i++){
            string += room[i].getFullRoomNumber() + "\n";
        }
        return string;
    }
}
