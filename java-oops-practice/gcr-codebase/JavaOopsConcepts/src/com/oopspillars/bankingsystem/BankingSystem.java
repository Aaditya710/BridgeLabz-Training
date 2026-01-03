package com.oopspillars.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SB12345678", "Amit", 80000);
        BankAccount acc2 = new CurrentAccount("CA87654321", "Neha", 150000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount acc : accounts) {
            acc.deposit(5000);
            acc.withdraw(2000);
            acc.displayAccountDetails();   // dynamic polymorphism
        }
    }
}

