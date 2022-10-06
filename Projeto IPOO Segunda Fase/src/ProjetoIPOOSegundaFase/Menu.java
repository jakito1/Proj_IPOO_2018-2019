/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

/**This class allows the user to interact and use the program. It makes a menu 
 * which the user will be able to interact with. The options the user has are 
 * displayed and he only has to choose which one he wants and use the program's 
 * funcionalities.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 */
public class Menu {
    private InputReader input;

    public Menu() {
        input = new InputReader();
    }
    
    public void displayMainMenu(){
        System.out.println("***Gestão de Agenda***\n");
        System.out.println("1 – Adicionar/Editar uma nova agenda");
        System.out.println("2 – Visualizar a agenda de um semestre");
        System.out.println("3 – Visualizar as estatísticas de um semestre");
        System.out.println("4 - Reinicializar as agendas do aluno");
        System.out.println("0 – Sair");
        System.out.println("Escolha a sua opção:");
    }
    
    public void displayEditMenu(){
        System.out.println("***Edição de Agenda***\n");
        System.out.println("1 – Criar uma nova agenda");
        System.out.println("2 – Inserir uma nova disciplina");
        System.out.println("3 – Inserir um novo docente");
        System.out.println("4 – Inserir um novo grupo");
        System.out.println("5- Adicionar aulas à uma disciplina");
        System.out.println("6- Adicionar uma nova avaliação");
        System.out.println("0 – Sair");
        System.out.println("Escolha a sua opção:");
    }
    
    public void displayViewMenu(){
        System.out.println("***Visualização de Agenda***\n");
        System.out.println("1 – Ver a nova agenda de um dia");
        System.out.println("2 – Ver a agenda de uma semana");
        System.out.println("3 – Ver as avaliações restantes de um semestre");
        System.out.println("4 – Ver o horário de atendimento dos docentes de uma "
                + "disciplina");
        System.out.println("5- Ver os meus grupos");
        System.out.println("6- Ver o horário de uma sala");
        System.out.println("7- Ver a lista de disciplinas com os responsáveis");
        System.out.println("0 – Sair");
        System.out.println("Escolha a sua opção:");
    }
    
    public int readMainOption(){
        return input.getIntegerNumber("Opção");
    }
    
    public boolean resetSchedule(){
        String answer = input.getText("Quer reiniciar as agendas do estudante em questão?");
        return (answer.contains("s") || answer.contains("S"));
    }
}