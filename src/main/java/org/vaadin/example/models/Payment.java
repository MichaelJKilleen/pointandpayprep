package org.vaadin.example.models;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Payment extends BaseEntity {
    private int customerNumber;

    private String checkNumber;

    private Date paymentDate;

    private BigDecimal amount;

    public Payment() {
    }

    public Payment(int customerNumber, String checkNumber, Date paymentDate, BigDecimal amount) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public int getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCheckNumber() {
        return this.checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Payment customerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public Payment checkNumber(String checkNumber) {
        this.checkNumber = checkNumber;
        return this;
    }

    public Payment paymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public Payment amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) o;
        return customerNumber == payment.customerNumber && Objects.equals(checkNumber, payment.checkNumber)
                && Objects.equals(paymentDate, payment.paymentDate) && Objects.equals(amount, payment.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerNumber, checkNumber, paymentDate, amount);
    }

    @Override
    public String toString() {
        return "{" + " customerNumber='" + getCustomerNumber() + "'" + ", checkNumber='" + getCheckNumber() + "'"
                + ", paymentDate='" + getPaymentDate() + "'" + ", amount='" + getAmount() + "'" + "}";
    }

}
