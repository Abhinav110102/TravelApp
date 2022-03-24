import java.util.ArrayList;

public abstract class UserTicket {
    private String ID;
    private String company;
    private Location location;
    private ArrayList<Rating> ratings;

    // + printTicket(): String
    // + displayAvailable(): String
    // + addRating(): void
    // + getAvgRatings(): int

    public abstract String printTicket();

    public void addRating() {
        ;
    }

    public int getAvgRatings() {
        ;
    }
}

