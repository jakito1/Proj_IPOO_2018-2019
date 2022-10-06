/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.time.DayOfWeek;

/**
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Classes {
    private ClassesType type;
    private DayOfWeek weekDay;
    private int duration;
    private Room room;
    private Teacher teacher;
    private int weekLength;

    /**This is the constructor that initializates the class Classes's parameters 
     * 
     * @param type Type: String.
     * @param weekDay Type: String.
     * @param duration Type: int.
     * @param room Type: String.
     * @param teacher Type: String.
     * @param weekLength Type: int.
     */
    public Classes(String type, String weekDay, int duration, String room, String teacher, int weekLength) {
        if (checkStrings(type) && checkStrings(weekDay) && checkStrings(room) && 
                checkStrings(teacher) && duration > 0){
            if (weekLength <= 0){
                weekLength = 15;
            }
            if (isDurationValid(duration)){
                this.type = getClassType(type);
                this.weekDay = getDayOfWeek(weekDay);
                this.duration = duration;
                this.room = RoomManager.searchRoom(room);
                this.teacher = TeacherManager.searchTeacher(teacher);
                this.weekLength = weekLength;
            }
        }
    }
    
    /**This method checks for null (of a string).
     * 
     * @param string Type: String.
     * @return returns a string that isn't null.
     */
    private boolean checkStrings(String string){
        return (string != null);
    }
    
    /**This method checks if the classes duration are valid. 
     * 
     * @param duration Type: int.
     * @return returns true or false depending on the duration of a class. 
     */
    private boolean isDurationValid(int duration){
        switch (duration){
            case 60:
            case 90:
            case 120:
            case 240:
                return true;
        }
        return false;
    }
    
   
    private ClassesType getClassType(String classType){
        if (classType.equalsIgnoreCase("THEORETICAL")){
            return ClassesType.THEORETICAL;
        }else if (classType.equalsIgnoreCase("PRACTICES")){
            return ClassesType.PRACTICES;
        }else if (classType.equalsIgnoreCase("LABORATORY")){
            return ClassesType.LABORATORY;
        }
        return null;
    }

    private DayOfWeek getDayOfWeek(String weekDay){
        if (weekDay.toLowerCase().contains("monday")){
            return DayOfWeek.MONDAY;
        }else if (weekDay.toLowerCase().contains("tuesday")){
            return DayOfWeek.TUESDAY;
        }else if (weekDay.toLowerCase().contains("wednesday")){
            return DayOfWeek.WEDNESDAY;
        }else if (weekDay.toLowerCase().contains("thursday")){
            return DayOfWeek.THURSDAY;
        }else if (weekDay.toLowerCase().contains("friday")){
            return DayOfWeek.FRIDAY;
        }else if (weekDay.toLowerCase().contains("saturday")){
            return DayOfWeek.SATURDAY;
        }
        return null;
    }

    public ClassesType getType() {
        return type;
    }

    public DayOfWeek getWeekDay() {
        return weekDay;
    }

    public int getDuration() {
        return duration;
    }

    public Room getRoom() {
        return room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getWeekLength() {
        return weekLength;
    }
    
}
