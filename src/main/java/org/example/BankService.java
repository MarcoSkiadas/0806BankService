package org.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
Create a class 'BankService' that manages a set of accounts.
Implement a method in BankService to open an account. It should only require a customer as an argument and should return the new account number.
Implement a method in BankService to transfer a specific amount (as BigDecimal) from one account number (as String) to another account number (as String).
 */
public class BankService {

    private Map<String, Account> accounts;
    public BankService() {
        accounts = new HashMap<String, Account>();
    }

    public Account openAccout(Client customer) {

        BigDecimal newAccountBalance = BigDecimal.ZERO;
        String newAccountNumber = customer.firstName()+customer.lastName()+customer.customerNumber();

        Account newAccount = new Account(newAccountNumber,newAccountBalance,customer);

        accounts.put(newAccountNumber, newAccount);
        return  newAccount;
    }
    public void transferMoney(String fromCustomer, String toCustomer, BigDecimal amount) {
        Account fromAccount = accounts.get(fromCustomer);
        Account toAccount = accounts.get(toCustomer);

        if (fromCustomer.equals(toCustomer)) {
            System.out.println("You cannot transfer Money within the same Account");
        } else if(fromAccount.getAccountBalance().compareTo(amount)<0) {
            System.out.println("You do not have enough money to transfer Money");
        }
        else {
            fromAccount.withdrawMoney(amount);
            toAccount.depositMoney(amount);
            System.out.println("Money transferred to "+toCustomer+" from "+fromCustomer+" by amount of "+amount+"€");



        }
    }

}
