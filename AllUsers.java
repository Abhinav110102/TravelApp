import java.util.ArrayList;
import java.util.UUID;

public class AllUsers {

    private static AllUsers allUsers = null;
    private static ArrayList <User> users = new ArrayList<>();

    // + logout: void
    private AllUsers() {
<<<<<<< HEAD
        DataLoader.loadUsers();
=======
        users = DataLoader.loadUsers();
>>>>>>> ba95b011155603f9a14c501ab85f9cce35f3e064
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

    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * Constructor
     */
    public void addUser(String username, String firstName, String lastName,
    String phone, String email, int userAge, String passportNumber, String password,
    ArrayList<String> address, ArrayList<String> friends, ArrayList<ArrayList<String>> family, boolean senior) {
        String userID = UUID.randomUUID().toString();
        User user = new User(username, password, firstName, lastName, phone, email,
                            passportNumber, new Location(address.get(0), address.get(1),
                            address.get(2), address.get(3), address.get(4)), userAge,
                            senior);
        users.add(user);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public static void logout() {
        DataWriter.saveUsers();
    }

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
