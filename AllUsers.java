import java.util.ArrayList;
//import java.util.UUID;

/**
 * Class for managing data for all users in the Travel Application. 
 */
public class AllUsers {

    private static AllUsers allUsers = null;
    private static ArrayList <User> users = new ArrayList<>();

    /**
     * Constructor
     */
    private AllUsers() {
        users = DataLoader.loadUsers();
    }

    /**
     * Method to return an instance of itself.
     * @return allUsers the object to be returned.
     */
    public static AllUsers getInstance() {
        if (allUsers == null) {
			allUsers = new AllUsers();
		}
		return allUsers;
    }

    /**
     * Method for returning an array list of Users.
     * @return users the array list of users to be returned.
     */
    public ArrayList<User> getUsers() {
        return users;
    }


    public void addUser(String username, String firstName, String lastName,
    String phone, String email, int userAge, String passportNumber, String password,
    ArrayList<String> address, ArrayList<String> friends, ArrayList<ArrayList<String>> family, boolean senior) {
        //String userID = UUID.randomUUID().toString();
        User user = new User(username, password, firstName, lastName, phone, email,
                            passportNumber, new Location(address.get(0), address.get(1),
                            address.get(2), address.get(3), address.get(4)), userAge,
                            senior);
        users.add(user);
    }

    /**
     * Method to add a User to users arraylist.
     * @param user the user to be added.
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Method to call DataWriter and save user data to JSON.
     */
    public static void logout() {
        DataWriter.saveUsers();
    }

    /**
     * Method to update user info on a user by overwriting it with a new user created
     * with the same user ID.
     * @param currentUser the User object that will overwrite.
     */
    public boolean updateUser(User currentUser) { // returns true if successful
        for (User user : users) {
            if(user.getUserID().equals(currentUser.getUserID())) {
               users.remove(user);
               users.add(currentUser); //updates info
               return true;
            }
        }
        return false;
    }
}
