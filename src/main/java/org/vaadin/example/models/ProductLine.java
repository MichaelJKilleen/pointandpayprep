package org.vaadin.example.models;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Use @Column(name="accountid", nullable = false, unique = true) Columns in
 * Mysql are case insensitive. If you use case sensitive column name in @Column
 * then it will convert camel case to snake case.
 */

public class ProductLine {
    private String productLine;

    protected Integer version;

    protected String createdBy;

    protected Date createdDate;

    protected String lastModifiedBy;

    protected Date lastModifiedDate;

    public String textDescription;

    public String htmlDescription;

    private byte[] image;

    public ProductLine() {
    }

    public ProductLine(String productLine, String textDescription, String htmlDescription, byte[] image) {
        this.productLine = productLine;
        this.textDescription = textDescription;
        this.htmlDescription = htmlDescription;
        this.image = image;
    }

    public String getProductLine() {
        return this.productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return this.textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return this.htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public ProductLine productLine(String productLine) {
        this.productLine = productLine;
        return this;
    }

    public ProductLine textDescription(String textDescription) {
        this.textDescription = textDescription;
        return this;
    }

    public ProductLine htmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
        return this;
    }

    public ProductLine image(byte[] image) {
        this.image = image;
        return this;
    }

    public ProductLine(String productLine, Integer version, String createdBy, Date createdDate, String lastModifiedBy,
            Date lastModifiedDate, String textDescription, String htmlDescription, byte[] image) {
        this.productLine = productLine;
        this.version = version;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.textDescription = textDescription;
        this.htmlDescription = htmlDescription;
        this.image = image;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public ProductLine version(Integer version) {
        this.version = version;
        return this;
    }

    public ProductLine createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProductLine createdDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public ProductLine lastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public ProductLine lastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductLine)) {
            return false;
        }
        ProductLine productLine = (ProductLine) o;
        return Objects.equals(productLine, productLine.productLine) && Objects.equals(version, productLine.version)
                && Objects.equals(createdBy, productLine.createdBy)
                && Objects.equals(createdDate, productLine.createdDate)
                && Objects.equals(lastModifiedBy, productLine.lastModifiedBy)
                && Objects.equals(lastModifiedDate, productLine.lastModifiedDate)
                && Objects.equals(textDescription, productLine.textDescription)
                && Objects.equals(htmlDescription, productLine.htmlDescription)
                && Objects.equals(image, productLine.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productLine, version, createdBy, createdDate, lastModifiedBy, lastModifiedDate,
                textDescription, htmlDescription, image);
    }

    @Override
    public String toString() {
        return "{" + " productLine='" + getProductLine() + "'" + ", version='" + getVersion() + "'" + ", createdBy='"
                + getCreatedBy() + "'" + ", createdDate='" + getCreatedDate() + "'" + ", lastModifiedBy='"
                + getLastModifiedBy() + "'" + ", lastModifiedDate='" + getLastModifiedDate() + "'"
                + ", textDescription='" + getTextDescription() + "'" + ", htmlDescription='" + getHtmlDescription()
                + "'" + ", image='" + getImage() + "'" + "}";
    }

}