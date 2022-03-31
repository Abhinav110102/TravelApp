import java.util.ArrayList;

/**
 * Class for managing data in a set of all luggage stored in a User.
 */
public class AllLuggages {

    private static AllLuggages allLuggages = null;
    private static ArrayList<Luggage> luggages = new ArrayList<>();

// -AllFlights()
// +  getInstance(): AllFlights
// + addFlight(): void
<<<<<<< HEAD
// +logout: void
private AllLuggages(){
    DataLoader.loadLuggage();
}
=======
>>>>>>> ba95b011155603f9a14c501ab85f9cce35f3e064

    /**
     * Constructor
    */
    private AllLuggages(){
        luggages = DataLoader.loadLuggage();
    }

    /**
    * Method to return an instance of itself
    * @return AllLuggages the instance of itself to be returned.
    */
    public static AllLuggages getInstance(){
        if (allLuggages == null) {
          allLuggages = new AllLuggages();
        }
        return allLuggages;
    }

    /**
    * Method to return an array list of Luggage objects.
    * @return luggages the array list to be returned.
    */
    public ArrayList<Luggage> getLuggages() {
      return luggages;
    }

    /**
    * Method to add a Luggage to the array list of luggages
    * @param userID a constructor value in a Luggage
    * @param flightID a constructor value in a Luggage
    * @param weight a constructor value in a Luggage
    */
    public void addLuggage(String userID, String flightID, double weight){
        Luggage luggage = new Luggage(userID, flightID, weight);
        luggages.add(luggage);
    }

    /**
    * Method to save all luggages to JSON.
    */
    public static void logout(){
        DataWriter.saveLuggages();
    }
}
