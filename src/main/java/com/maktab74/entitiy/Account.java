package com.maktab74.entitiy;

import com.maktab74.base.entity.BaseDomain;
import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account extends BaseDomain<Long> {

    @Column(nullable = false, unique = true)
    private Long accountNumber;

    @Column(nullable = false)
    private Long accountPassword;

    @Column(nullable = false)
    private Long accountBalance;

    @ManyToOne(optional = false)
    private Customer customer;

    @ManyToOne(optional = false)
    private BankBranch bankBranch;

    @OneToOne
    private CreditCard creditCard;

    @OneToMany
    private List<Transaction> transactionList;

    public Account() {
    }

    public Account(Long accountNumber, Long accountPassword) {
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountPassword(Long accountPassword) {
        this.accountPassword = accountPassword;
    }

    public Long getAccountPassword() {
        return accountPassword;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
        this.bankBranch = bankBranch;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountPassword=" + accountPassword +
                '}';
    }
}
