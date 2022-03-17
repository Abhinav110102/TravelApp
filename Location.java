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

    // + toString(): String
    public String toString(){
        return "";
    }
}
