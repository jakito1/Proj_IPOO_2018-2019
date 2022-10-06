/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOPrimeiraFase;

import java.time.LocalDate;
import java.util.Arrays;

/**This class defines and saves students information.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Student {
    private String name;
    private int number;
    private Date birthDate;
    private char genre;
    private Degree degree;
    private Schedule[] scheduleList;
    private int scheduleElements;
    private CurricularUnit[] curricularUnitList;
    private int curricularUnitElements;

    /**This is the Student class's constructor. It initializes the student 
     * class's parameters.
     * 
     * @param name Type: String.
     * @param number Type: int.
     * @param birthDate Type: String.
     * @param genre Type: char.
     * @param degree Type: String.
     * @param degreeType Type: String.
     */
    public Student(String name, int number, String birthDate, char genre, 
            String degree, String degreeType) {
        if (checkStrings(name) && checkStrings(birthDate) && isGenreValid(genre)
                && checkStrings(degree) && checkStrings(degreeType) && number > 0){
            scheduleList = new Schedule[10];
            scheduleElements = 0;
            curricularUnitList = new CurricularUnit[10];
            curricularUnitElements = 0;
            this.name = name;
            this.number = number;
            this.birthDate = new Date(birthDate);
            this.genre = genre;
            this.degree = new Degree(degree, degreeType);
        }
    }
    
    /**This method checks if the strings aren't null and if so, returns them.
     * 
     * @param string Type: String
     * @return returns a string if not null.
     */
    private boolean checkStrings(String string){
        return (string != null);
    }
    
    /**This method checks if the student genre is valid. It also ignores if used 
     * capital letters or not (only accepting m/M or f/F).
     * 
     * @param genre Type: char
     * @return returns the student genre if valid.
     */
    private boolean isGenreValid(char genre){
        return (genre == 'm' || genre == 'M' || genre == 'f' && genre == 'F');
    }
    
    /**This method adds a new Schedule. 
     * 
     * @param newSchedule Type: Schedule.
     */
    public void addSchedules(Schedule newSchedule){
        if (newSchedule != null){
            if (scheduleElements > scheduleList.length - 3){
                scheduleList = Arrays.copyOf(scheduleList, scheduleList.length * 2);
            }
            scheduleList[scheduleElements++] = newSchedule;
        }
    }
    
    
    public Schedule getCurrentSchedule(){
        for(int i = 0; i < scheduleElements; i++){
            Date tempStartSemester = scheduleList[i].getStartSemester();
            Date tempEndSemester = scheduleList[i].getEndSemester();
            int comp1 = tempStartSemester.compareDates(tempStartSemester.getLocalDate(), tempStartSemester.getCurrentDate());
            int comp2 = tempStartSemester.compareDates(tempStartSemester.getCurrentDate(), tempEndSemester.getLocalDate());
            if (comp1 <= 0 && comp2 >= 0){
                return scheduleList[i];
            }    
        }
        return null;
    }
    
    /**This method adds Curricular Units to a student. 
     * 
     * @param newCurricularUnit Type: CurricularUnit.
     */
    public void addCurricularUnits(CurricularUnit newCurricularUnit){
        if (newCurricularUnit != null){
            if (curricularUnitElements > curricularUnitList.length - 3){
                curricularUnitList = Arrays.copyOf(curricularUnitList, curricularUnitList.length * 2);
            }
            curricularUnitList[curricularUnitElements++] = newCurricularUnit;
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public char getGenre() {
        return genre;
    }

    public Degree getDegree() {
        return degree;
    }

    public Schedule[] getScheduleList() {
        return scheduleList;
    }

    public int getScheduleElements() {
        return scheduleElements;
    }

    public CurricularUnit[] getCurricularUnitList() {
        return curricularUnitList;
    }

    public int getCurricularUnitElements() {
        return curricularUnitElements;
    }
}