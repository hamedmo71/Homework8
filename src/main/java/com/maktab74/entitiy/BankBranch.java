package com.maktab74.entitiy;

import com.maktab74.base.entity.BaseDomain;

import javax.persistence.*;
import java.util.List;

@Entity
public class BankBranch extends BaseDomain<Long> {

    @Column(nullable = false)
    private String branchName;

    @Column(nullable = false, unique = true)
    private Long branchCode;

    @OneToMany (mappedBy = "bankBranch")
    private List<Account> accountList;

    @OneToMany (mappedBy = "bankBranch")
    private List<Staff> staffList;

    @OneToOne (optional = false)
    private BranchBoss branchBoss;

    public BankBranch() {
    }

    public BankBranch(String branchName, Long branchCode) {
        this.branchName = branchName;
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public BranchBoss getBranchBoss() {
        return branchBoss;
    }

    public void setBranchBoss(BranchBoss branchBoss) {
        this.branchBoss = branchBoss;
    }

    @Override
    public String toString() {
        return "BankBranch{" +
                "branchName='" + branchName + '\'' +
                ", branchCode=" + branchCode +
                '}';
    }
}
