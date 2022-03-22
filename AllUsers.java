import java.util.ArrayList;

public class AllUsers {

    private AllUsers allUsers;
    private ArrayList <User> users;

    // + logout: void
    private AllUsers() {}

    /**
     * Method to return an instance of itself.
     * @return allUsers the object to be returned.
     */
    public AllUsers getInstance() {
        if (AllUsers == null) {
			allUsers = new AllUsers();
		}
		return allUsers;
    }

    /**
     * Constructor
     */
    public void addUser(String firstName, String lastName, String phoneNumber, String ID) {
        User user = new User(firstName, lastName, phoneNumber, ID);
        users.add(user);
    }

    public void logout() {
    ;
    }

}
