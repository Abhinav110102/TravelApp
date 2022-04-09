import java.util.ArrayList;


public class TravelApplication {

    private AllUsers users;
    private AllFlights flights;
    private AllHotels hotels;
    private User currentUser;
    private static TravelApplication travelApplication;

    /**
     * Constructor
     */
    private TravelApplication() {
        users = AllUsers.getInstance();
        flights = AllFlights.getInstance();
        hotels = AllHotels.getInstance();
        this.currentUser = null;
    }

    /**
     * Method to return an instance of this class.
     * @return travelApplication the instance to be returned.
     */
    public static TravelApplication getInstance(){
        if (travelApplication == null) {
            travelApplication = new TravelApplication();
        }
        DataLoader.loadFlights();
        DataLoader.loadHotels();
        DataLoader.loadLuggage();
        DataLoader.loadUsers();
        return travelApplication;
    }


    // Login methods / / / / / / / / / / / / / / / / / / / / / / / / / / /

    /**
     * Method to check whether or not a user by a username exists, and indicate if a
     * username does not exist to the console.
     * @param username the username to check.
     * @return true if user exists, else false. 
     */
    public boolean checkUsername(String username) {
        if (users.getUsers() == null) {
            System.out.println("no users");
            return false;
        }
        for (User user : users.getUsers()) {
            if(user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to have a user sign in and set the logged in user
     * to currentUser. Booleans returns are needed for the UI's
     * functionality.
     * @param username the user name to login with.
     * @param password the password to login with.
     * @return true if user 
     */
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

    /**
     * Method to call various logout functions that save data to JSON files
     */
    public void quit(){
        if (currentUser != null) {logout();}
        AllFlights.logout();
        AllHotels.logout();
        AllLuggages.logout();
        AllUsers.logout();
    }

    // / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
    public void logout() {
        if (users.updateUser(currentUser)) {
            return;
        }
        System.out.println("error logging out fully");
        return;
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
                /*users.addUser(username, user.getFirstName(), user.getLastName(),
                            user.getPhoneNumber(), user.getEmail(), user.getUserAge(),
                            user.getPassportNumber(), user.getPassword(), user.getAddress(),
                            user.getFriends(), user.getFamily(), senior);*/
            }
        }
    }
    public void addUser(String age){
        ;
    }
    public ArrayList<Flight> SearchFlights(String input){
        
        ArrayList<Flight> flightResults = new ArrayList<Flight>();
        for (Flight flight : flights.getFlights()) {
            //System.out.println("HERE TO CLOWN");
            if (flight.getStartLocation().anyEquals(input) || flight.getEndLocation().anyEquals(input)) {
                flightResults.add(flight);
            }
        }
        /*
        for (int i = 0; i < flightsToSearch.size(); i++) {
            if (flightsToSearch.get(i).getDestinationAirport().equals(input)) {
                flightResults.add(flightsToSearch.get(i));
                //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
            } else if (flightsToSearch.get(i).getArrivalAirport().equals(input)) {
                flightResults.add(flightsToSearch.get(i));
                //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
            }
        }
        */
        return flightResults;
    }

    public ArrayList<Hotel> SearchHotels(String input){
        //String results = "";
        //ArrayList<Hotel> hotelsToSearch = hotels.getHotels();
        ArrayList<Hotel> hotelResults = new ArrayList<Hotel>();
        for (Hotel hotel : hotels.getHotels()) {
            if (hotel.getLocation().anyEquals(input)) {
                hotelResults.add(hotel);
            }
        }
        // for (int i = 0; i < hotelsToSearch.size(); i++) {
        //     if (hotelsToSearch.get(i).getHotelName().equals(input)) {
        //         hotelResults.add(hotelsToSearch.get(i));
        //         //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        //     } else if (hotelsToSearch.get(i).getHotelCompany().equals(input)) {
        //         hotelResults.add(hotelsToSearch.get(i));
        //         //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        //     }
        // }
        return hotelResults;
    }

public boolean bookFlight(Flight flight, String seat){
    FlightTicket userFlightTicket = flight.bookTicket(seat);
    if (userFlightTicket != null) {
        currentUser.addFlight(userFlightTicket);
        return true;
    }
    System.out.println("HIHIHI");
    return false;
}

public void bookHotel(Hotel hotel) {
    ;
}
    public void addTicketToUser(String username, UserTicket ticket){
        for (User user : users.getUsers()) {
            if(user.getUserName().equals(username)) {
                user.addTicket(ticket);
            }
        }
    }
    public void updateTicket(Flight flight){
        ;
    }
    public void updateTicket(Hotel hotel){
        ;
    }
    public void printTicket(Flight flight) {
        //flight.icket();
    }

    public void printTicket(Hotel hotel) {
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

    public void printAllTickets() {
        currentUser.printAllTickets();
    }
}
