/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

/**This class manages the agenda's assessments.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Assessments {
    private String type;
    private Timetable timetable;
    private String description;
    private Room room;
    private InputReader input;

    /** Constructor for Assessments Class (parameters initialization).
     * 
     * @param type Type: String.
     * @param room Type: String.
     */
    public Assessments(String type, String room) {
        if (type != null && room != null){
            input = new InputReader();
            this.type = checkType(type);
            this.room = RoomManager.searchRoom(room);
            setTimeTable();
            this.description = wantDescription();
        }
    }
    
    
    /**This method is used to set a schedule (which can be done in 2 ways).
     * 
     */
    private void setTimeTable(){
        System.out.println("Escolha como quer definir o horário:");
        System.out.println("1: Data de inicio, hora de inicio e duração do evento.");
        System.out.println("2: Data de inicio, hora de inicio, data do fim e hora do fim.");
        int answer = input.getIntegerNumber("Opção: ");
        switch (answer) {
            case 1:
                timetable = new Timetable (input.getText("Data de inicio:").trim(),
                        input.getText("Hora de inicio:").trim(), 
                        input.getIntegerNumber("Duração do evento:"));
                break;
            case 2:
                timetable = new Timetable (input.getText("Data de inicio:").trim(),
                        input.getText("Hora de inicio:").trim(), 
                        input.getText("Data de fim:").trim(),
                        input.getText("Hora de fim:").trim());
                break;
            default:
                System.out.println("Escolha inválida. Escolhida opção default.");
                timetable = new Timetable (input.getText("Data de inicio:").trim(),
                        input.getText("Hora de inicio:").trim(), 
                        input.getText("Data de fim:").trim(),
                        input.getText("Hora de fim:").trim());
                break;
        }
    }
    
    
    /**This method allows to insert a description.
     * 
     * @return returns description if we choose to insert one and it returns ""
     * when we choose not to insert one.
     */    
    private String wantDescription(){
        System.out.println("Gostaria de inserir uma descrição?");
        String answer = input.getText("Resposta: ");
        if (answer.contains("S") || answer.contains("s")){
            String tempDescription = input.getText("Descrição: ");
            if (tempDescription != null){
                return tempDescription;
            }
        }
        return "";
    }
       
    
    /**This methods identifies the type of evaluation.
     * 
     * @param type Type: String.
     * @return returns the type of evaluation. If the chosen one isn't an option
     * it returns "".
     */
    private String checkType(String type){
        type = type.trim();
        if (type.equalsIgnoreCase("Teste")){
            return "Teste";
        }else if (type.equalsIgnoreCase("Exame")){
            return "Exame";
        }else if (type.equalsIgnoreCase("Apresentação")){
            return "Apresentação";            
        }else if (type.equalsIgnoreCase("Entrega de Projeto")){
            return "Entrega de Projeto";
        }
        return "";
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Room getRoom() {
        return room;
    }

    public Timetable getTimetable() {
        return timetable;
    }
}
