/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.util.Arrays;

/**This class is used to manage the schedules and defining how the schedule 
 * works.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Schedule {
    private Date startSemester;
    private Date endSemester;
    private boolean evenSemester;
    private CurricularUnit[] curricularUnitList;
    private int curricularUnitElements;
    private Teacher[] teacherList;
    private int teacherElements;
    private StudentGroups[] studentGroupsList;
    private int studentGroupsElements;
    
    
    /**This is the Class Schecule constructor. It initializes its parameters 
     *(arrays to add new curricular units and teachers, etc).
     * 
     * @param startSemester Type: String (it represents the begging of a
     * semester).
     * @param endSemester Type: String. (it represents the ending of a semester). 
     */
    public Schedule (String startSemester, String endSemester){
        if (startSemester != null && endSemester != null){
            if (isBefore(startSemester, endSemester)){
                curricularUnitList = new CurricularUnit[10];
                curricularUnitElements = 0;
                teacherList = new Teacher[10];
                teacherElements = 0;
                studentGroupsList = new StudentGroups[10];
                studentGroupsElements = 0;
                this.startSemester = new Date(startSemester);
                this.endSemester = new Date(endSemester);
                this.evenSemester = !getEvenSemester();
            }
        }
    }
    
    /**This method creates two temporary dates and checks which one is first 
     * (the startSemester and endSemester).
     * 
     * @param startSemester Type: String.
     * @param endSemester Type: String.
     * @return returns 0 or -1 if the star of the semester is before the end of
     * the semester.
     */
    private boolean isBefore(String startSemester, String endSemester){
        Date tempStartSemester = new Date(startSemester);
        Date tempEndSemester = new Date(endSemester);
        int comp = tempStartSemester.compareDates(tempStartSemester.getLocalDate(), tempEndSemester.getLocalDate());
        return comp < 0;
    }
    

    private boolean getEvenSemester(){
        int tempStartMonth = this.startSemester.getMonth();
        int tempEndMonth = this.endSemester.getMonth();
        return (tempStartMonth > 8 && tempEndMonth < 3);
    }
    
    /**This method adds a new curricular unit to a schedule.
     * 
     * @param newCurricularUnit  Type: CurricularUnit.
     */
    public void addCurricularUnit(CurricularUnit newCurricularUnit){
        if (newCurricularUnit != null){
            if (curricularUnitElements > curricularUnitList.length - 3){
                curricularUnitList = Arrays.copyOf(curricularUnitList, curricularUnitList.length * 2);
            }
            curricularUnitList[curricularUnitElements++] = newCurricularUnit;
        }
    }
    
    /**This method adds a new teacher to a schedule.
     * 
     * @param newTeacher Type: String.
     */
    public void addTeacher(String newTeacher){
        if (newTeacher != null){
            if (teacherElements > teacherList.length - 3){
                teacherList = Arrays.copyOf(teacherList, teacherList.length * 2);
            }
            teacherList[teacherElements++] = TeacherManager.searchTeacher(newTeacher);
        }
    }
    
    /** This method adds a new student group to a schedule. 
     * 
     * @param newStudentGroup Type: StudentsGroups.
     */
    public void addStudentGroups(StudentGroups newStudentGroup){
        if (newStudentGroup != null){
            if (studentGroupsElements > teacherList.length - 3){
                studentGroupsList = Arrays.copyOf(studentGroupsList, studentGroupsList.length * 2);
            }
            studentGroupsList[studentGroupsElements++] = newStudentGroup;
        }
    }
    
    /**This method removes a student group from a schedule.
     * 
     * @param position Type: int.
     * @return returns true when the position of a group is valid (belongs to the 
     * index).
     */
    public boolean removeGroup(int position){
        for (int i = position; i < studentGroupsElements; i++){
            studentGroupsList[i]=studentGroupsList[i+1];
            studentGroupsElements--;
            return true;
        }
    return false;
    }
    
  
    public int getTotalCredits(){
        int credits = 0;
        for (int i = 0; i < curricularUnitElements; i++){
            credits += curricularUnitList[i].getCredits();
        }
        return credits;
    }
    
    public int getTotalClassesDuration(){
        int duration = 0;
        for (int i = 0; i < curricularUnitElements; i++){
            Classes[] tempClasses = curricularUnitList[i].getClasses();
            for (int k = 0; k < curricularUnitList[i].getClassesElements(); k++){
                duration += tempClasses[k].getDuration() * tempClasses[k].getWeekLength();
            }
        }
        return duration;
    }
    
    public Assessments[] getAllAssessments(){
        Assessments[] returnList = new Assessments[100];
        for (int i = 0; i < curricularUnitElements; i++){
            Assessments[] tempAssessments = curricularUnitList[i].getAssessments();
            returnList = concatenate(returnList, tempAssessments);
        }
        return returnList;
    }
    
    private Assessments[] concatenate(Assessments[] first, Assessments[] second){
	Assessments[] temp = new Assessments[first.length + second.length];
	System.arraycopy(first, 0, temp, 0, first.length);
	System.arraycopy(second, 0, temp, first.length, second.length);
	return temp;
    }

    public Date getStartSemester() {
        return startSemester;
    }

    public Date getEndSemester() {
        return endSemester;
    }

    public CurricularUnit[] getCurricularUnitList() {
        return curricularUnitList;
    }

    public int getCurricularUnitElements() {
        return curricularUnitElements;
    }

    public Teacher[] getTeacherList() {
        return teacherList;
    }

    public int getTeacherElements() {
        return teacherElements;
    }

    public StudentGroups[] getStudentGroupsList() {
        return studentGroupsList;
    }

    public int getStudentGroupsElements() {
        return studentGroupsElements;
    }
    
    public boolean isEvenSemester(){
        return evenSemester;
    }
}
