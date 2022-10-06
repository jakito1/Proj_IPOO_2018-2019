/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**This class is used in other classes for date time information and usage.
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Date {
    private LocalDate localDate;
    
    
    /**This is the Date class's constructor. It initializes the class's 
     * parameters.
     * 
     * @param date Type: String
     */
    public Date(String date) {
        if (isDateValid(date)){
            localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }else{
            localDate = LocalDate.of(1900, 01, 01);
        }
    }
    
    /**This is a second constructor that shows another type of initializing the
     * parameters.
     * 
     * @param oldDate Type: LocalDate
     * @param extraDays Type: long
     */
    public Date(LocalDate oldDate, long extraDays){
        localDate = oldDate.plusDays(extraDays);
    }
    
    
    /**This method is used to see if the date is valid. If the date input 
     *inserted isn't valid, it returns false. 
     * 
     * @param date Type: String.
     * @return returns true or false depending on whether the inserted date is 
     * valid or not.
     */
    private boolean isDateValid(String date) {
        int day = 0;
        int month = 0;
        int year = 0;
        if (date != null){
            date = date.trim();
            if (date.matches("[0-9]{2}[\\/]{1}[0-9]{2}[\\/]{1}[0-9]{4}")){
                String[] dateArray = date.split("[^0-9]");                      //fazer split da string this.date em todos os caracteres exceto de 0 a 9
                if (dateArray.length == 3){                                     //https://docs.oracle.com/javase/9/docs/api/java/util/regex/Pattern.html#sum
                    day = Integer.parseInt(dateArray[0]);
                    month = Integer.parseInt(dateArray[1]);
                    year = Integer.parseInt(dateArray[2]);
                }
                if (month == 2){
                    if ((year % 400 == 0) && day <= 29){
                        return true;
                    }else if (((year % 4 == 0) && (year % 100 != 0)) && day <= 29){
                        return true;
                    }else if (day < 29){
                        return true;
                    }
                }else if ((month == 4 || month == 6 || month == 9 ||
                           month == 11) && day < 31){
                    return true;
                }else if ((month == 1 || month == 3 || month == 5 ||
                           month == 7 || month == 8 || month == 10 ||
                           month == 12) && day <= 31){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    /**This method compares to dates to find out which one is first.
     * 
     * @param date1 Type: LocalDate;
     * @param date2 Type: LocalDate;
     * @return 
     */
    public int compareDates(LocalDate date1, LocalDate date2){
        return date1.compareTo(date2);
    }
    
    
     /**This method gives us the amount of years that have passes since a chosen
      * date.
      * 
      * @return returns how many years have passed from a certain date until 
      * today.
      */
    public int getYearsTillToday() {
        int yearsTillToday = getCurrentYear() - getYear();
        if (getMonth() > getCurrentMonth() ||                                   
            getMonth() == getCurrentMonth() &&
            getDay() > getCurrentDay()) {
            yearsTillToday -= 1;
            }
        return yearsTillToday;
    }
    
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
    
    public int getCurrentYear() {
        return LocalDate.now().getYear(); 
    }
        
    public int getCurrentMonth() {
        return LocalDate.now().getMonthValue();                                 
    }
    
    public int getCurrentDay() {
        return LocalDate.now().getDayOfMonth();                            
    }

    public int getDay() {
        return localDate.getDayOfMonth(); 
    }

    public int getMonth() {
        return localDate.getMonthValue();
    }

    public int getYear() {
        return localDate.getYear();
    }   
    
    public String getFullDate(){
        return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
