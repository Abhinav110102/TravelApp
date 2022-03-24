import java.rmi.AlreadyBoundException;
import java.util.ArrayList;
import java.util.Date;
//import java.time.LocalDateTime;

public class Room {
    int roomNumber;
    int numOfBeds;
    ArrayList<Date> unavailableDates;

    public Room(int roomNumber, int numOfBeds, ArrayList<Date> unavailableDates) { 
        this.roomNumber = roomNumber;
        this.numOfBeds = numOfBeds;
        this.unavailableDates = unavailableDates;
    }

    public void addUnavailableDate(Date arrivalDate, Date departureDate) {
        this.unavailableDates.add(arrivalDate);
        int addDay = 1000*60*60*24;
        while (arrivalDate != departureDate) {
            arrivalDate = new Date(arrivalDate.getTime() + addDay);
            this.unavailableDates.add(arrivalDate);
        }
    }

    public void removeUnavailableDates(Date arrivalDate, Date departureDate) {
        this.unavailableDates.remove(arrivalDate);
        int addDay = 1000*60*60*24;
        while (arrivalDate != departureDate) {
            arrivalDate = new Date(arrivalDate.getTime() + addDay);
            this.unavailableDates.remove(arrivalDate);
        }
    }

    public boolean isAvailable(Date date) {
        for(Date i: unavailableDates) {
            if (i == date) {
                return false;
            }
        }
        return true;
    }
}
