import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public String getUserID() {
        return userID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelCompany() {
        return hotelCompany;
    }

    public ArrayList<String> getHotelAddress() {
        return hotelAddress;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getDaysBooked() {
        return daysBooked;
    }

    public int getHotelCapacity() {
        return capacity;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public Date getHotelArrivalDate() {
        return dateArriving;
    }

    public Date getHotelDepartureDate() {
        return dateLeaving;
    }
    public boolean getPool(){
        return pool;
    }
    public double getRating(){
        return rating;
    }


    //+ printTicket(): String
    public String printTicket() {
        HotelTicket hotelTicket = new HotelTicket (userID, hotelCompany, location, ratings, roomNumber,
                                                    sdf.format(dateArriving), sdf.format(dateLeaving),
                                                    numberOfBeds);
        return hotelTicket.toString();
    }
    public String toString(){
        return "UserID :" + userID +"\n"+ "HotelName: " + hotelName +"\n"+ "HotelCompany: "+ hotelCompany + "\n"+ "HotelAddress: "+  hotelAddress +"\n"+ "RoomNumber: " +roomNumber +"\n"+ "DaysBooked: " +  daysBooked +"\n"+ "Capacity: " + capacity +"\n"+ "NumberOfBeds: " + numberOfBeds +"\n"+ "DateArriving: " + dateArriving +"\n"+ "DateLeaving: " +dateLeaving + "\n"+ "Pool: " + pool +"\n";
    }


    @Override
    public Ticket bookTicket() {
      // TODO Auto-generated method stub
      return null;
    }
}

