/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

/**This class is used to diferenciate the types of degrees that the students can
 * take. It also diferenciates the diferent departments that exist.
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