/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

/**This class is used to diferenciate the types of classes that the students 
 * will have.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public enum ClassesType {
    THEORETICAL, PRACTICES, LABORATORY;

    @Override
    public String toString() {
        switch (this){
            case THEORETICAL:
                return "Theoretical";
            case PRACTICES:
                return "Practices";
            case LABORATORY:
                return "Laboratory";
        }
        return "";
    }
    
    
}
