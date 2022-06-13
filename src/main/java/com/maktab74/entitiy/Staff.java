package com.maktab74.entitiy;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Staff extends BanksEmployee{

    @ManyToOne (optional = false)
    private BankBranch bankBranch;

    @ManyToOne (optional = false)
    private BranchBoss branchBoss;


    public Staff() {
    }

    public Staff(String firstName, String lastName, String username, String password, String personnelCode) {
        super(firstName, lastName, username, password, personnelCode);
    }

    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
        this.bankBranch = bankBranch;
    }

    public BranchBoss getBranchBoss() {
        return branchBoss;
    }

    public void setBranchBoss(BranchBoss branchBoss) {
        this.branchBoss = branchBoss;
    }
}
