/**
 * Class for managing data in a location.
 */
public class Location {

    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    /**
     * Constructor
     */
    public Location(String street, String city, String state, String zipcode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
    /**
     * Method to retun the street
     * @return the street to be returned.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Method to retun the city
     * @return the city to be returned.
     */
    public String getCity() {
        return city;
    }

    /**
     * Method to retun the state
     * @return the state to be returned.
     */
    public String getState() {
        return state;
    }

    /**
     * Method to retun the zipcode
     * @return the zipcode to be returned.
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Method to retun the country
     * @return the country to be returned.
     */
    public String getCountry() {
        return country;
    }

<<<<<<< HEAD
    public boolean anyEquals(String location) {
        if (street.equals(location)) {
            return true;
        }
        if (city.equals(location)) {
            return true;
        }
        if (state.equals(location)) {
            return true;
        }
        if (zipcode.equals(location)) {
            return true;
        }
        if (country.equals(location)) {
            return true;
        }
        return false;
    }
    
    // + toString(): String
=======
    /**
     * toString() method
     */
>>>>>>> ba95b011155603f9a14c501ab85f9cce35f3e064
    public String toString(){
        return this.street + "\n" + this.city + ", " + this.state + " " + this.zipcode + "\n" + this.country;
    }
}
