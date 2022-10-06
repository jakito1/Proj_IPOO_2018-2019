/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

/**This class is used to diferenciate the types of degrees that the students can
 * take. It also diferenciates the diferent departments that exist. 
 * An enumerator is used to this class purpose to show degree types.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public enum DegreeType {
    GRADUATE, POSTGRADUATE, MASTER;
    
    public static String[] getDegree(DegreeType degreeType){
        switch (degreeType){
            case GRADUATE:
                return GeneralInformation.GRADUATE;
            case POSTGRADUATE:
                return GeneralInformation.POSTGRADUATE;
            case MASTER:
                return GeneralInformation.MASTER;
        }
        return null;
    }
    
    
    /**
     * 
     * @param degree Type: String
     * @return returns the department associated to a degree.
     */
    public static String findDepartment (String degree){
        for (String department : GeneralInformation.BUSINESSSCIENCES) {
            if (degree.equalsIgnoreCase(department)){
                return "Ciências Empresariais";
            }
        }
        for (String department : GeneralInformation.SOCIALSCIENCES) {
            if (degree.equalsIgnoreCase(department)){
                return "Ciências Sociais, Educação e Desporto";
            }
        }
        for (String department : GeneralInformation.HEALTH) {
            if (degree.equalsIgnoreCase(department)){
                return "Saúde";
            }
        }
        for (String department : GeneralInformation.ENGINEERINGTECHNOLOGY) {
            if (degree.equalsIgnoreCase(department)){
                return "Engenharia e Tecnologia";
            }
        }
        return "";
    }
    
    /**
     * 
     * @param degreeType
     * @param i
     * @return Returns the credits of a chosen type of degree.
     */
    public static int getCredits(DegreeType degreeType, int i){
        switch (degreeType){
            case GRADUATE:
                return GeneralInformation.GRADUATECREDITS[i];
            case POSTGRADUATE:
                return GeneralInformation.POSTGRADUATECREDITS[i];
            case MASTER:
                return GeneralInformation.MASTERCREDITS[i];
        }
        return 0;
    }
}