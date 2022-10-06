/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.util.Arrays;

/**This class manages the teacher's class informations.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class TeacherManager {
    
    private static int teacherElements;
    private static Teacher[] teacher;
    static {
        teacherElements = 0;
        teacher = new Teacher[10];
    }
    
    /** This method adds a new teacher in case it didn't exist before.
     * 
     * @param newTeacher Type: String.
     */
    private static void addNewTeacher(String newTeacher){
        System.out.println("Professor não encontrado. Indique as informações do professor "
                            + newTeacher + ".");
        InputReader input = new InputReader();
        int number = input.getIntegerNumber("Número: ");
        String email = input.getText("Email:");
        String department = input.getText("Departamento:");
        String room = input.getText("Sala do professor:");
        if (teacherElements > teacher.length - 3){
            teacher = Arrays.copyOf(teacher, teacher.length * 2);
        }
        teacher[teacherElements++] = new Teacher(newTeacher, number, email, department, room);
        Department.addTeacher(teacher[teacherElements - 1], department);
    }
    
    
    /**This method erases a teacher from the system.
     * 
     * @param deleteTeacher Type: String.
     * @return returns true if a teacher is removed sucessfully.
     */
    public static boolean removeTeacher(String deleteTeacher){
        if (deleteTeacher != null){
            deleteTeacher = deleteTeacher.trim();
            for (int i = 0; i < teacherElements; i++){
                if (teacher[i].getName().equalsIgnoreCase(deleteTeacher)){
                    for (int k = i; i < teacherElements; k++){
                        teacher[k]=teacher[k+1];
                        teacherElements--;
                        System.out.println("Removido com sucesso.");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    /**This method allows us to find a teacher.
     * 
     * @param newTeacher Type: String.
     * @return it returns the name and number of a teacher if exists.
     */
    public static Teacher searchTeacher(String newTeacher){
        if (newTeacher != null){
            newTeacher = newTeacher.trim().replaceAll(" +", " ");
            for (int i = 0; i < teacherElements; i++){
                if (teacher[i].getName().equalsIgnoreCase(newTeacher)){
                    System.out.println("Professor com o mesmo nome encontrado. "
                            + "O professor que introduziu tem o número "
                            + teacher[i].getNumber() + "?");
                    InputReader input = new InputReader();
                    if (input.getText("Resposta").toLowerCase().contains("s")){
                        return teacher[i];
                    }
                }
            }
            addNewTeacher(newTeacher);
            if (teacher[teacherElements - 1].getNumber() != 0){
                return teacher[teacherElements - 1]; 
            }else{
                System.out.println("Professor inválido.");
                teacherElements--;
            }
            return teacher[teacherElements];
        }
        return null;
    }

    /**This method shows us a list of all the teachers of the school.
     * 
     * @return returns the list of teachers.
     */
    public static String allTeachers() {
        String string = "Todas as professores: " + "\n";
        for (int i = 0; i < teacherElements; i++){
            string += teacher[i].getName() + "\n";
        }
        return string;
    }    
}
