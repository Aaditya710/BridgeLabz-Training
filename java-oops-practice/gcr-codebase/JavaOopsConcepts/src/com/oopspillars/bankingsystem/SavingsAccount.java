package com.oopspillars.bankingsystem;

class SavingsAccount extends BankAccount {

    private double interestRate = 4.0; // 4%

    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 50000;
    }
}

