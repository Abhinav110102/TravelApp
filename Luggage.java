public class Luggage {
  private String userID;
  private String flightID;
  private double LuggageWeight;

  /**
   * Constructor
   */
  public Luggage(String userID, String flightID, double weight) {
    this.userID = userID;
    this.flightID = flightID;
    this.LuggageWeight = weight;
  }

  /**
   * Method to determine wether luggage is over 50 pounds
   * @param pounds the wieght to be inputed
   * @return true if over 50 lbs. else false.
   */
  public boolean isOver50(double pounds){
    if (pounds > 50) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Method to get userID
   * @return userID the userID to be returned.
   */
  public String getUserID() {
    return userID;
  }

  /**
   * Method to get flightID
   * @return flightID the flightID to be returned.
   */
  public String getFlightID() {
    return flightID;
  }

  /**
   * Method to get luggage weight
   * @return LuggageWeight the luggage weight to be returned.
   */
  public double getWeight(){
    return LuggageWeight;
  }
}
