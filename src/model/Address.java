package model;

public class Address {
   private String country;
   private String region;
    private String city;
   private String street;
    private Integer house;

    public Address(String country, String region, String city, String street, Integer house) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public String toString(){
        return "Address{" + "Country: " + country + ", Region: " + region + ", City: " + city + " Street: " + street +
                ", House: " + house + "}";
    }
}

