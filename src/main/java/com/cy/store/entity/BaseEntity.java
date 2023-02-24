package com.cy.store.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 实体类的基类
 */
//@Data
public class BaseEntity implements Serializable {
    private  String createdUser;
    private Date created_time;
    private  String modified_user;
    private Date modified_time;

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getModified_user() {
        return modified_user;
    }

    public void setModified_user(String modified_user) {
        this.modified_user = modified_user;
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseEntity)){
            return false;
        }

        BaseEntity that = (BaseEntity) o;

        if (getCreatedUser() != null ? !getCreatedUser().equals(that.getCreatedUser()) : that.getCreatedUser() != null) {
            return false;
        }
        if (getCreated_time() != null ? !getCreated_time().equals(that.getCreated_time()) : that.getCreated_time() != null) {
            return false;
        }
        if (getModified_user() != null ? !getModified_user().equals(that.getModified_user()) : that.getModified_user() != null) {
            return false;
        }
        return getModified_time() != null ? getModified_time().equals(that.getModified_time()) : that.getModified_time() == null;
    }

    @Override
    public int hashCode() {
        int result = getCreatedUser() != null ? getCreatedUser().hashCode() : 0;
        result = 31 * result + (getCreated_time() != null ? getCreated_time().hashCode() : 0);
        result = 31 * result + (getModified_user() != null ? getModified_user().hashCode() : 0);
        result = 31 * result + (getModified_time() != null ? getModified_time().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", created_time=" + created_time +
                ", modified_user='" + modified_user + '\'' +
                ", modified_time=" + modified_time +
                '}';
    }
}
