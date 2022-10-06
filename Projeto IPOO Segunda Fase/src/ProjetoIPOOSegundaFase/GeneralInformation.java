/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

/**This method saves all the courses each department has by using arrays to 
 * store those courses.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class GeneralInformation {
    
    public final static String[] GRADUATE = new String[] {"Contabilidade e Finanças" , 
            "Gestão da Distribuição e da Logística", 
            "Gestão de Recursos Humanos",
            "Gestão de Sistemas de Informação", "Marketing",
            "Animação e Intervenção Sociocultural", "Comunicação Social",
            "Desporto", "Educação Básica",
            "Tradução e Interpretação de Língua Gestual Portuguesa",
            "Acupuntura", "Enfermagem", "Fisioterapia", "Terapia da Fala",
            "Engenharia de Automação", "Controlo e Instrumentação",
            "Engenharia Eletrotécnica e de Computadores",
            "Engenharia Informática", "Engenharia Mecânica",
            "Tecnologia Biomédica", "Tecnologias de Energia",
            "Tecnologia e Gestão Industrial", "Tecnologia do Ambiente e do Mar",
            "Bioinformática", "Biotecnologia", "Engenharia Civil", 
            "Tecnologias do Petróleo"};
    public final static int[] GRADUATECREDITS = new int[] {180, 180, 180, 180,
            180, 180, 180, 180, 180, 180, 240, 240, 240, 240, 180, 180, 180, 
            180, 180, 180, 180, 180, 180, 180, 180, 180};
    
    public final static String[] POSTGRADUATE = new String[] {"Contabilidade Pública", 
            "Gestão e Marketing Turístico", "Administração e Gestão de Escolas",
            "Educação Especial - Domínio Cognitivo e Motor",
            "Enfermagem do Trabalho",
            "Saúde Sexual e Reprodutiva: Mutilação Genital Feminina",
            "Engenharia Informática",
            "Motorização de Veículos Elétricos e Híbridos", 
            "Produção Aeronáutica"};
    public final static int[] POSTGRADUATECREDITS = new int[] {60, 60, 60, 10, 
            30, 30, 32, 48, 32};
    
    public final static String[] MASTER = new String[] {"Ciências Empresariais", 
            "Contabilidade e Finanças", "Gestão de Marketing", 
            "Gestão e Administração de Escolas", 
            "Gestão de Sistemas de Informação", 
            "Gestão Estratégica de Recursos Humanos", 
            "Segurança e Higiene no Trabalho", "Educação Pré-Escolar", 
            "Educação Pré-Escolar e Ensino do 1º Ciclo do Ensino Básico", 
            "Ensino do 1.º Ciclo do Ensino Básico e de Português e História e Geografia de Portugal no 2.º Ciclo do Ensino Básico", 
            "Ensino do 1.º Ciclo do Ensino Básico e de Matemática e Ciências Naturais no 2.º Ciclo do Ensino Básico", 
            "Enfermagem Perioperatória", "Fisioterapia", "Enfermagem", 
            "Engenharia de Software", "Engenharia Eletrotécnica e de Computadores", 
            "Engenharia de Produção", "Informática de Gestão", 
            "Conservação e Reabilitação do Edificado", 
            "Engenharia Biológica e Química", "Engenharia Civil"};
    public final static int[] MASTERCREDITS = new int[] {120, 120, 120, 120,
            120, 120, 120, 120, 120, 120, 120, 90, 120, 90, 120, 120, 120, 120,
            100, 120, 120};
    
    public final static String[] BUSINESSSCIENCES = new String[] {"Contabilidade e Finanças" , 
            "Gestão da Distribuição e da Logística", 
            "Gestão de Recursos Humanos",
            "Gestão de Sistemas de Informação", "Marketing", "Contabilidade Pública", 
            "Gestão e Marketing Turístico", "Ciências Empresariais", 
            "Contabilidade e Finanças", "Gestão de Marketing", 
            "Gestão e Administração de Escolas", 
            "Gestão de Sistemas de Informação", 
            "Gestão Estratégica de Recursos Humanos", 
            "Segurança e Higiene no Trabalho"};
    
    public final static String[] SOCIALSCIENCES = new String[] {"Animação e Intervenção Sociocultural", 
            "Comunicação Social", "Desporto", "Educação Básica",
            "Tradução e Interpretação de Língua Gestual Portuguesa",
            "Administração e Gestão de Escolas",
            "Educação Especial - Domínio Cognitivo e Motor",
            "Educação Pré-Escolar", 
            "Educação Pré-Escolar e Ensino do 1º Ciclo do Ensino Básico", 
            "Ensino do 1.º Ciclo do Ensino Básico e de Português e História e Geografia de Portugal no 2.º Ciclo do Ensino Básico", 
            "Ensino do 1.º Ciclo do Ensino Básico e de Matemática e Ciências Naturais no 2.º Ciclo do Ensino Básico"};
    
    public final static String[] HEALTH = new String[] {"Acupuntura", 
            "Enfermagem", "Fisioterapia", "Terapia da Fala",
            "Enfermagem do Trabalho",
            "Saúde Sexual e Reprodutiva: Mutilação Genital Feminina",
            "Enfermagem Perioperatória", "Fisioterapia", "Enfermagem"};
    
    public final static String[] ENGINEERINGTECHNOLOGY = new String[] {"Engenharia de Automação",
            "Controlo e Instrumentação", "Engenharia Eletrotécnica e de Computadores",
            "Engenharia Informática", "Engenharia Mecânica",
            "Tecnologia Biomédica", "Tecnologias de Energia",
            "Tecnologia e Gestão Industrial", "Tecnologia do Ambiente e do Mar",
            "Bioinformática", "Biotecnologia", "Engenharia Civil", 
            "Tecnologias do Petróleo", "Motorização de Veículos Elétricos e Híbridos", 
            "Produção Aeronáutica", "Engenharia de Software", 
            "Engenharia de Produção", "Informática de Gestão", 
            "Conservação e Reabilitação do Edificado", 
            "Engenharia Biológica e Química", "Engenharia Civil"};
}


