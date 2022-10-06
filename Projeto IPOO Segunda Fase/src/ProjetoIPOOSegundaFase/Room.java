/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

/**This class identifies the classrooms assigned for each student/teacher.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Room {
   private char zone;
   private int floor;
   private int roomNumber;
   private int capacity;

 
   /**This is the constructor to the Room's class. It initializates the needed 
    * parameters.
    * 
    * @param room Type: String.
    * @param capacity Type: int
    * These parameters are used to identifie the letter (which is assigned to 
    * a certain school zone) and number of the room.
    */
    public Room(String room, int capacity) {
        resetRoom();
        if (room != null && capacity > 0){
            this.capacity = capacity;
            if (!splitString(room)) {
                resetRoom();
            }
        }  
    }
   
    
    /**This method reset the room (change all its values to either 0 or ' ').
     * 
     */
    private void resetRoom() {
        this.zone = ' ';
        this.floor = 0;
        this.roomNumber = 0;
        this.capacity = 0;
    }
    
    
    /**This method breaks a given String around matches of the given regular
     * expression.
     * 
     * @param room Type: String.
     * @return returns true if the room is valid.
     */
    private boolean splitString(String room){
        room = room.trim();
        if (room.matches("[a-zA-Z]{1}[0-9]{3}")){                               //verificar se string contem uma letra seguida de 3 numeros
            char[] roomArray = room.toCharArray();
            if (Character.getNumericValue(roomArray[1]) > 2){
                return false;
            }
            this.zone = Character.toUpperCase(roomArray[0]);
            this.floor = Character.getNumericValue(roomArray[1]);
            this.roomNumber = Character.getNumericValue(roomArray[2]) * 10 + 
                              Character.getNumericValue(roomArray[3]);
            return true;
        }
        return false;
    }

    public char getZone() {
        return this.zone;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }
    
    public String getFullRoomNumber() {
        return (String.valueOf(zone) + floor + roomNumber);
    }

    public int getCapacity() {
        return this.capacity;
    }   
}
