import java.util.ArrayList;

public class AllHotels {
// - allHotels: AllHotels
// - hotels: ArrayList<Hotel>
private AllHotels allHotels;
private ArrayList<Hotel> hotels;


// - AllHotels()
// +  getInstance(): AllHotels
// + addHotel(): void
// + logout: void
private AllHotels(){}

public AllHotels getInstance(){
    if (allHotels == null) {
        allHotels = new AllHotels();
    }
    return allHotels;
}

public void addHotel(String userID, String hotelName, String hotelCompany, ArrayList<String> hotelAddress,
                    int roomNumber, int daysBooked, int capacity, int numberOfBeds,
                    String arrivalDate, String departureDate){
    Hotel hotel = new Hotel(userID, hotelName, hotelCompany, hotelAddress, roomNumber, daysBooked,
                            capacity, numberOfBeds, arrivalDate, departureDate);
    hotels.add(hotel);
}

public void logout(){
    DataWriter.saveHotels();;
}
}
