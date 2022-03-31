import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Class for managing data in a Hotel for booking.
 */
public class Hotel extends Ticket {
    //Variables from JSON Files
    private String userID;
    private String hotelName;
    private String hotelCompany;
    private ArrayList<String> hotelAddress;
    private int roomNumber;
    private int daysBooked;
    private int capacity;
    private int numberOfBeds;
    private Date dateArriving;
    private Date dateLeaving;
    private boolean pool;
    private double rating;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Constructor
     */
    public Hotel(String userID, String hotelName, String hotelCompany, ArrayList<String> hotelAddress,
                int roomNumber, int daysBooked, int capacity, int numberOfBeds,
                String arrivalDate, String departureDate, boolean pool, double rating) {
        this.userID = userID;
        this.hotelName = hotelName;
        this.hotelCompany = hotelCompany;
        this.hotelAddress = hotelAddress;

        Location location = new Location (hotelAddress.get(0), hotelAddress.get(1),
                                            hotelAddress.get(2), hotelAddress.get(3),
                                            hotelAddress.get(4));

        this.roomNumber = roomNumber;
        this.daysBooked = daysBooked;
        this.capacity = capacity;
        this.numberOfBeds = numberOfBeds;
        this.pool = pool;
        this.rating = rating;

        try {
            this.dateArriving = sdf.parse(arrivalDate);
            this.dateLeaving = sdf.parse(departureDate);
        } catch (Exception e) {
            System.out.println("Error parsing dates");
        }
    }

    /**
     * Method to get userID
     * @return the userID to be returned.
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Method to get hotelName
     * @return the hotelName to be returned.
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Method to get hotelCompany
     * @return the hotelCompany to be returned.
     */
    public String getHotelCompany() {
        return hotelCompany;
    }

    /**
     * Method to get hotelAddress array list
     * @return the hotelAddress to be returned.
     */
    public ArrayList<String> getHotelAddress() {
        return hotelAddress;
    }

    /**
     * Method to get roomNumber
     * @return the roomNumber to be returned.
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Method to get daysBooked
     * @return the daysBooked to be returned.
     */
    public int getDaysBooked() {
        return daysBooked;
    }

    /**
     * Method to get capacity of hotel
     * @return the capacity to be returned.
     */
    public int getHotelCapacity() {
        return capacity;
    }

    /**
     * Method to get numberOfBeds in hotel
     * @return the numberOfBeds to be returned.
     */
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Method to get dateArriving
     * @return the dateArriving to be returned.
     */
    public Date getHotelArrivalDate() {
        return dateArriving;
    }

    /**
     * Method to get dateLeaving
     * @return the dateLeaving to be returned.
     */
    public Date getHotelDepartureDate() {
        return dateLeaving;
    }

    /**
     * Method to get wether hotel has pool.
     * @return pool boolean. True if hotel has pool.
     */
    public boolean getPool(){
        return pool;
    }

    /**
     * Method to get a rating.
     * @return rating the rating to be returned.
     */
    public double getRating(){
        return rating;
    }

    /**
     * Method to get return data on a Hotel booking.
     */
    public String printTicket() {
        HotelTicket hotelTicket = new HotelTicket (userID, hotelCompany, location, ratings, roomNumber,
                                                    sdf.format(dateArriving), sdf.format(dateLeaving),
                                                    numberOfBeds);
        return hotelTicket.toString();
    }

    /**
     * toString method
     */
    public String toString(){
        return "UserID :" + userID +"\n"+ "HotelName: " + hotelName +"\n"+ "HotelCompany: "+ hotelCompany + "\n"+ "HotelAddress: "+  hotelAddress +"\n"+ "RoomNumber: " +roomNumber +"\n"+ "DaysBooked: " +  daysBooked +"\n"+ "Capacity: " + capacity +"\n"+ "NumberOfBeds: " + numberOfBeds +"\n"+ "DateArriving: " + dateArriving +"\n"+ "DateLeaving: " +dateLeaving + "\n"+ "Pool: " + pool +"\n";
    }


    @Override
    public Ticket bookTicket() {
      // TODO Auto-generated method stub
      return null;
    }
}

