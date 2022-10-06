/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

/**
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Degree {
    private String name;
    private DegreeType degreeType;
    private String idCode;
    private int credits;
    private Department department;

    /**This constructor is used to initialize the Degree class's parameters. 
     * 
     * @param name Type: String.
     * @param degreeType Type: String.
     */
    public Degree(String name, String degreeType) {
        if (checkString(name) && checkString(degreeType)){
            name = name.trim();
            degreeType = degreeType.trim();
            if (!startInputs(name, degreeType)){
                this.name = "";
                this.idCode = "";
                this.credits = 0;
            }
        }
    }
    
    private boolean checkString(String string){
        return string != null;
    }
    
    /**This method checks if the start inputs (degree type) are valid.
     * 
     * @param degree Type: String.
     * @param degreeType Type: String.
     * @return returns true if the start inputs are valid.
     */
    private boolean startInputs(String degree, String degreeType){
        if (getDegreeType(degreeType) != null){
            DegreeType type = getDegreeType(degreeType);
            String[] degreeArray = DegreeType.getDegree(type);
            for (int i=0; i < degreeArray.length; i++){
                if (degreeArray[i].equalsIgnoreCase(degree)){
                    this.credits = DegreeType.getCredits(type, i);
                    this.degreeType = getDegreeType(degreeType);
                    this.idCode = getIdCode(degreeArray[i]);
                    this.name = degreeArray[i];
                    this.department = new Department(DegreeType.findDepartment(degree));
                    return true;
                }
            }
        }
        return false;
    }
    
    private DegreeType getDegreeType(String degreeType){
        if (degreeType.equalsIgnoreCase("Licenciatura")){
            return DegreeType.GRADUATE;
        }else if (degreeType.equalsIgnoreCase("Pós-Graduação")){
            return DegreeType.POSTGRADUATE;
        }else if (degreeType.equalsIgnoreCase("Mestrado")){
            return DegreeType.MASTER;
        }
        return null;
    }
    
    private String getIdCode(String degree){
        String temp = getDegreeTypeToString() + degree;
        char[] degreeArray = temp.toCharArray();
        degree = "";
        for (int i = 0; i < degreeArray.length; i++) {
            if(Character.isUpperCase(degreeArray[i])){    
                degree += degreeArray[i];
            }
        }
        return degree;
    }       

    public String getName() {
        return name;
    }

    public String getDegreeTypeToString() {
        if (this.credits != 0){  
            switch (this.degreeType){
                case GRADUATE: 
                    return "Licenciatura";
                case POSTGRADUATE:
                    return "Pós-Graduação";
                case MASTER:
                    return "Mestrado";
            }
        }
        return "";
    }

    public String getIdCode() {
        return idCode;
    }

    public int getCredits() {
        return credits;
    }

    public Department getDepartment() {
        return department;
    }
    
}
