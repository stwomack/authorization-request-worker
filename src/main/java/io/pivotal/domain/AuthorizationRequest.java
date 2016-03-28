package io.pivotal.domain;

import java.util.Date;

public class AuthorizationRequest {
    private Long issuerId;
    private Long acquirerId;
    private Long cardNumber;
    private Double amount;
    private String name;
    private Date transactionDate;

    public AuthorizationRequest(Long issuerId, Long acquirerId, Long cardNumber, Double amount, String name, Date transactionDate) {
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

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
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
        return "{" +
                "issuerId: " + issuerId +
                ", acquirerId: " + acquirerId +
                ", cardNumber: " + cardNumber +
                ", amount: " + amount +
                ", name: '" + name + '\'' +
                ", transactionDate: " + transactionDate +
                '}';
    }
}