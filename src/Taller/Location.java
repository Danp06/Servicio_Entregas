package Taller;

public class Location {
    public String country, state, city, addressLine1, addressLine2;
    public int zipCode;

    public Location(String country, String state, String city, String addressLine1, String addressLine2, int zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Location{" + "country=" + country + ", state=" + state + ", city=" + city + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", zipCode=" + zipCode + '}';
    }
    
}
