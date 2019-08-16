package com.example.rabbitexample;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class AuthorizationRequest {
    private Long id;
    private Long issuerId;
    private Long acquirerId;
    private String cardNumber;
    private Double amount;
    private String name;
    private Date transactionDate;

    public AuthorizationRequest() {
    }

    public AuthorizationRequest (Long issuerId, Long acquirerId, String cardNumber,
                                 Double amount, String name, Date transactionDate) {
        this.issuerId = issuerId;
        this.acquirerId = acquirerId;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.name = name;
        this.transactionDate = transactionDate;
    }

    public Long getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Long issuerId) {
        this.issuerId = issuerId;
    }

    public Long getAcquirerId() {
        return acquirerId;
    }

    public void setAcquirerId(Long acquirerId) {
        this.acquirerId = acquirerId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "AuthorizationRequest{" +
                "id=" + id +
                ", issuerId=" + issuerId +
                ", acquirerId=" + acquirerId +
                ", cardNumber='" + cardNumber + '\'' +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", transactionDate=" + transactionDate +
                '}';
    }
}