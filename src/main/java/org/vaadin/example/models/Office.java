package org.vaadin.example.models;

import java.util.Objects;

public class Office extends BaseEntity {

    private String officeCode;

    private String phone;

    private Address address;

    private String territory;

    public Office() {
    }

    public Office(String officeCode, String phone, Address address, String territory) {
        this.officeCode = officeCode;
        this.phone = phone;
        this.address = address;
        this.territory = territory;
    }

    public String getOfficeCode() {
        return this.officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTerritory() {
        return this.territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public Office officeCode(String officeCode) {
        this.officeCode = officeCode;
        return this;
    }

    public Office phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Office address(Address address) {
        this.address = address;
        return this;
    }

    public Office territory(String territory) {
        this.territory = territory;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Office)) {
            return false;
        }
        Office office = (Office) o;
        return Objects.equals(officeCode, office.officeCode) && Objects.equals(phone, office.phone)
                && Objects.equals(address, office.address) && Objects.equals(territory, office.territory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeCode, phone, address, territory);
    }

    @Override
    public String toString() {
        return "{" + " officeCode='" + getOfficeCode() + "'" + ", phone='" + getPhone() + "'" + ", address='"
                + getAddress() + "'" + ", territory='" + getTerritory() + "'" + "}";
    }

}
