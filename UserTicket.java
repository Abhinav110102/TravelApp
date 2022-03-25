import java.util.ArrayList;

import javax.naming.directory.InitialDirContext;

public abstract class UserTicket {
    protected String ID;
    protected String company;
    //private Location location;
    protected ArrayList<Rating> ratings;

    // + printTicket(): String
    // + displayAvailable(): String
    // + addRating(): void
    // + getAvgRatings(): int

    public UserTicket(String ID, String company, ArrayList<Rating> ratings) {
        this.ID = ID;
        this.company = company;
        //this.location = location;
        this.ratings = ratings;
    }

    public abstract String printTicket(); // to String

    //public void addRating() {
    //    ;
    //}

    public double getAvgRatings() {
        double ret = 0;
        for (Rating i : this.ratings) {
            ret += i.getRating();
        }
        ret =  ret/this.ratings.size();
        ret = Math.round(ret*10);
        ret = ret/10;
        return ret;
    }
}

