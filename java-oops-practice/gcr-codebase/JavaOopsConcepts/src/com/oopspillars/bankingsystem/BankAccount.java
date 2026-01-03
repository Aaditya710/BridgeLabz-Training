package com.oopspillars.bankingsystem;

abstract class BankAccount implements Loanable {

    // Encapsulated fields
    private String accountNumber;
    private String holderName;
    protected double balance;   // accessible to subclasses

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Display details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: ****" + accountNumber.substring(accountNumber.length() - 4));
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("----------------------------------");
    }

    // Getters (no direct setters for security)
    public double getBalance() {
        return balance;
    }
}

