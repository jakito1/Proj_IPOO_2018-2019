/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**This class defines and saves students groups.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class StudentGroups {
    private HashSet<Student> studentList;
    private boolean isAlone;
    private CurricularUnit curricularUnit;

    
    
    /**This is the constructor for the StudentGroups class. It initializes the 
     * class's needed parameters.
     * 
     * @param curricularUnit Type: CurricularUnit.
     * @param isAlone Type: boolean.
     */
    public StudentGroups(CurricularUnit curricularUnit, boolean isAlone) {
        if (curricularUnit != null){
            studentList = new HashSet<>();
            this.curricularUnit = curricularUnit;  
            this.isAlone = isAlone;
        }
    }
    
    
    /**This method adds a student to a group. If there's only the added student
     * the number of elements becomes 1.
     * 
     * @param student Type: Student.
     */
    public void addStudent(Student student){
        if (isAlone){
            studentList.clear();
            studentList.add(student);
        }else{
            if (studentList.size() < 10){
                studentList.add(student);
            }
        }
    }
    
    
    /**This method removes a student from a group.
     * 
     * @return returns true when a student is removed from the group list
     * sucessfully.
     */
    public boolean removeStudent(String deleteStudent){
        deleteStudent = deleteStudent.trim();
        Iterator<Student> iterator = studentList.iterator();
            while(iterator.hasNext()) {
                Student student1 = iterator.next();
                if(student1.getName().equalsIgnoreCase(deleteStudent)){
                    iterator.remove();
                    return true;
                }
            }
        return false;
    }

    public HashSet getStudentList() {
        return studentList;
    }

    public boolean isIsAlone() {
        return isAlone;
    }

    public CurricularUnit getCurricularUnit() {
        return curricularUnit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.studentList);
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
        final StudentGroups other = (StudentGroups) obj;
        if (!Objects.equals(this.studentList, other.studentList)) {
            for (Student student1 : this.studentList) {
                for (Student student2 : other.studentList) {
                    if (student1.getNumber() == student2.getNumber())
                        return true;
                }
            }
            return false;
        }
        return true;
    }
}
