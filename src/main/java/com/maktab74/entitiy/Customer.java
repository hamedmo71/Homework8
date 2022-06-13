package com.maktab74.entitiy;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Customer extends WebsiteAudiances {

    @OneToMany(mappedBy = "customer")
    private List<Account> accountList;


}
