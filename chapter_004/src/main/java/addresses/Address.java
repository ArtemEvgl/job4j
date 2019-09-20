package addresses;

public class Address {
    private String city;
    private String street;

    private int home;
    private int apartament;

    public Address(String city, String street, int home, int apartament) {
        this.city = city;
        this.apartament = apartament;
        this.home = home;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartament() {
        return apartament;
    }

    @Override
    public String toString() {
        return city + " " + street + " " + home + " " + apartament;
    }
}
