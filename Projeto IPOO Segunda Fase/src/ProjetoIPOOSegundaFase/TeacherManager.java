/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.HashSet;
import java.util.Iterator;

/**This class manages the teacher's class informations.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class TeacherManager {
    
    private static HashSet<Teacher> teacher = new HashSet<>();
    
    
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
        Teacher tempTeacher = new Teacher(newTeacher, number, email, department, room);
        teacher.add(tempTeacher);
        Department.addTeacher(tempTeacher, department);
    }
    
    
    /**This method erases a teacher from the system.
     * 
     * @param deleteTeacher Type: String.
     * @return returns true if a teacher is removed sucessfully.
     */
    public static boolean removeTeacher(String deleteTeacher){
        if (deleteTeacher != null){
            deleteTeacher = deleteTeacher.trim();
            Iterator<Teacher> iterator = teacher.iterator();
            while(iterator.hasNext()) {
                Teacher teacher1 = iterator.next();
                if(teacher1.getName().equalsIgnoreCase(deleteTeacher)){
                    iterator.remove();
                    return true;
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
            for (Teacher teacher1 : teacher) {
                if (teacher1.getName().equalsIgnoreCase(newTeacher)){
                    System.out.println("Professor com o mesmo nome encontrado. "
                            + "O professor que introduziu tem o número "
                            + teacher1.getNumber() + "?");
                    InputReader input = new InputReader();
                    if (input.getText("Resposta").toLowerCase().contains("s")){
                        return teacher1;
                    }
                }
            } 
            addNewTeacher(newTeacher);
            return searchTeacher(newTeacher);
        }
        return null;
    }

    
    /**This method shows us a list of all the teachers of the school.
     * 
     * @return returns the list of teachers.
     */
    public static String allTeachers() {
        String string = "Todas as professores: " + "\n";
        for (Teacher teacher1 : teacher) {
            string += teacher1.getName() + "\n";
        }
        return string;
    }    
}
