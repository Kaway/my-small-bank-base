package fr.paris8.iutmontreuil.mysmallbank.account.domain.model;

public class Address {

    private final String street;
    private final String zipCode;
    private final String city;
    private final String country;

    public Address(String street, String zipCode, String city, String country) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
