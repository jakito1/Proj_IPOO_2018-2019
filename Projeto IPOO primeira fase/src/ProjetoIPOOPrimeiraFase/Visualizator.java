/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.util.Arrays;

/**
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 */
public class Visualizator {
    private Teacher[] teacherList;
    private int teacherElements;
    private Student[] studentList;
    private int studentElements;
    private Room[] roomList;
    private int roomElements;
    private CurricularUnit[] curricularUnitList;
    private int curricularUnitElements;
    private Assessments[] assesmentsList;
    private int assessmentElements;
    private StudentGroups[] studentGroupsList;
    private int studentGroupsElements;
    
    public Visualizator(){
        teacherList = new Teacher[10];
        teacherElements = 0;
        studentList = new Student[10];
        studentElements = 0;
        roomList = new Room[10];
        roomElements = 0;
        curricularUnitList = new CurricularUnit[10];
        curricularUnitElements = 0;
        assesmentsList = new Assessments[10];
        assessmentElements = 0;
        studentGroupsList = new StudentGroups[10];
        studentGroupsElements = 0;
    }
    
    public void addTeacher(String teacher){
        if (teacherElements > teacherList.length - 3){
            teacherList = Arrays.copyOf(teacherList, teacherList.length * 2);
        }
        teacherList[teacherElements] = TeacherManager.searchTeacher(teacher);
        teacherElements++;
    }
    
    public void addStudent(String name, int number, String birthDate, char genre, 
            String degree, String degreeType){
        if (studentElements > studentList.length - 3){
            studentList = Arrays.copyOf(studentList, studentList.length * 2);
        }
        studentList[studentElements] = new Student(name, number, birthDate, genre,
        degree, degreeType);
        studentElements++;
    }
    
    public void addRoom(String room){
        if (roomElements > roomList.length - 3){
            roomList = Arrays.copyOf(roomList, roomList.length * 2);
        }
        roomList[roomElements] = RoomManager.searchRoom(room);
        roomElements++;
    }
    
    public void addcurricularUnit(Degree degree, String name, String department, 
            String id, int semester, int credits){
        if (curricularUnitElements > curricularUnitList.length - 3){
            curricularUnitList = Arrays.copyOf(curricularUnitList, curricularUnitList.length * 2);
        }
        curricularUnitList[curricularUnitElements] = new CurricularUnit(degree,
        name, department, id, semester, credits);
        curricularUnitElements++;
    }
    
    public void addAssessments(){
        if (assessmentElements > assesmentsList.length - 3){
            assesmentsList = Arrays.copyOf(assesmentsList, assesmentsList.length * 2);
        }
        for (int i = 0; i < curricularUnitElements; i++){
            Assessments[]  tempAssessments = new Assessments[curricularUnitList[i].getAssessmentsElements()];
            for (int j = 0; j < curricularUnitList[i].getAssessmentsElements(); j++) {
                assesmentsList[assessmentElements] = tempAssessments[j];
                assessmentElements++;
            } 
        }
    }
    
    public void addstudentGroups(){
        if (studentGroupsElements > studentGroupsList.length - 3){
            studentGroupsList = Arrays.copyOf(studentGroupsList, studentGroupsList.length * 2);
        }
        for (int i = 0; i < studentGroupsElements; i++) {
            Schedule[] tempSchedule = new Schedule[studentList[i].getCurricularUnitElements()];
            for (int j = 0; j < tempSchedule[i].getStudentGroupsElements(); j++) {
                StudentGroups[] tempStudentGroups = new StudentGroups[tempSchedule[j].getStudentGroupsElements()];
                for (int k = 0; k < tempSchedule[j].getStudentGroupsElements(); k++) {
                    studentGroupsList[studentGroupsElements] = tempStudentGroups[k];
                    studentGroupsElements++;
                }
            }
        }
    }

    public Teacher[] getTeacherList() {
        return teacherList;
    }

    public int getTeacherElements() {
        return teacherElements;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public int getStudentElements() {
        return studentElements;
    }

    public Room[] getRoomList() {
        return roomList;
    }

    public int getRoomElements() {
        return roomElements;
    }

    public CurricularUnit[] getCurricularUnitList() {
        return curricularUnitList;
    }

    public int getCurricularUnitElements() {
        return curricularUnitElements;
    }

    public Assessments[] getAssesmentsList() {
        return assesmentsList;
    }

    public int getAssessmentElements() {
        return assessmentElements;
    }

    public StudentGroups[] getStudentGroupsList() {
        return studentGroupsList;
    }

    public int getStudentGroupsElements() {
        return studentGroupsElements;
    }
}
