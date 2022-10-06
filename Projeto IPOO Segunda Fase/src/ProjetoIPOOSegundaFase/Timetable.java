/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIPOOSegundaFase;

import java.time.temporal.ChronoUnit;

/**This class manages the chronology of classes, events, etc. 
 *
 * @author Francisco Moura (180221015), Tiago Farinha (180221011).
 * 180221015@ips.estudantes.pt, 180221011@ips.estudantes.pt
 */
public class Timetable {
    private Date startDate;
    private int startHour;
    private int startMinute;
    private Date endDate;
    private int endHour;
    private int endMinute;
    private int duration;

    
     /**This constructor initializates the parameters needed to know the duration
     * of a certain event.
     * 
     * @param startDate
     * @param startTime
     * @param duration 
     */
    public Timetable(String startDate, String startTime, int duration) {
        exception();
        if (startDate != null && startTime != null && duration > 0){
            startDate = startDate.trim();
            startTime = startTime.trim();
            this.startDate = new Date(startDate);
            this.duration = duration;
            splitTime(startTime, true);
            findEnds(duration);
        }
        if(this.startDate.getFullDate().equals("01/01/1900") || duration <= 0){
            exception();
        }
    }
    
    

    /**This second constructor initializates the parameters that allow us to
     * know when an event starts and ends but not its duration (first
     * constructor).
     * 
     * @param startDate Type: String.
     * @param startTime Type: String.
     * @param endDate Type: String.
     * @param endTime Type: String.
     */
    public Timetable (String startDate, String startTime, String endDate,
            String endTime){
        exception();
        startDate = startDate.trim();
        startTime = startTime.trim();
        endDate = endDate.trim();
        endTime = endTime.trim();
        if (startDate != null && startTime != null && endDate != null
                && endTime != null){
            this.startDate = new Date(startDate);
            this.endDate = new Date(endDate);
            splitTime(startTime, true);
            splitTime(endTime, false);
            if (isBefore()){
                findDuration();
            }
        }
        if(this.startDate.getFullDate().equals("01/01/1900") || 
           this.endDate.getFullDate().equals("01/01/1900")){
                    exception();
        }
    }
    
    
    /**This method is used in the case of the date not being valid. It gives us
     * a default date.
     * 
     */
    private void exception(){
        startDate = new Date("01/01/1900");
        startHour = 0;
        startMinute = 0;
        endDate = new Date("01/01/1900");
        endHour = 0;
        endMinute = 0;
        duration = 0;
    }
    
    
    /**This method creates two temporary dates and checks which one is first.
     * 
     * @return returns true when the start hour/minute of an event happends 
     * before the end hour/minute.
     */
    private boolean isBefore(){
        int comp = startDate.getLocalDate().compareTo(endDate.getLocalDate());
        if (comp == 0){
            if (startHour < endHour){
                return true;
            }else{
                if (startHour == endHour && startMinute < endMinute){
                    return true;
                }
            }
        }else if (comp < 0){
            return true;
        }
        return false;
    }
    
    
    /**This method finds the duration of an event.
     * 
     */
    private void findDuration(){
        long days = ChronoUnit.DAYS.between(startDate.getLocalDate(), endDate.getLocalDate());
        duration = (int) days * 1440 + (endHour - startHour) * 60 + (endMinute - startMinute);
    }
    
    
    /**This method breaks a given time around matches of the given regular
     * expression.
     * 
     * @param startTime Type: String.
     * @param isStartTime Type: boolean.
     */
    private void splitTime(String startTime, boolean isStartTime){
        if (startTime.matches("[0-9]{1,}[\\:]{1}[0-9]{1,}")){
            String[] timeArray = startTime.split("\\:");
            if (timeArray.length == 2){
                int tempHour = Integer.parseInt(timeArray[0]);
                int tempMinute =  Integer.parseInt(timeArray[1]);
                if (tempHour >= 0 && tempHour < 24 && 
                    tempMinute >= 0 && tempMinute < 60){
                    if (isStartTime){
                        this.startHour = tempHour;
                        this.startMinute = tempMinute;
                    }else{
                        this.endHour = tempHour;
                        this.endMinute = tempMinute;
                    }
                }
            }
        }
    }
    
    
    /**This method finds out the end of an event by adding the duration to the
     * starting time.
     * 
     * @param duration Type: int.
     */
    private void findEnds(int duration){
        this.endMinute = startMinute + duration;
        this.endHour = startHour;
        int minuteRounds = endMinute / 60;
        long hourRounds = 0;
        if (endMinute > 59){
            endMinute -= minuteRounds*60;
            endHour += minuteRounds;
            hourRounds = endHour / 24;
            if (endHour > 23){
                endHour -= hourRounds*24;
            }
        }
        setEndDate(hourRounds);
    }
    
    private void setEndDate(long extraDays){
        endDate = new Date(startDate.getLocalDate(), extraDays);
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getStartMinute() {
        return startMinute;
    }
    
    public String getFullStartDate(){
        String tempStartHour = Integer.toString(this.startHour);
        String tempStartMinute = Integer.toString(this.startMinute);
        if (this.startHour < 10){
            tempStartHour = "0" + this.startHour;
        }
        if (this.startMinute < 10){
            tempStartMinute = "0" + this.startMinute;
        }
        return tempStartHour + ":" + tempStartMinute;
    }
    
    public String getFullEndDate(){
        String tempEndHour = Integer.toString(this.endHour);
        String tempEndMinute = Integer.toString(this.endMinute);
        if (this.endHour < 10){
            tempEndHour = "0" + this.endHour;
        }
        if (this.endMinute < 10){
            tempEndMinute = "0" + this.endMinute;
        }
        return tempEndHour + ":" + tempEndMinute;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getEndHour() {
        return endHour;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public int getDuration() {
        return duration;
    }
}
