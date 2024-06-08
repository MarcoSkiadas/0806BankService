package org.example;

import java.math.BigDecimal;

/*
Create a class 'Account' (not a record, should initially be mutable) with the properties Account Number (String), Account Balance (BigDecimal), and the associated customer.
Implement a method to deposit money into the account.
Implement a method to withdraw money from the account.
 */
public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client customer;

    public Account(String accountNumber, BigDecimal accountBalance, Client customer) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }
    public BigDecimal depositMoney(BigDecimal amount) {
        return accountBalance.add(amount);
    }
    public BigDecimal withdrawMoney(BigDecimal amount) {
        return accountBalance.subtract(amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customer=" + customer +
                '}';
    }
}
