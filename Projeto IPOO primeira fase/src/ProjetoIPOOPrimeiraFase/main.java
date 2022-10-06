/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Date date1 = new Date("29/05/2018");
//        int day = date1.getDay();
//        int month = date1.getMonth();
//        int year = date1.getYear();
//        System.out.println(day);
//        System.out.println(month);
//        System.out.println(year);
//        
//        Date date = new Date("2018-02-20");
//        int day = date.getDay();
//        int month = date.getMonth();
//        int year = date.getYear();
//        String fullDate = date.getFullDate();
//        System.out.println(day);
//        System.out.println(month);
//        System.out.println(year);
//        System.out.println(fullDate);
//        
//        System.out.println("");
//        System.out.println("");
//        
//        String sala = "f123 ";
//        char zone1 = RoomManager.searchRoom(sala).getZone();
//        int floor1 = RoomManager.searchRoom(sala).getFloor();
//        int roomNumber1 = RoomManager.searchRoom(sala).getRoomNumber();
//        int capacity1 = RoomManager.searchRoom(sala).getCapacity();
//        String fullroom1 = RoomManager.searchRoom(sala).getFullRoomNumber();
//        System.out.println(zone1);
//        System.out.println(floor1);
//        System.out.println(roomNumber1);
//        System.out.println(capacity1);
//        System.out.println(fullroom1);
//        System.out.println(RoomManager.searchRoom("F222").getFullRoomNumber()); 
//        System.out.println(RoomManager.searchRoom("F223").getFullRoomNumber());
//        RoomManager.removeRoom("F222");
//        System.out.println(RoomManager.searchRoom("F224").getFullRoomNumber());
//        System.out.println(RoomManager.searchRoom("F221").getFullRoomNumber());
//        System.out.println(RoomManager.allRooms());
//        
//        System.out.println("");
//        System.out.println("");
// 
//        Degree degree1 = new Degree("Engenharia informática", "licenciatura");
//        String degreeName = degree1.getName();
//        String degreeType = degree1.getDegreeTypeToString();
//        String degreeID = degree1.getIdCode();
//        String department = degree1.getDepartment();
//        int credits = degree1.getCredits();
//        System.out.println(degreeName);
//        System.out.println(degreeType);
//        System.out.println(degreeID);
//        System.out.println(department);
//        System.out.println(credits);
//        
//        System.out.println("");
//        System.out.println("");
//        
//        Assessments assessment = new Assessments("exame ", " F253");
//        String type = assessment.getType();
//        String assessmentRoom = assessment.getRoom().getFullRoomNumber();
//        String assessmentStartDate = assessment.getTimeTable().getStartDate().getFullDate();
//        String assessmentEndDate = assessment.getTimeTable().getEndDate().getFullDate();
//        String assessmentStartHour = assessment.getTimeTable().getFullStartDate();
//        String assessmentEndHour = assessment.getTimeTable().getFullEndDate();
//        int duration = assessment.getTimeTable().getDuration();
//        String assessmentDescription = assessment.getDescription();
//        System.out.println(type);
//        System.out.println(assessmentRoom);
//        System.out.println(assessmentStartDate);
//        System.out.println(assessmentEndDate);
//        System.out.println(assessmentStartHour);
//        System.out.println(assessmentEndHour);
//        System.out.println(duration);
//        System.out.println(assessmentDescription);
//        
//        System.out.println("");
//        System.out.println("");
//        
//        Timetable timetable = new Timetable("28//04/2018", "23:57", 90);
//        int startHour = timetable.getStartHour();
//        int startMinute = timetable.getStartMinute();
//        int endHour = timetable.getEndHour();
//        int endMinute = timetable.getEndMinute();
//        int duration = timetable.getDuration();
//        String startDate = timetable.getStartDate().getFullDate();
//        String endDate = timetable.getEndDate().getFullDate();
//        System.out.println(startHour);
//        System.out.println(startMinute);
//        System.out.println(startDate);
//        System.out.println(endHour);
//        System.out.println(endMinute);
//        System.out.println(endDate);
//        System.out.println(duration);
//
//        Timetable timetable = new Timetable("28//04/2018", "23:57", "29/04/2018", "23:58");
//        int startHour = timetable.getStartHour();
//        int startMinute = timetable.getStartMinute();
//        int endHour = timetable.getEndHour();
//        int endMinute = timetable.getEndMinute();
//        int duration = timetable.getDuration();
//        String startDate = timetable.getStartDate().getFullDate();
//        String endDate = timetable.getEndDate().getFullDate();
//        System.out.println(startHour);
//        System.out.println(startMinute);
//        System.out.println(startDate);
//        System.out.println(endHour);
//        System.out.println(endMinute);
//        System.out.println(endDate);
//        System.out.println(duration);
//
//
//        String name = TeacherManager.searchTeacher(" Ana  Sousa").getName();
//        int number = TeacherManager.searchTeacher(" Ana  Sousa").getNumber();
//        String email = TeacherManager.searchTeacher(" Ana  Sousa").getEmail();
//        String inicials = TeacherManager.searchTeacher(" Ana  Sousa").getInicials();
//        String department = TeacherManager.searchTeacher(" Ana  Sousa").getDepartment().getDegrees();
//        String timetable = TeacherManager.searchTeacher(" Ana  Sousa").getTimetable().getFullStartDate();
//        String room = TeacherManager.searchTeacher(" Ana  Sousa").getRoom().getFullRoomNumber();
//        System.out.println(name);
//        System.out.println(number);
//        System.out.println(email);
//        System.out.println(inicials);
//        System.out.println(department);
//        System.out.println(timetable);
//        System.out.println(room);
//        
//        String name1 = TeacherManager.searchTeacher(" Ana  Sousa").getName();
//        int number1 = TeacherManager.searchTeacher(" Ana  Sousa").getNumber();
//        String email1 = TeacherManager.searchTeacher(" Ana  Sousa").getEmail();
//        String inicials1 = TeacherManager.searchTeacher(" Ana  Sousa").getInicials();
//        String department1 = TeacherManager.searchTeacher(" Ana  Sousa").getDepartment().getTeachers();
//        String timetable1 = TeacherManager.searchTeacher(" Ana  Sousa").getTimetable().getFullStartDate();
//        String room1 = TeacherManager.searchTeacher(" Ana  Sousa").getRoom().getFullRoomNumber();
//        System.out.println(name1);
//        System.out.println(number1);
//        System.out.println(email1);
//        System.out.println(inicials1);
//        System.out.println(department1);
//        System.out.println(timetable1);
//        System.out.println(room1);
//        
//        System.out.println();
//        
//        Teacher teacher = new Teacher("ana   sousa", 00001, "francisco.moura23@yahoo.com.br");
//        String name = teacher.getName();
//        String initials = teacher.getInicials();
//        String email = teacher.getEmail();
//        int number = teacher.getNumber();
//        System.out.println(name);
//        System.out.println(initials);
//        System.out.println(email);
//        System.out.println(number);
//      
//
//            Classes classes = new Classes("THEORETICAL", "monday", 60, "f123", "ana sousa", 15);
//            System.out.println(classes.getDuration());
//            System.out.println(classes.getType());
//            System.out.println(classes.getWeekDay());
//            System.out.println(classes.getDuration());
//            System.out.println(classes.getRoom().getFullRoomNumber());
//            System.out.println(classes.getTeacher().getName());
//            System.out.println(classes.getWeekLength());
    }
}
