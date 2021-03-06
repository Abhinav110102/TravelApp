import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class User {
    //Variables
    private String username;
    private String firstName;
    private String lastName;
    private String userID;
    private String phone;
    private String email;
    private int userAge;
    private String passportNumber;
    private String password;
    private Location address;
    //private Location address1;
    private ArrayList<String> friends; // contains ID of friends
    //private ArrayList<ArrayList<String>> family;
    private ArrayList<Family> familyList;
    private boolean senior;
    private ArrayList<HotelTicket> hotels;
    private ArrayList<FlightTicket> flights;
    private ArrayList<Rating> ratings;
    private ArrayList<UserTicket> tickets;
    private ArrayList<Luggage> luggages;
    private ArrayList<User> friendList;

    // - address: Location
    // - tickets: ArrayList<Ticket>
    // - flights: ArrayList<Flight>
    // - hotels: ArrayList<Hotel>
    // - friends: ArrayList<User>
    // - family: ArrayList<Family>

    //this is constructor for the jsons
    public User (String username, String firstName, String lastName, String userID,
                String phone, String email, int userAge, String passportNumber, String password,
                Location address, ArrayList<String> friends, ArrayList<ArrayList<String>> family, boolean senior) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
        this.phone = phone;
        this.email = email;
        this.userAge = userAge;
        this.passportNumber = passportNumber;
        this.password = password;
        this.address = address;
        this.friends = friends;
        //this.family = family;
        this.senior = senior;

        familyList = new ArrayList<Family>();
        for (int i = 0; i < family.size(); i++) {
            familyList.add(new Family(family.get(i).get(0), family.get(i).get(1), Integer.parseInt(family.get(i).get(2))));
        }
    }
    
    //this is for new users
    public User (String username, String password, String firstName, String lastName, String phone, String email, 
                    String passportNumber, Location address, int userAge, boolean senior) {
        
        String userID = UUID.randomUUID().toString();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
        this.phone = phone;
        this.email = email;
        this.userAge = userAge;
        this.passportNumber = passportNumber;
        this.password = password;
        this.address = address;
        this.senior = senior;
     
    }
    public String getUserName() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserID() {
        return userID;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address.toString();
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public ArrayList<Family> getFamilyList() {
        return familyList;
    }

    public ArrayList<ArrayList<String>> getFamily() {
        ArrayList<ArrayList<String>> familyVals = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < familyList.size(); i++) {
            familyVals.get(i).set(0, familyList.get(i).getFirstName());
            familyVals.get(i).set(1, familyList.get(i).getLastName());
            familyVals.get(i).set(2, Integer.toString(familyList.get(i).getAge()));
        }
        return familyVals;
    }

    public boolean isOver65() {
        return senior;
    }

    public void registerLuggage(Luggage luggage) {
        luggages.add(luggage);
    }

    public void addTicket(UserTicket ticket) {
        tickets.add(ticket);
    }

    public void requestRefund(UserTicket ticket) {
        tickets.remove(ticket);
    }

    public void printAllTickets() {
        for (int i = 0; i < tickets.size(); i++) {
            try {
                tickets.get(i).printTicket();
            } catch (IOException e) {
                e.printStackTrace();;
            }
        }
    }

    public void printFlights() {
        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i).toString()); // should not be sys.out
        }
    }

    public void printHotels() {
        for (int i = 0; i < hotels.size(); i++) {
            System.out.println(hotels.get(i).toString()); // should not be sys.out
        }
    }

    public void addFriend(User user) {
        friendList.add(user);
    }

    public void addRating(String Username, int rating, boolean isNameVisible) {
        ratings.add(new Rating(Username, rating, isNameVisible));
    }

    public double calCost() {
        double cost = 10;
        if (isOver65()) {
            cost = 0.75 * cost;
        }
        return cost;
    }

    public void addFlight(FlightTicket flightTicket) {
        flights.add(flightTicket);
        tickets.add(flightTicket);
    }
    // + addDeal(): Deal
    // + registerLuggage(): void
    // + addTicket(Ticket): void
    // + requestRefund(): void
    // + printAllTickets(): void
    // + printFlights(): void
    // + printHotels(): void
    // + addFriend(User user): void
    // + addRating(String username, int rating, boolean isNameVisible)
    // + calCost(): int //frequent flyer and senior
}
