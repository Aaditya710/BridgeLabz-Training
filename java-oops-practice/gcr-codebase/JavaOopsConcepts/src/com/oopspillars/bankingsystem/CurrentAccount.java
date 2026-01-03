package com.oopspillars.bankingsystem;

class CurrentAccount extends BankAccount {

    private double interestRate = 2.0; // 2%

    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Business Loan Applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 100000;
    }
}

