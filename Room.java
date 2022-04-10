//import java.rmi.AlreadyBoundException;
import java.util.ArrayList;
//import java.time.LocalDateTime;

/**
 * Class for managing data in a room. Determines wether rooms are available.
 */
public class Room {
    int roomNumber;
    int numOfBeds;
    ArrayList<Date> unavailableDates;

    /**
     * Constructor
     */
    public Room(int roomNumber, int numOfBeds, ArrayList<Date> unavailableDates) { 
        this.roomNumber = roomNumber;
        this.numOfBeds = numOfBeds;
        this.unavailableDates = unavailableDates;
    }

    /**
     * Method to add dates that are unavailable based on an arrival date and
     * a depature date 
     * @param arrivalDate the arrival date to factor into the calculation
     * @param departureDate the departure date to fctor into the calculation.
     */
    public void addUnavailableDate(Date arrivalDate, Date departureDate) {
        this.unavailableDates.add(arrivalDate);
        while (arrivalDate != departureDate) {
            arrivalDate.addDay();
            this.unavailableDates.add(arrivalDate);
        }
    }

    /**
     * Method to remove dates that are unavailable based on an arrival date and
     * a depature date 
     * @param arrivalDate the arrival date to factor into the calculation
     * @param departureDate the departure date to fctor into the calculation.
     */
    public void removeUnavailableDates(Date arrivalDate, Date departureDate) {
        this.unavailableDates.remove(arrivalDate);
        while (arrivalDate != departureDate) { 
            arrivalDate.addDay();
            this.unavailableDates.remove(arrivalDate);
        }
    }

    /**
     * Method to check wether a date is available.
     * @param date to check if available
     * @return true if date is available. Else false.
     */
    public boolean isAvailable(Date date) {
        for(Date i: unavailableDates) {
            if (i == date) {
                return false;
            }
        }
        return true;
    }
}
