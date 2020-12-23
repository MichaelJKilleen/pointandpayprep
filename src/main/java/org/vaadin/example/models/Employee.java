package org.vaadin.example.models;

import java.util.Objects;

public class Employee extends BaseEntity {
    // To set the increment: alter table table_name AUTO_INCREMENT = 1001
    private Integer employeeNumber;

    private String lastName;

    private String firstName;

    private String extension;

    private String email;

    private String officeCode;

    private Integer reportsTo;

    private String jobTitle;

    public Employee() {
    }

    public Employee(Integer employeeNumber, String lastName, String firstName, String extension, String email,
            String officeCode, Integer reportsTo, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTitle = jobTitle;
    }

    public Integer getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeCode() {
        return this.officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public Integer getReportsTo() {
        return this.reportsTo;
    }

    public void setReportsTo(Integer reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee employeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    public Employee lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee extension(String extension) {
        this.extension = extension;
        return this;
    }

    public Employee email(String email) {
        this.email = email;
        return this;
    }

    public Employee officeCode(String officeCode) {
        this.officeCode = officeCode;
        return this;
    }

    public Employee reportsTo(Integer reportsTo) {
        this.reportsTo = reportsTo;
        return this;
    }

    public Employee jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(employeeNumber, employee.employeeNumber) && Objects.equals(lastName, employee.lastName)
                && Objects.equals(firstName, employee.firstName) && Objects.equals(extension, employee.extension)
                && Objects.equals(email, employee.email) && Objects.equals(officeCode, employee.officeCode)
                && Objects.equals(reportsTo, employee.reportsTo) && Objects.equals(jobTitle, employee.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle);
    }

    @Override
    public String toString() {
        return "{" + " employeeNumber='" + getEmployeeNumber() + "'" + ", lastName='" + getLastName() + "'"
                + ", firstName='" + getFirstName() + "'" + ", extension='" + getExtension() + "'" + ", email='"
                + getEmail() + "'" + ", officeCode='" + getOfficeCode() + "'" + ", reportsTo='" + getReportsTo() + "'"
                + ", jobTitle='" + getJobTitle() + "'" + "}";
    }

}
