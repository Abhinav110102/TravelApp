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
        TravelApplication travelApplication = new TravelApplication();
    }

    /**
     * Method to run the UI. Calls printOptions() method.
     */
    public void run() {
        int option = 0;
        int bookingOption;
        String usernameInput;
        String passwordInput;
        String firstNameInput;
        String lastNameInput;
        String userIDInput;
        int phoneInput;
        String emailInput;
        int userAgeInput;
        int passportNumberInput;
        ArrayList<String> addressInput = new ArrayList<String>();
        String searchInput;
        System.out.println("Welcome to our Booking App!");
        while (true) {
            printOptions();
            System.out.println("What would you like to do?:");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter your username:");
                    scanner.nextLine();
                    usernameInput = scanner.nextLine();
                    System.out.println("Enter your password:");
                    passwordInput = scanner.nextLine();
                    if (travelApplication.login(usernameInput, passwordInput) == true) {
                    	System.out.println("Logged in.");
                    }
                    break;
                case 2:
                    System.out.println("Enter a username:");
                    scanner.nextLine();
                    usernameInput = scanner.nextLine();
                    System.out.println("Enter a password:");
                    passwordInput = scanner.nextLine();
                    System.out.println("Enter your first name:");
                    firstNameInput = scanner.nextLine();
                    System.out.println("Enter your last name:");
                    lastNameInput = scanner.nextLine();
                    System.out.println("Enter your user ID:");
                    userIDInput = scanner.nextLine();
                    System.out.println("Enter your phone number:");
                    phoneInput = scanner.nextInt();
                    System.out.println("Enter your email:");
                    emailInput = scanner.nextLine();
                    System.out.println("Enter your age:");
                    userAgeInput = scanner.nextInt();
                    System.out.println("Enter your passport number:");
                    passportNumberInput = scanner.nextInt();
                    System.out.println("Enter your street of residence:");
                    String street = scanner.nextLine();
                    addressInput.add(street);
                    System.out.println("Enter your city of residence:");
                    String city = scanner.nextLine();
                    addressInput.add(city);
                    System.out.println("Enter your state of residence:");
                    String state = scanner.nextLine();
                    addressInput.add(state);
                    System.out.println("Enter your ZIP code:");
                    String ZIP = scanner.nextLine();
                    addressInput.add(ZIP);
                    System.out.println("Enter your country of residence:");
                    String country = scanner.nextLine();
                    addressInput.add(country);
                    if (travelApplication.signUp(usernameInput, passwordInput, firstNameInput, lastNameInput, userIDInput,
                                                phoneInput, emailInput, userAgeInput, passportNumberInput, addressInput) == true) {
                    	System.out.println("Signed up.");
                    }
                    break;
                case 3:
                    System.out.println("Where would you like to fly to or from?");
                    searchInput = scanner.nextLine();
                    ArrayList<Flight> flightResults = travelApplication.Search(searchInput);
                    for (int i = 0 ; i < flightResults.size(); i++){
                        System.out.println(i + ". " + flightResults.get(i).getStartLocation() + " " + flightResults.get(i).getEndLocation());
                    }
                    System.out.println("Which flight would you like to book?");
                    bookingOption = scanner.nextInt();
                    travelApplication.Booking(flightResults.get(bookingOption));
                    break;
                case 4:
                    System.out.println("Where would you like to book a hotel?");
                    searchInput = scanner.nextLine();
                    // Search() method only works for flights for now.
                    //travelApplication.Search(searchInput);
                    break;
                case 5:
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
        System.out.println("************ Main Menu ************");
        System.out.println("1. Login");
        System.out.println("2. Sign up");
        System.out.println("3. Book a Flight");
        System.out.println("4. Book a Hotel");
        System.out.println("5. Quit app"); 
    }

    /**
     * Method main for running the entire Application.
     */
    public static void main(String[] args) {
        TravelApplicationUI travelApplicationUI = new TravelApplicationUI();
        travelApplicationUI.run();
    }

}
