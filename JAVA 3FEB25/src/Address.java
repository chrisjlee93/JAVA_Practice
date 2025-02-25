public class Address {
    private String street;
    private String city;

    public Address(){
        this("no street", "no city");
    }

    public Address(String st, String c) {
        street = st;
        city = c;
    }

    public void setStreet(String st) {
        street = st;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String c) {
        city = c;
    }

    public String getCity() {
        return city;
    }

}




