public class Location {
// - Street: String
// - City: String
// - State:  String
// - zipcode: String
// - country: String
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Location(String street, String city, String state, String zipcode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }

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
    public String toString(){
        return this.street + "\n" + this.city + ", " + this.state + " " + this.zipcode + "\n" + this.country;
    }
}
