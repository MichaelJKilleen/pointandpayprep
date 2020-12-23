package org.vaadin.example.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Customer extends BaseEntity {
    // To set the increment: alter table table_name AUTO_INCREMENT = 1001
    private Integer customerNumber;

    private String customerName;

    private String contactLastName;

    private String contactFirstName;

    private String phone;

    private Address address;

    private Integer salesRepEmployeeNumber;

    private BigDecimal creditLimit; // decimal(10,2) DEFAULT NULL,

    public Customer() {
    }

    public Customer(Integer customerNumber, String customerName, String contactLastName, String contactFirstName,
            String phone, Address address, Integer salesRepEmployeeNumber, BigDecimal creditLimit) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.address = address;
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        this.creditLimit = creditLimit;
    }

    public Integer getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactLastName() {
        return this.contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return this.contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
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

    public Integer getSalesRepEmployeeNumber() {
        return this.salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public BigDecimal getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Customer customerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public Customer customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public Customer contactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
        return this;
    }

    public Customer contactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
        return this;
    }

    public Customer phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Customer address(Address address) {
        this.address = address;
        return this;
    }

    public Customer salesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        return this;
    }

    public Customer creditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return Objects.equals(customerNumber, customer.customerNumber)
                && Objects.equals(customerName, customer.customerName)
                && Objects.equals(contactLastName, customer.contactLastName)
                && Objects.equals(contactFirstName, customer.contactFirstName) && Objects.equals(phone, customer.phone)
                && Objects.equals(address, customer.address)
                && Objects.equals(salesRepEmployeeNumber, customer.salesRepEmployeeNumber)
                && Objects.equals(creditLimit, customer.creditLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerNumber, customerName, contactLastName, contactFirstName, phone, address,
                salesRepEmployeeNumber, creditLimit);
    }

    @Override
    public String toString() {
        return "{" + " customerNumber='" + getCustomerNumber() + "'" + ", customerName='" + getCustomerName() + "'"
                + ", contactLastName='" + getContactLastName() + "'" + ", contactFirstName='" + getContactFirstName()
                + "'" + ", phone='" + getPhone() + "'" + ", address='" + getAddress() + "'"
                + ", salesRepEmployeeNumber='" + getSalesRepEmployeeNumber() + "'" + ", creditLimit='"
                + getCreditLimit() + "'" + "}";
    }

}
