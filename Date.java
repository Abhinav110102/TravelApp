// mainly for hotels
public class Date {
    private int day;
    private int month;
    private int year;
    /**
    * Constructor
    */
    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date (Date date) {
        this.day = date.getday();
        this.month = date.getmonth();
        this.year = date.getyear();
    }

    // Gets and sets
    /**
     * Method to return the day
     * @return day the day to be returned.
     */
    public int  getday() {
        return day;
    }
     /**
     * Method to return the year
     * @return year the year to be returned.
     */
    public int  getmonth() {
        return month;
    }
     /**
     * Method to return the year
     * @return year the year to be returned.
     */
    public int getyear() {
        return year;
    }

    /**
     * Method to return the year
     * @return year the year to be returned.
     */
    public void addDay() {
        this.day += 1;
    }

    public String convertToMonth() {
        switch (month) {
            case 1:  return "January";       
            case 2:  return  "February";     
            case 3:  return "March";         
            case 4:  return "April";         
            case 5:  return  "May";           
            case 6:  return  "June";          
            case 7:  return "July";          
            case 8:  return "August";        
            case 9:  return  "September";     
            case 10: return "October";      
            case 11: return  "November";
            case 12: return "December";
            default: return "Invalid month"; 
        }
    }

    public String toString() {
        return + month + " " + day + " " + year + " ";
    }



    //addOneDay()
    //convertToMonth()
    //toString() -> "Month day, year"
}
