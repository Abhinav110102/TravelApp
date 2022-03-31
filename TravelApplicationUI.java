import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for implenting a user interface for the TravelApplication.
 * @author Mark Valentino
 */
public class TravelApplicationUI {
    private Scanner scanner = new Scanner(System.in);
    private TravelApplication travelApplication; // NOT IN UML
    
    /**
     * Constructor
     */
    public TravelApplicationUI(){
        Scanner scanner = new Scanner(System.in);
        travelApplication = TravelApplication.getInstance();
        //TravelApplication travelApplication = new TravelApplication();
    }

    /**
     * Method to run the UI. Calls printOptions() method.
     */
    public void run() {
        int option = 0;
        int bookingOption;
        boolean inApp = true;
        System.out.println("Welcome to our Booking App!");
        while (inApp) {
            printOptions();
            System.out.println("What would you like to do?:");
            option = scanner.nextInt();
            switch(option) {
                case 1:
                    //login
                    if (login()) {
                        System.out.println("Login Successful");
                        System.out.println("Welcome " + travelApplication.getCurrentUser().getFirstName() + "!");
                    } else {
                        System.out.println("Login Unsuccessful");
                    }
                    break;
                case 2:
                        if (signUp()) {
                            System.out.println("Sign Up Successful");
                            System.out.println("Welcome " + travelApplication.getCurrentUser().getFirstName() + "!");
                        } else {
                            System.out.println("Sign Up Unsuccessful");
                        }
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    travelApplication.quit();
                    System.out.println("Goodbye!");
                    // insert code to save to json?
                    //travelApplication.Logout();
                    break;
                default:
                    System.out.println("Sorry! That's not an option, please try again: ");
            }
        }
    }

    /**
     * Method to print options of input in UI.
     */
    public void printOptions(){
        if (travelApplication.getCurrentUser() == null) {
            System.out.println("************ Main Menu ************");
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("3. Book a Flight");
            System.out.println("4. Book a Hotel");
            System.out.println("5. Quit app"); 
            return;
        }
        System.out.println("************ Main Menu ************");
        System.out.println("1. Book a Flight");
        System.out.println("2. Book a Hotel");
        System.out.println("3. Check Accout Profile");
        System.out.println("4. Logout");
        System.out.println("5. Quit app"); 
    }


    /** / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
     * login Method
     * returns
     */
    public boolean login() {
        int attempts = 0;
        boolean loop = true;
        String usernameInput = "";
        String passwordInput = "";
        while (attempts < 5 && loop) {
            System.out.println("Enter your username:");
            scanner.nextLine();
            usernameInput = scanner.nextLine();
            if (travelApplication.checkUsername(usernameInput)) {
                loop = false;
            } else {
                System.out.println("Incorrect Username. Please Try Again");
                attempts++;
            }
        }
        if (attempts == 5) { 
            System.out.println("Error Logging in: Too many failed attempts. Please Try again later");
            return false;
        }

        attempts = 0;
        loop = true;
        while (attempts < 5 && loop) {
            System.out.println("Enter your password:");
            passwordInput = scanner.nextLine();
            if (travelApplication.login(usernameInput, passwordInput)) {
                loop = false;
            } else {
                System.out.println("Incorrect Password. Please Try Again");
                attempts++;
            }
        }
        System.out.println("Error Logging in: Too many failed attempts. Please Try again later");
        return false;
    }

    // Sign up Method / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
    public boolean signUp() {
        boolean loop = true;
        String username = "";
        String password, firstName, lastName, phone, email, passportNum, street, city, state, zipcode, country;
        int age;

        System.out.println("Before we can start creating your account, please enter your age:");
        scanner.nextLine();
        age = scanner.nextInt();

        if (age < 18) {
            System.out.println("I'm sorry, but you're too young to make an account.\nAdults with accounts can add you to their account and book for you!");
            return false;
        }

        while (loop) {
          scanner.nextLine();
            System.out.println("Enter a username:");
            username = scanner.nextLine();
            if (!travelApplication.checkUsername(username)) {
                loop = false;
            } else {
                System.out.println("That username is taken. Please Try Again");
            }
        }

        loop = true;
        System.out.println("Enter a Password:");
        password = scanner.nextLine();

        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter your phone number:");
        phone = scanner.nextLine();

        System.out.println("Enter your email:");
        email = scanner.nextLine();

        System.out.println("Enter your passport number:");
        passportNum = scanner.nextLine();

        System.out.println("Enter your street of residence:");
        street = scanner.nextLine();

        System.out.println("Enter your city of residence:");
        city = scanner.nextLine();

        System.out.println("Enter your state of residence:");
        state = scanner.nextLine();
        
        System.out.println("Enter your zipcode of residence:");
        zipcode = scanner.nextLine();

        System.out.println("Enter your country of residence:");
        country = scanner.nextLine();

        travelApplication.signUp(username, password, firstName, lastName, phone, email, passportNum, street, city, state, zipcode, country, age);
        System.out.println("Signed up!!");
        return true;
    }

    // Book Flight / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
    public void bookFlight() {
        String searchInput;
        int bookingOption;
        System.out.println("Where would you like to fly to or from?");
        searchInput = scanner.nextLine();
        ArrayList<Flight> flightResults = travelApplication.SearchFlights(searchInput);
        for (int i = 0 ; i < flightResults.size(); i++){
            System.out.println(i + ". " + flightResults.get(i).getStartLocation() + " " + flightResults.get(i).getEndLocation()
              + " " + flightResults.get(i).getAirline() + " " + flightResults.get(i).getPlaneName()
              + " " + flightResults.get(i).getFlightDepartureDate() + " " + flightResults.get(i).getFlightDuration());
        }
        System.out.println("Which flight would you like to book?");
        bookingOption = scanner.nextInt();
        travelApplication.Booking(flightResults.get(bookingOption));
    }

    // Book Hotel / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
    public void bookHotel() {
        int bookingOption;
        String searchInput;
        System.out.println("Where would you like to book a hotel?");
        searchInput = scanner.nextLine();
        ArrayList<Hotel> hotelResults = travelApplication.SearchHotels(searchInput);
        for (int i = 0 ; i < hotelResults.size(); i++){
            System.out.println(i + ". " + hotelResults.get(i).getHotelAddress()
               + " " + hotelResults.get(i).getHotelCompany() + " " + hotelResults.get(i).getHotelName()
               + " " + hotelResults.get(i).getHotelArrivalDate() + " " + hotelResults.get(i).getDaysBooked());
         }
         System.out.println("Which hotel would you like to book?");
         bookingOption = scanner.nextInt();
         travelApplication.Booking(hotelResults.get(bookingOption));
         // Search() method only works for flights for now.
         //travelApplication.Search(searchInput);
    } 

    /**
     * Method main for running the entire Application.
     */
    public static void main(String[] args) {
        TravelApplicationUI travelApplicationUI = new TravelApplicationUI();
        travelApplicationUI.run();
    }
}
