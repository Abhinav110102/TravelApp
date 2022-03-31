import java.util.ArrayList;

public class AllHotels {
// - allHotels: AllHotels
// - hotels: ArrayList<Hotel>
private static AllHotels allHotels = null;
private static ArrayList<Hotel> hotels = new ArrayList<>();


// - AllHotels()
// +  getInstance(): AllHotels
// + addHotel(): void
// + logout: void
private AllHotels(){}

public static AllHotels getInstance(){
    if (allHotels == null) {
        allHotels = new AllHotels();
    }
    return allHotels;
}

public ArrayList<Hotel> getHotels() {
    return hotels;
}

public void addHotel(String userID, String hotelName, String hotelCompany, ArrayList<String> hotelAddress,
                    int roomNumber, int daysBooked, int capacity, int numberOfBeds,
                    String arrivalDate, String departureDate, boolean pool , double rating ){
    Hotel hotel = new Hotel(userID, hotelName, hotelCompany, hotelAddress, roomNumber, daysBooked,
                            capacity, numberOfBeds, arrivalDate, departureDate , pool, rating);
    hotels.add(hotel);
}

public static void logout(){
    DataWriter.saveHotels();;
}
}
