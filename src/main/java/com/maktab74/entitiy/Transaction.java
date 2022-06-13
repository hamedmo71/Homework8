package com.maktab74.entitiy;

import com.maktab74.base.entity.BaseDomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Transaction extends BaseDomain<Long> {

    @Column(nullable = false)
    private String sourceCardNumber;

    @Column(nullable = false)
    private String destinationCardNumber;

    @Column(nullable = false)
    private Long amountOfMoneyTransfer;

    @Column(nullable = false)
    private Date transferDate;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account account;

    public Transaction() {
    }

    public String getSourceCardNumber() {
        return sourceCardNumber;
    }

    public void setSourceCardNumber(String sourceCardNumber) {
        this.sourceCardNumber = sourceCardNumber;
    }

    public String getDestinationCardNumber() {
        return destinationCardNumber;
    }

    public void setDestinationCardNumber(String destinationCardNumber) {
        this.destinationCardNumber = destinationCardNumber;
    }

    public Long getAmountOfMoneyTransfer() {
        return amountOfMoneyTransfer;
    }

    public void setAmountOfMoneyTransfer(Long amountOfMoneyTransfer) {
        this.amountOfMoneyTransfer = amountOfMoneyTransfer;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sourceCardNumber='" + sourceCardNumber + '\'' +
                ", destinationCardNumber='" + destinationCardNumber + '\'' +
                ", amountOfMoneyTransfer=" + amountOfMoneyTransfer +
                ", transferDate=" + transferDate +
                ", account=" + account +
                '}';
    }
}
