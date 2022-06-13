package com.maktab74.entitiy;

import com.maktab74.base.entity.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CreditCard extends BaseDomain<Long> {

    @Column(nullable = false, unique = true)
    private String number;

    @Column(nullable = false)
    private Integer ccv2;

    @Column(nullable = false)
    private Date expirationDate;

    @Column(nullable = false)
    private Long password;

    @Column(columnDefinition = "tinyint(1)")
    private Boolean isActive;

    @Column(nullable = false)
    private Long cardBalance;

    @OneToOne (optional = false, cascade= CascadeType.ALL)
    private Account account;

    public CreditCard() {
    }

    public CreditCard(String number, Integer ccv2, Date expirationDate, Long password, Boolean isActive) {
        this.number = number;
        this.ccv2 = ccv2;
        this.expirationDate = expirationDate;
        this.password = password;
        this.isActive = isActive;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getCcv2() {
        return ccv2;
    }

    public void setCcv2(Integer ccv2) {
        this.ccv2 = ccv2;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Long getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(Long cardBalance) {
        this.cardBalance = cardBalance;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "{" +
                "number='" + number + '\'' +
                ", ccv2=" + ccv2 +
                ", expirationDate=" + expirationDate +
                ", password=" + password +
                ", isActive=" + isActive +
                '}';
    }
}
