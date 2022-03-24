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

    // + toString(): String
    public String toString(){
        return this.street + "\n" + this.city + ", " + this.state + " " + this.zipcode + "\n" + this.country;
    }
}
