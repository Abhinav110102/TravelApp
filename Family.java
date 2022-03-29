/**
 * Class for managing data for a Family member and determing if a ticket is needed.
 *  Pet is a child class.
 * @author Mark Valentino
 */
public class Family {

    private String firstName;
    private String lastName;
    private int age;

    /**
     * Constructor
     */
    public Family(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return firstName + " " + lastName + "\nAge: " + age; 
    }
    
    /**
     * Method to determine wether a ticket is needed.
     * @return true if age >= 18
     */
    public boolean ticketNeeded() {
        return age >= 18;
    }
}
