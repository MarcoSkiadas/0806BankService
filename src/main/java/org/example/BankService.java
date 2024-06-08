package org.example;

import java.math.BigDecimal;

/*
Create a class 'BankService' that manages a set of accounts.
Implement a method in BankService to open an account. It should only require a customer as an argument and should return the new account number.
Implement a method in BankService to transfer a specific amount (as BigDecimal) from one account number (as String) to another account number (as String).
 */
public class BankService {

    public Account openAccout(Client customer) {

        BigDecimal newAccountBalance = BigDecimal.ZERO;
        String newAccountNumber = customer.firstName()+customer.lastName()+customer.customerNumber();
        return new Account(newAccountNumber,newAccountBalance,customer);

    }
}
