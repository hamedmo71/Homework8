package com.maktab74.entitiy;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class BranchBoss extends BanksEmployee {


    @OneToOne (optional = false, mappedBy = "branchBoss")
    private BankBranch bankBranch;

    @OneToMany (mappedBy = "branchBoss")
    private List<Staff> staffList;

    public BranchBoss() {
    }

    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
        this.bankBranch = bankBranch;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
