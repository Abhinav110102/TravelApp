public class Luggage {
  //  -luggageWeight: int
  private String userID;
  private String flightID;
  private double LuggageWeight;

public Luggage(String userID, String flightID, double weight) {
  this.userID = userID;
  this.flightID = flightID;
  this.LuggageWeight = weight;
}
//   + isOver50(double pounds): boolean
// + getWeight(): int
public boolean isOver50(double pounds){
    if (pounds > 50) {
      return true;
    } else {
      return false;
    }
}

public String getUserID() {
  return userID;
}

public String getFlightID() {
  return flightID;
}

public static Luggage getInstance() {
  ;
}

public double getWeight(){
    return LuggageWeight;
}
}
