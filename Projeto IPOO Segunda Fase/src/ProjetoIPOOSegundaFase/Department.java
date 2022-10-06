/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.ArrayList;
import java.util.Arrays;

/**This class defines the Departments that exist in the school.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Department {
       
    private static ArrayList<Teacher> businessSciencesTeacher = new ArrayList();
    private static ArrayList<Teacher> socialSciencesTeacher = new ArrayList();
    private static ArrayList<Teacher> healthTeacher = new ArrayList();
    private static ArrayList<Teacher> engineeringTechnologyTeacher = new ArrayList();
    
    private String name;
    private boolean valid;

    
    /**This constructor initializes the needed parameters for the functionality 
     * of the department class.
     * 
     * @param name Type: String.
     */
    public Department(String name) {
        this.valid = false;
        this.name = "";
        if (name != null){
            this.name = getDepartmentName(name);
        }
    }

    /**
     * 
     * @param department
     * @return returns the name of an existent department or "" if the chosen 
     * department doesn't exist.
     */
    private String getDepartmentName(String department){
        if (department.toLowerCase().contains("empresariais")){
            valid = true;
            return "Ciências Empresariais";
        }else if (department.toLowerCase().contains("sociais")){
            valid = true;
            return "Ciências Sociais, Educação e Desporto";
        }else if (department.toLowerCase().contains("saúde")){
            valid = true;
            return "Saúde";
        }else if (department.toLowerCase().contains("engenharia")){
            valid = true;
            return "Engenharia e Tecnologia";
        }
        return "";
    }
    
    
   /**This method adds a teacher to a chosen department.
     * 
     * @param newTeacher Type: Teacher.
     * @param department Type: String.
     * @return returns true when the new teacher is sucessfully added to its
     * department.
     */
    public static boolean addTeacher(Teacher newTeacher, String department){
        if (newTeacher != null && department != null){
            if (department.toLowerCase().contains("empresariais")){
                if (businessSciencesTeacher.contains(newTeacher)){
                    return false;
                }
                businessSciencesTeacher.add(newTeacher);
                return true;
            }else if (department.toLowerCase().contains("sociais")){
                if (socialSciencesTeacher.contains(newTeacher)){
                    return false;
                }
                socialSciencesTeacher.add(newTeacher);
                return true;
            }else if (department.toLowerCase().contains("saúde")){
                if (healthTeacher.contains(newTeacher)){
                    return false;
                }
                healthTeacher.add(newTeacher);
                return true;
            }else if (department.toLowerCase().contains("engenharia")){
                if (engineeringTechnologyTeacher.contains(newTeacher)){
                    return false;
                }
                engineeringTechnologyTeacher.add(newTeacher);
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
    
    public String getDegrees(){
        String temp = "";
        if (valid){
            if (name.equalsIgnoreCase("Ciências Empresariais")){
                for (String returnString : GeneralInformation.BUSINESSSCIENCES) {
                    temp += returnString + "\n"; 
                }
            }else if (name.equalsIgnoreCase("Ciências Sociais, Educação e Desporto")){
                for (String returnString : GeneralInformation.SOCIALSCIENCES) {
                    temp += returnString + "\n"; 
                }
            }else if (name.equalsIgnoreCase("Saúde")){
                for (String returnString : GeneralInformation.HEALTH) {
                    temp += returnString + "\n"; 
                }
            }else if (name.equalsIgnoreCase("Engenharia e Tecnologia")){
                for (String returnString : GeneralInformation.ENGINEERINGTECHNOLOGY) {
                    temp += returnString + "\n";
                }
            }
        }
        return temp;
    }
    
    public String getTeachers(){
        String temp = "";
        if (valid){
            if (name.equalsIgnoreCase("Ciências Empresariais")){
                for (int i = 0; i < businessSciencesTeacher.size(); i++) {
                    temp += businessSciencesTeacher.get(i).getName() + "\n";
                }
            }else if (name.equalsIgnoreCase("Ciências Sociais, Educação e Desporto")){
                for (int i = 0; i < socialSciencesTeacher.size(); i++) {
                    temp += socialSciencesTeacher.get(i).getName() + "\n";
                }
            }else if (name.equalsIgnoreCase("Saúde")){
                for (int i = 0; i < healthTeacher.size(); i++) {
                    temp += healthTeacher.get(i).getName() + "\n";
                }
            }else if (name.equalsIgnoreCase("Engenharia e Tecnologia")){
                for (int i = 0; i < engineeringTechnologyTeacher.size(); i++) {
                    temp += engineeringTechnologyTeacher.get(i).getName() + "\n";
                }
            }
        }
        return temp;
    }

    public boolean isValid() {
        return valid;
    }
}
