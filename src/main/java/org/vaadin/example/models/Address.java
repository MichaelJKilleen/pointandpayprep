package org.vaadin.example.models;

import java.util.Objects;

public class Address {
    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String postalCode;

    private String country;

    public Address() {
    }

    public Address(String addressLine1, String addressLine2, String city, String state, String postalCode,
            String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public Address addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public Address country(String country) {
        this.country = country;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Address)) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(addressLine1, address.addressLine1) && Objects.equals(addressLine2, address.addressLine2)
                && Objects.equals(city, address.city) && Objects.equals(state, address.state)
                && Objects.equals(postalCode, address.postalCode) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, city, state, postalCode, country);
    }

    @Override
    public String toString() {
        return "{" + " addressLine1='" + getAddressLine1() + "'" + ", addressLine2='" + getAddressLine2() + "'"
                + ", city='" + getCity() + "'" + ", state='" + getState() + "'" + ", postalCode='" + getPostalCode()
                + "'" + ", country='" + getCountry() + "'" + "}";
    }

}
