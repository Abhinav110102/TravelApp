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

    /**
     * Method to return the first name
     * @return firstName the first name to be returned.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to return the last name.
     * @return lastName the last name to be returned.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to return the age
     * @return age the age to be returned in an int.
     */
    public int getAge() {
        return age;
    }

    /**
     * Method to return user info in a String.
     */
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
