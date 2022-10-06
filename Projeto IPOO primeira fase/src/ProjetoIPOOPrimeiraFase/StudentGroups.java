/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

/**This class defines and saves students groups.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class StudentGroups {
    private Student[] studentList;
    private int numberElements;
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
            studentList = new Student[10];
            numberElements = 0;
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
            studentList[0] = student;
            numberElements = 1;
        }else{
            if (numberElements < 10){
                studentList[numberElements++] = student;
            }
        }
    }
    
    /**This method removes a student from a group.
     * 
     * @param studentName Type: String.
     * @return returns true when a student is removed from the group list
     * sucessfully.
     */
    public boolean removeStudent(String studentName){
        studentName = studentName.trim();
        if (isAlone){
            studentList[0] = null;
            numberElements = 0;
            return true;
        }else{
            for (int i = 0; i < numberElements; i++){
                if (studentList[i].getName().equalsIgnoreCase(studentName)){
                    for (int k = i; i < numberElements; k++){
                        studentList[k]=studentList[k+1];
                        numberElements--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public int getNumberElements() {
        return numberElements;
    }

    public boolean isIsAlone() {
        return isAlone;
    }

    public CurricularUnit getCurricularUnit() {
        return curricularUnit;
    }
}
