/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/**This class manages the student's curricular units.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class CurricularUnit {
    private String name;
    private String id;
    private int semester;
    private int credits;
    private ArrayList<Classes> classes;;
    private ArrayList<Assessments> assessments;
    private Department department;
    private Teacher headTeacher;
    private HashSet<Teacher> teacher;
    
    private Degree degree;

    
    /**This the constructor to the class CurricularUnit. It initializes all the
     * needed parameters for this class.
     * 
     * @param degree Type: Degree.
     * @param name Type: String.
     * @param department Type: String.
     * @param id Type: int.
     * @param semester Type: int.
     * @param credits Type: int.
     */
    public CurricularUnit(Degree degree, String name, String department, 
            String id, int semester, int credits) {
        if (degree != null && checkStrings(name) && checkStrings(department)
                && checkStrings(id) && semester > 0 && credits > 0){
            classes = new ArrayList();
            assessments = new ArrayList();
            teacher = new HashSet();
            this.degree = degree;
            this.name = name;
            this.id = getIDCode(degree);
            this.semester = semester;
            this.credits = getCredits(degree);
            this.department = new Department (department);
        }
    }
    
    private boolean checkStrings(String string){
        return (string != null);
    }
    
    private String getIDCode(Degree degree){
        return degree.getIdCode() + id;
    }
    
    private int getCredits(Degree degree){
        return degree.getCredits();
    }

    
    /**This method adds new classes to a curricular unit. 
     * 
     * @param newClass Type: Classes.
     */
    public void addClasses(Classes newClass){
        if (newClass != null){
            classes.add(newClass);
        }
    }
    
    
    /**This method adds new assessments to a curricular unit.
     * 
     * @param newAssessment Type: Assessments.
     */
    public void addAssessments(Assessments newAssessment){
        if (newAssessment != null){
            assessments.add(newAssessment);
        }
    }
    
    
    /** This method associates/adds a new teacher to a curricular unit.
     * 
     * @param newTeacher Type: String.
     */
    public void addTeacher(String newTeacher){
        if (newTeacher != null){
            if (newTeacher != null){
                teacher.add(TeacherManager.searchTeacher(newTeacher));
            }
        }
    }
    
    
    /**This method associates/adds the responsable teacher for each curricular 
     * unit.
     * 
     * @param newTeacher Type: String.
     */
    public void addHeadTeacher(String newTeacher){
        if (newTeacher != null){
            headTeacher = TeacherManager.searchTeacher(newTeacher);
            addTeacher(newTeacher);
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSemester() {
        return semester;
    }

    public int getCredits() {
        return credits;
    }

    public ArrayList getClasses() {
        return classes;
    }

    public ArrayList getAssessments() {
        return assessments;
    }

    public Department getDepartment() {
        return department;
    }

    public HashSet getTeacher() {
        return teacher;
    }

    public Degree getDegree() {
        return degree;
    }

    public Teacher getHeadTeacher() {
        return headTeacher;
    }  
}
