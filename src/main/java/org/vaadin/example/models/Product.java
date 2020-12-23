package org.vaadin.example.models;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * Use @Column(name="accountid", nullable = false, unique = true) Columns in
 * Mysql are case insensitive. If you use case sensitive column name in @Column
 * then it will convert camel case to snake case.
 */
public class Product extends BaseEntity {
    private String productCode;

    // @Column(nullable = false)
    // private String productLine;

    private String productName;

    private String productScale;

    private String productVendor;

    private String productDescription;

    private int quantityInStock;

    private BigDecimal buyPrice;

    private BigDecimal msrp;

    private String productLine;

    public Product() {
    }

    protected Product(String productCode, String productName, String productScale, String productVendor,
            String productDescription, int quantityInStock, BigDecimal buyPrice, BigDecimal msrp, String productLine) {
        this.productCode = productCode;
        this.productName = productName;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.msrp = msrp;
        this.productLine = productLine;
    }

    public String getProductCode() {
        return this.productCode;
    }

    protected void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    protected void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductScale() {
        return this.productScale;
    }

    protected void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return this.productVendor;
    }

    protected void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    protected void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    protected void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getBuyPrice() {
        return this.buyPrice;
    }

    protected void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getMsrp() {
        return this.msrp;
    }

    protected void setMsrp(BigDecimal msrp) {
        this.msrp = msrp;
    }

    public String getProductLine() {
        return this.productLine;
    }

    protected void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public Product productCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public Product productName(String productName) {
        this.productName = productName;
        return this;
    }

    public Product productScale(String productScale) {
        this.productScale = productScale;
        return this;
    }

    public Product productVendor(String productVendor) {
        this.productVendor = productVendor;
        return this;
    }

    public Product productDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    public Product quantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
        return this;
    }

    public Product buyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public Product msrp(BigDecimal msrp) {
        this.msrp = msrp;
        return this;
    }

    public Product productLine(String productLine) {
        this.productLine = productLine;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(productCode, product.productCode) && Objects.equals(productName, product.productName)
                && Objects.equals(productScale, product.productScale)
                && Objects.equals(productVendor, product.productVendor)
                && Objects.equals(productDescription, product.productDescription)
                && quantityInStock == product.quantityInStock && Objects.equals(buyPrice, product.buyPrice)
                && Objects.equals(msrp, product.msrp) && Objects.equals(productLine, product.productLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode, productName, productScale, productVendor, productDescription, quantityInStock,
                buyPrice, msrp, productLine);
    }

    @Override
    public String toString() {
        return "{" + " productCode='" + getProductCode() + "'" + ", productName='" + getProductName() + "'"
                + ", productScale='" + getProductScale() + "'" + ", productVendor='" + getProductVendor() + "'"
                + ", productDescription='" + getProductDescription() + "'" + ", quantityInStock='"
                + getQuantityInStock() + "'" + ", buyPrice='" + getBuyPrice() + "'" + ", msrp='" + getMsrp() + "'"
                + ", productLine='" + getProductLine() + "'" + "}";
    }

}