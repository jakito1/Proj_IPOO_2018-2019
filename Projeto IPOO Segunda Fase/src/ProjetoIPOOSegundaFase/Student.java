/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

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
    private HashSet<Schedule> scheduleList;
    private HashSet<CurricularUnit> curricularUnitList;

    
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
            scheduleList = new HashSet<>();
            curricularUnitList = new HashSet<>();
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
            scheduleList.add(newSchedule);
        }
    }
    
    public Schedule getCurrentSchedule(){
        for (Schedule schedule1 : scheduleList) {
            Date tempStartSemester = schedule1.getStartSemester();
            Date tempEndSemester = schedule1.getEndSemester();
            int comp1 = tempStartSemester.compareDates(tempStartSemester.getLocalDate(),
                    tempStartSemester.getCurrentDate());
            int comp2 = tempStartSemester.compareDates(tempEndSemester.getLocalDate(),
                    tempStartSemester.getCurrentDate());
            if (comp1 <= 0 && comp2 >= 0){
                return schedule1;
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
            curricularUnitList.add(newCurricularUnit);
        }
    }
    
    public void resetSchedules(){
        scheduleList.clear();
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

    public HashSet getScheduleList() {
        return scheduleList;
    }

    public HashSet getCurricularUnitList() {
        return curricularUnitList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.scheduleList);
        hash = 53 * hash + Objects.hashCode(this.curricularUnitList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.scheduleList, other.scheduleList)) {
            for (Schedule schedule1 : this.scheduleList) {
                for (Schedule schedule2 : other.scheduleList) {
                    if (schedule1.getStartSemester().getFullDate().equalsIgnoreCase(schedule2.getStartSemester().getFullDate()) &&
                            schedule1.getEndSemester().getFullDate().equalsIgnoreCase(schedule2.getEndSemester().getFullDate())){
                        return true;
                    } 
                }
            }
            return false;
        }
        if (!Objects.equals(this.curricularUnitList, other.curricularUnitList)) {
            for (CurricularUnit curricularUnit1 : this.curricularUnitList) {
                for (CurricularUnit curricularUnit2 : other.curricularUnitList) {
                    if (curricularUnit1.getName().equalsIgnoreCase(curricularUnit2.getName()) &&
                            curricularUnit1.getId().equalsIgnoreCase(curricularUnit2.getId())){
                        return true;
                    } 
                }
            }
            return false;
        }
        return true;
    }

}