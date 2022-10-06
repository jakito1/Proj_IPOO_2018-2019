/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

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
    private HashSet<CurricularUnit> curricularUnitList;
    private ArrayList<Teacher> teacherList;
    private HashSet<StudentGroups> studentGroupsList;
    
    
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
                curricularUnitList = new HashSet<>();
                teacherList = new ArrayList<>();
                studentGroupsList = new HashSet<>();
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
            curricularUnitList.add(newCurricularUnit);
        }
    }
    
    
    /**This method adds a new teacher to a schedule.
     * 
     * @param newTeacher Type: String.
     */
    public void addTeacher(String newTeacher){
        if (newTeacher != null){
            teacherList.add(TeacherManager.searchTeacher(newTeacher));
        }
    }
    
    
    /** This method adds a new student group to a schedule. 
     * 
     * @param newStudentGroup Type: StudentsGroups.
     */
    public void addStudentGroups(StudentGroups newStudentGroup){
        if (newStudentGroup != null){
            studentGroupsList.add(newStudentGroup);
        }
    }
    
    
    /**This method removes a student group from a schedule.
     * 
     * @return returns true when the position of a group is valid (belongs to the 
     * index).
     */
    public boolean removeGroup(Student student){
        Iterator<StudentGroups> iterator = studentGroupsList.iterator();
            while(iterator.hasNext()) {
                StudentGroups studentGroups1 = iterator.next();
                if (studentGroups1.getStudentList().contains(student)){
                    iterator.remove();
                    return true;
                }
            }
        return false;
    }
    
    public int getTotalCredits(){
        int credits = 0;
        for (CurricularUnit curricularUnit1 : curricularUnitList) {
            credits += curricularUnit1.getCredits();
        }
        return credits;
    }
    
    public int getTotalClassesDuration(){
        int duration = 0;
        for (CurricularUnit curricularUnit1 : curricularUnitList) {
            ArrayList<Classes> tempClasses = curricularUnit1.getClasses();
            for (Classes tempClasses1 : tempClasses) {
                duration += tempClasses1.getDuration() * tempClasses1.getWeekLength();
            }
        }
        return duration;
    }
    
    public ArrayList getAllAssessments(){
        ArrayList<Assessments> returnList = new ArrayList();
        for (CurricularUnit curricularUnit1 : curricularUnitList) {
            ArrayList<Assessments> tempAssessments = curricularUnit1.getAssessments();
            returnList.addAll(tempAssessments);
        }
        return returnList;
    }
    
    public Date getStartSemester() {
        return startSemester;
    }

    public Date getEndSemester() {
        return endSemester;
    }

    public HashSet getCurricularUnitList() {
        return curricularUnitList;
    }


    public ArrayList getTeacherList() {
        return teacherList;
    }


    public HashSet getStudentGroupsList() {
        return studentGroupsList;
    }

    
    public boolean isEvenSemester(){
        return evenSemester;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.curricularUnitList);
        hash = 47 * hash + Objects.hashCode(this.studentGroupsList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Schedule other = (Schedule) obj;
        if (!Objects.equals(this.curricularUnitList, other.curricularUnitList)) {
            for (CurricularUnit curricularUnit1 : this.curricularUnitList) {
                for (CurricularUnit curricularUnit2 : other.curricularUnitList) {
                    if (curricularUnit1.getName().equalsIgnoreCase(curricularUnit2.getName()) &&
                            curricularUnit1.getId().equalsIgnoreCase(curricularUnit2.getId())){
                        return true;
                    }
                        
                }
            }
            return false;
        }
        if (!Objects.equals(this.studentGroupsList, other.studentGroupsList)) {
            for (StudentGroups studentGroups1 : this.studentGroupsList) {
                for (StudentGroups studentGroups2 : other.studentGroupsList) {
                    if (studentGroups1.getStudentList().containsAll(studentGroups2.getStudentList())){
                        return true;
                    }   
                }
            }
            return false;
        }
        return true;
    }
    
    
}
