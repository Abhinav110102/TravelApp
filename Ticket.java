import java.util.ArrayList;
import java.lang.Math;

/**
 * Class for managing data in a Ticket which is added to a user. This class is a parent of FlightTicket and HotelTicket.
 */
public abstract class Ticket {
    protected String ID;
    protected String Company;
    protected Location location;
    protected ArrayList<Rating> ratings;

    //public abstract String printTicket(); // Print to txt
    //public abstract Ticket bookTicket();

    /**
     * Method to add a rating created by a user to  array list of ratings.
     * @param username the username on a rating
     * @param rating the rating numerical value on a rating
     * @param isNameVisible determines wether a user's name is visible
     */
    public void addRating(String username, int rating, boolean isNameVisible) {
        Rating rat = new Rating(username, rating, isNameVisible);
        //if (this.ratings.contains(rat)) {
         //   this.rating.()
        //}
        this.ratings.add(rat);
    }

    /**
     * Method to calculate average value of ratings.
     * @return ret the average rating value.
     */
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

    /**
     * Method to get location.
     * @return location the location to be returned.
     */
    public Location getLocation() {
        return location;
    }
}
