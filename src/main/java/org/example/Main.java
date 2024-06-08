package org.example;

public class Main {
    public static void main(String[] args) {

        Client customer1 = new Client("Hans", "Müller","123");
        Client customer2 = new Client("Anna","Meyer","234");
        BankService bankService = new BankService();
        bankService.openAccout(customer1);
        bankService.openAccout(customer2);



    }
}