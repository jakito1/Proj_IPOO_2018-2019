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
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class CurricularUnit {
    private String name;
    private String id;
    private int semester;
    private int credits;
    private Classes[] classes;
    private int classesElements;
    private Assessments[] assessments;
    private int assessmentsElements;
    private Department department;
    private Teacher headTeacher;
    private Teacher[] teacher;
    private int teacherElements;
    
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
            classes = new Classes[10];
            classesElements = 0;
            assessments = new Assessments[10];
            assessmentsElements = 0;
            teacher = new Teacher[10];
            teacherElements = 0;
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
            if (classesElements > classes.length - 3){
                classes = Arrays.copyOf(classes, classes.length * 2);
            }
            classes[classesElements++] = newClass;
        }
    }
    
    /**This method adds new assessments to a curricular unit.
     * 
     * @param newAssessment Type: Assessments.
     */
    public void addAssessments(Assessments newAssessment){
        if (newAssessment != null){
            if (assessmentsElements > assessments.length - 3){
                assessments = Arrays.copyOf(assessments, assessments.length * 2);
            }
            assessments[assessmentsElements++] = newAssessment;
        }
    }
    
    /** This method associates/adds a new teacher to a curricular unit.
     * 
     * @param newTeacher Type: String.
     */
    public void addTeacher(String newTeacher){
        if (newTeacher != null){
            for (int i = 0; i < teacherElements; i++){
                if (!teacher[i].getName().equalsIgnoreCase(newTeacher)){
                    if (teacherElements > teacher.length - 3){
                        teacher = Arrays.copyOf(teacher, teacher.length * 2);
                    }
                    teacher[teacherElements++] = TeacherManager.searchTeacher(newTeacher);
                }
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

    public Classes[] getClasses() {
        return classes;
    }

    public int getClassesElements() {
        return classesElements;
    }

    public Assessments[] getAssessments() {
        return assessments;
    }

    public int getAssessmentsElements() {
        return assessmentsElements;
    }

    public Department getDepartment() {
        return department;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public Degree getDegree() {
        return degree;
    }

    public Teacher getHeadTeacher() {
        return headTeacher;
    }

    public int getTeacherElements() {
        return teacherElements;
    }
}