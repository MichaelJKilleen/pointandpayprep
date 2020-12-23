package org.vaadin.example.models;

import java.util.Objects;

/**
 * Use @Column(name="accountid", nullable = false, unique = true) Columns in
 * Mysql are case insensitive. If you use case sensitive column name in @Column
 * then it will convert camel case to snake case.
 */

public class ProductLineDetail {

    private String productLine;

    public String textDescription;

    public ProductLineDetail() {
    }

    public ProductLineDetail(String productLine, String textDescription) {
        this.productLine = productLine;
        this.textDescription = textDescription;
    }

    public String getProductLine() {
        return this.productLine;
    }

    public String getTextDescription() {
        return this.textDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductLineDetail)) {
            return false;
        }
        ProductLineDetail productLineDetail = (ProductLineDetail) o;
        return Objects.equals(productLine, productLineDetail.productLine)
                && Objects.equals(textDescription, productLineDetail.textDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productLine, textDescription);
    }

    @Override
    public String toString() {
        return "{" + " productLine='" + getProductLine() + "'" + ", textDescription='" + getTextDescription() + "'"
                + "}";
    }

}