import java.util.ArrayList;

public class User {
    //private ArrayList<Ticket> tickets;
    private ArrayList<User> friendList;
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    //Variables from JSON Files
    private String username;
    private String firstName;
    private String lastName;
    private String userID;
    private int phone;
    private String email;
    private int userAge;
    private int passportNumber;
    private String password;
    private ArrayList<String> address;
    private ArrayList<String> friends;
    private ArrayList<ArrayList<String>> family;
    private ArrayList<Family> familyList;
    private boolean senior;

    // - address: Location
    // - tickets: ArrayList<Ticket>
    // - flights: ArrayList<Flight>
    // - hotels: ArrayList<Hotel>
    // - friends: ArrayList<User>
    // - family: ArrayList<Family>
    public User (String username, String firstName, String lastName, String userID,
                int phone, String email, int userAge, int passportNumber, String password,
                ArrayList<String> address, ArrayList<String> friends, ArrayList<ArrayList<String>> family, boolean senior) {
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
        this.family = family;
        this.senior = senior;

        familyList = new ArrayList<Family>();
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

    public int getPhoneNumber() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<String> getAddress() {
        return address;
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

    public void registerLuggage() {
        ;
    }

    public void addTicket() {
        ;
    }

    public void requestRefund() {
        ;
    }

    public void printAllTickets() {
        ;
    }
    
    public void printFlights() {
        ;
    }

    public void printHotels() {
        ;
    }

    public void addFriend(User user) {
        ;
    }

    public void addRating(String Username, int rating, boolean isNameVisible) {
        ;
    }

    public int calCost() {
        ;
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

