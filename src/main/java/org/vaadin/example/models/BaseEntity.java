package org.vaadin.example.models;

import java.util.Date;

/**
 * https://www.baeldung.com/database-auditing-jpa
 * https://vladmihalcea.com/the-best-way-to-implement-an-audit-log-using-hibernate-envers/
 */

public abstract class BaseEntity {

    protected Integer version;

    protected String createdBy;

    protected Date createdDate;

    protected String lastModifiedBy;

    protected Date lastModifiedDate;

    public BaseEntity() {
    }

    public BaseEntity(Integer version, Date createdDate, Date lastModifiedDate) {
        this.version = version;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getVersion() {
        return version;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public BaseEntity version(Integer version) {
        this.version = version;
        return this;
    }

    public BaseEntity createdDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public BaseEntity lastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

}
