/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.util.Arrays;

/**This class defines the Departments that exist in the school.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Department {
       
    private static int businessSciencesElements = 0;
    private static Teacher[] businessSciencesTeacher = new Teacher[10];
    
    private static int socialSciencesElements = 0;
    private static Teacher[] socialSciencesTeacher = new Teacher[10];
    
    private static int healthElements = 0;
    private static Teacher[] healthTeacher = new Teacher[10];
    
    private static int engineeringTechnologyElements = 0;
    private static Teacher[] engineeringTechnologyTeacher = new Teacher[10];
    
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
                for (int i = 0; i < businessSciencesElements; i++){
                    if (businessSciencesTeacher[i].getName().equalsIgnoreCase(newTeacher.getName())){
                        return false;
                    }
                }
                if (businessSciencesElements > businessSciencesTeacher.length - 3){
                    businessSciencesTeacher = Arrays.copyOf(businessSciencesTeacher, businessSciencesTeacher.length * 2);
                }
                businessSciencesTeacher[businessSciencesElements++] = newTeacher;
                return true;
            }else if (department.toLowerCase().contains("sociais")){
                for (int i = 0; i < socialSciencesElements; i++){
                    if (socialSciencesTeacher[i].getName().equalsIgnoreCase(newTeacher.getName())){
                        return false;
                    }
                }
                if (socialSciencesElements > socialSciencesTeacher.length - 3){
                    socialSciencesTeacher = Arrays.copyOf(socialSciencesTeacher, socialSciencesTeacher.length * 2);
                }
                socialSciencesTeacher[socialSciencesElements++] = newTeacher;
                return true;
            }else if (department.toLowerCase().contains("saúde")){
                for (int i = 0; i < healthElements; i++){
                    if (healthTeacher[i].getName().equalsIgnoreCase(newTeacher.getName())){
                        return false;
                    }
                }
                if (healthElements > healthTeacher.length - 3){
                    healthTeacher = Arrays.copyOf(healthTeacher, healthTeacher.length * 2);
                }
                healthTeacher[healthElements++] = newTeacher;
                return true;
            }else if (department.toLowerCase().contains("engenharia")){
                for (int i = 0; i < engineeringTechnologyElements; i++){
                    if (engineeringTechnologyTeacher[i].getName().equalsIgnoreCase(newTeacher.getName())){
                        return false;
                    }
                }
                if (engineeringTechnologyElements > engineeringTechnologyTeacher.length - 3){
                    engineeringTechnologyTeacher = Arrays.copyOf(engineeringTechnologyTeacher, engineeringTechnologyTeacher.length * 2);
                }
                engineeringTechnologyTeacher[engineeringTechnologyElements++] = newTeacher;
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
                for (int i = 0; i < businessSciencesElements; i++) {
                    temp += businessSciencesTeacher[i].getName() + "\n";
                }
            }else if (name.equalsIgnoreCase("Ciências Sociais, Educação e Desporto")){
                for (int i = 0; i < socialSciencesElements; i++) {
                    temp += socialSciencesTeacher[i].getName() + "\n";
                }
            }else if (name.equalsIgnoreCase("Saúde")){
                for (int i = 0; i < healthElements; i++) {
                    temp += healthTeacher[i].getName() + "\n";
                }
            }else if (name.equalsIgnoreCase("Engenharia e Tecnologia")){
                for (int i = 0; i < engineeringTechnologyElements; i++) {
                    temp += engineeringTechnologyTeacher[i].getName() + "\n";
                }
            }
        }
        return temp;
    }

    public boolean isValid() {
        return valid;
    }
}
