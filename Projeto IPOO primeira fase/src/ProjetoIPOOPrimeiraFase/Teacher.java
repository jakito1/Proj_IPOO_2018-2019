/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

/**This class defines and saves teachers information.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Teacher {
    private String name;
    private int number;
    private String email;
    private String inicials;
    private Department department;
    private Timetable timetable;
    private Room room;
 
    /**This constructor initializes the needed Teacher's class parameters.
     * 
     * @param name Type: String.
     * @param number Type: int.
     * @param email Type: String.
     * @param department Type: String.
     * @param room Type: String.
     */
    public Teacher(String name, int number, String email, String department, String room) {
        if (name != null && email != null && department != null && room != null && number > 0){
            this.name = "";
            this.number = 0;
            this.email = "";
            this.inicials = "";
            email = email.trim();
            if (validateName(name) && validateEmail(email)){
                this.name = name;
                this.number = number;
                this.email = email;
                this.inicials = getInicials(name);
                this.department = new Department(department);
                setTimeTable();
                this.room = RoomManager.searchRoom(room);
            }
        }
    }
    
    /**This method checks and validates if the correct caracters are being used
     * for the name of a teacher.
     * 
     * @param name Type: String.
     * @return returns the valid caracters that can be used in the regular 
     * expression.
     */
    private boolean validateName(String name){
        return (name.matches("[a-zA-Z]{1,}[\\ ]{1}[a-zA-Z]{1,}"));
    }
    
    /**This method validates the teacher's email by checking if it contains
     * an @.
     * 
     * @param email Type: String.
     * @return returns the valid caracters that can be used in the regular 
     * expression.
     */
    private boolean validateEmail(String email){
        return (email.contains("@"));
    }
    

    private String getInicials(String name){
        return (name.replaceAll("([\\S])([\\S]+)", "$1").replaceAll("\\s", "").toUpperCase());
    }
    
    
    private void setTimeTable(){
        InputReader input = new InputReader();
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
    
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getInicials() {
        return inicials;
    }

    public Department getDepartment() {
        if (department.isValid()){
            return department;
        }
        return null;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(String room) {
        if (room != null){
            this.room = RoomManager.searchRoom(room);
        }
    }
}
