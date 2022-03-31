import java.util.ArrayList;

public class TravelApplication {
//     - users: AllUsers
// - flights: AllFlights
// - hotels: AllHotels
// - currentUser: User
// - database: Database
private AllUsers users;
private AllFlights flights;
private AllHotels hotels;
private User currentUser;
//private Database database;
private static TravelApplication travelApplication;

// - TravelApplication()
// + getInstance(): TravelApplication()
// - login(String username, String password): String
// - signUp(String username, String password): String
// - logout(): String
// + addUser(String age): void
// + Search(String input): Ticket
// + Booking(Ticket): void 
// - addTicketToUser(Ticket): void
// - updateTicket(Flight): void
// - updateTicket(Hotel): void
// - printTickets(): String
// + displayOptions(): String
// + inputOption(int input): String
// + displayAvailableMonth(int month): void
// + displayUserID(): String

private TravelApplication() {
  users = AllUsers.getInstance();
  flights = AllFlights.getInstance();
  hotels = AllHotels.getInstance();
  this.currentUser = null;
}
public static TravelApplication getInstance(){
    if (travelApplication == null) {
        travelApplication = new TravelApplication();
    }
    return travelApplication;
}


// Login methods / / / / / / / / / / / / / / / / / / / / / / / / / / /
public boolean checkUsername(String username) {
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            return true;
        }
    }
    return false;
}

public boolean login(String username, String password) {
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            if (user.getPassword().equals(password)) {
                this.currentUser = user;
                return true;
            }
            return false; // password is wrong
        }
    }
    return false; // password or username is wrong
}



// Sign up methods / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / 
public void signUp(String username, String password, String firstName, String lastName, String phone, String email, 
                        String passportNum, String street, String city, String state, String zipcode, String country, int age) {
    boolean senior = false;
    if (age >= 65) {senior = true;}
    Location address = new Location(street, city, state, zipcode, country);
    User newUser = new User(username, password, firstName, lastName, phone, email, passportNum, address, age, senior);
    users.addUser(newUser);
    currentUser = newUser;
    
}

/**
 
private boolean signUp(String username,String password, String firstName, String lastName, String userID,
                        String phone, String email, String passportNumber, String street, String city,
                        String state, String zipcode, String country, int userAge){
    if (userAge < 18) {
        return false;
    }
    ArrayList<String> friends = new ArrayList<String>();
    ArrayList<ArrayList<String>> family = new ArrayList<ArrayList<String>>();
    boolean senior = false;  // Senior set to false by default, will be set to true if needed when passed through addUser
    User user = new User(username, password, firstName, lastName, phone, email, passportNumber,
                        new Location(street, city, state, zipcode, country), userAge, senior);
    addUser(user.getUserName(), Integer.toString(userAge));
    return true;
}
*/
// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
public void quit(){
    AllFlights.logout();
    AllHotels.logout();
    AllLuggages.logout();
    AllUsers.logout();
}
public void addUser(String username, String age){
    boolean senior = false;
    if (Integer.parseInt(age) <= 18) {
        return;  // double checks that age is greater than 18, exits method if it is
    } else if (Integer.parseInt(age) >= 65) {
        senior = true;
    }
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            users.addUser(username, user.getFirstName(), user.getLastName(),
                        user.getPhoneNumber(), user.getEmail(), user.getUserAge(),
                        user.getPassportNumber(), user.getPassword(), user.getAddress(),
                        user.getFriends(), user.getFamily(), senior);
        }
    }
}
public void addUser(String age){
    ;
}
public ArrayList<Flight> SearchFlights(String input){
    //String results = "";
    ArrayList<Flight> flightsToSearch = flights.getFlights();
    ArrayList<Flight> flightResults = new ArrayList<Flight>();
    for (int i = 0; i < flightsToSearch.size(); i++) {
        if (flightsToSearch.get(i).getDestinationAirport().equals(input)) {
            flightResults.add(flightsToSearch.get(i));
            //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        } else if (flightsToSearch.get(i).getArrivalAirport().equals(input)) {
            flightResults.add(flightsToSearch.get(i));
            //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        }
    }
    return flightResults;
}

public ArrayList<Hotel> SearchHotels(String input){
    //String results = "";
    ArrayList<Hotel> hotelsToSearch = hotels.getHotels();
    ArrayList<Hotel> hotelResults = new ArrayList<Hotel>();
    for (int i = 0; i < hotelsToSearch.size(); i++) {
        if (hotelsToSearch.get(i).getHotelName().equals(input)) {
            hotelResults.add(hotelsToSearch.get(i));
            //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        } else if (hotelsToSearch.get(i).getHotelCompany().equals(input)) {
            hotelResults.add(hotelsToSearch.get(i));
            //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        }
    }
    return hotelResults;
}

public void Booking(Ticket ticket){
    ;
}
private void addTicketToUser(String username, Ticket ticket){
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            user.addTicket(ticket);
        }
    }
}
private void updateTicket(Flight flight){
    ;
}
private void updateTicket(Hotel hotel){
    ;
}
private void printTicket(Flight flight) {
    flight.printTicket();
}

private void printTicket(Hotel hotel) {
    hotel.printTicket();
}
/*public String inputOption(int input){
    ;
}*/
public void displayAvailableMonth(int month){
    ;
}
public String displayUserID(String username){
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            return user.getUserID();
        }
    }
    return "Sorry, that user does not appear on our records!"; // username is not found
}
public User getCurrentUser() {
    return currentUser;
}
}
