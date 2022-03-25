import java.util.ArrayList;
import java.lang.Math;

public abstract class Ticket {
    private String ID;
    private String Company;
    private Location location;
    private ArrayList<Rating> ratings;

    // + printTicket(): String
    // + displayAvailable(): String
    // + addRating(): void
    // + getAvgRatings(): int

    public abstract String printTicket(); // Print to txt
    
    //public abstract String displayAvailable();

    public void addRating(String username, int rating, boolean isNameVisible) {
        Rating rat = new Rating(username, rating, isNameVisible);
        //if (this.ratings.contains(rat)) {
         //   this.rating.()
        //}
        this.ratings.add(rat);
    }

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
