package com.inheritance.hierarchicalinheritance.bankaccountype;

public class BankSystem {
    public static void main(String[] args) {

        BankAccount s1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount c1 = new CheckingAccount(102, 30000, 10000);
        BankAccount f1 = new FixedDepositAccount(103, 100000, 5);

        s1.displayAccountType();
        s1.showBalance();

        c1.displayAccountType();
        c1.showBalance();

        f1.displayAccountType();
        f1.showBalance();
    }
}

