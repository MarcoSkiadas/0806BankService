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

}
