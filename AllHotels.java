import java.util.ArrayList;

/**
 * Class for managing all hotels in an arraylist and saving them to JSON.
 */
public class AllHotels {

    private static AllHotels allHotels = null;
    private static ArrayList<Hotel> hotels = new ArrayList<>();

    /**
     * Constructor
     */
    private AllHotels(){
        hotels = DataLoader.loadHotels();
    }

    /**
     * Method to return an nstance of itself
     * @return allHotels the instance to be returned.
     */
    public static AllHotels getInstance(){
        if (allHotels == null) {
            allHotels = new AllHotels();
        }
        return allHotels;
    }

    /**
     * Method to get an ArrayList of hotels
     * @return hotels the ArrayList to be returned.
     */
    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    /**
     * Method to add a hotel to array list of hotels. 
     * @param userID a value of hotel constructor.
     * @param hotelName a value of hotel constructor.
     * @param hotelCompany a value of hotel constructor.
     * @param hotelAddress a value of hotel constructor.
     * @param roomNumber a value of hotel constructor.
     * @param daysBooked a value of hotel constructor.
     * @param capacity a value of hotel constructor.
     * @param numberOfBeds a value of hotel constructor.
     * @param arrivalDate a value of hotel constructor.
     * @param departureDate a value of hotel constructor.
     * @param pool a value of hotel constructor.
     * @param rating a value of hotel constructor.
     */
    public void addHotel(String userID, String hotelName, String hotelCompany, ArrayList<String> hotelAddress,
                    int roomNumber, int daysBooked, int capacity, int numberOfBeds,
                    String arrivalDate, String departureDate, boolean pool , double rating ){
        Hotel hotel = new Hotel(userID, hotelName, hotelCompany, hotelAddress, roomNumber, daysBooked,
                            capacity, numberOfBeds, arrivalDate, departureDate , pool, rating);
        hotels.add(hotel);
    }

    /**
     * Method to call DataWriter to save all hotels to JSON
     */
    public static void logout(){
        DataWriter.saveHotels();;
    }
}
