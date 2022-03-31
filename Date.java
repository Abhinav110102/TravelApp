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
    public int  getyear() {
        return year;
    }


    public String toString() {
        return + month + " " + day + " " + year + " ";
    }



    //addOneDay()
    //convertToMonth()
    //toString() -> "Month day, year"
}
