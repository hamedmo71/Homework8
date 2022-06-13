package com.maktab74.entitiy;

import org.hibernate.annotations.LazyCollection;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class BanksEmployee extends WebsiteAudiances{

    @Column(nullable = false)
    private String personnelCode;

    public BanksEmployee() {
    }

    public BanksEmployee(String firstName, String lastName, String username, String password, String personnelCode) {
        super(firstName, lastName, username, password);
        this.personnelCode = personnelCode;
    }

    public String getPersonnelCode() {
        return personnelCode;
    }

    public void setPersonnelCode(String personnelCode) {
        this.personnelCode = personnelCode;
    }

    @Override
    public String toString() {
        return
                "personnelCode='" + personnelCode + '\'' ;
    }
}
