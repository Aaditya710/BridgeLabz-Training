package com.inheritance.hierarchicalinheritance.bankaccountype;

class FixedDepositAccount extends BankAccount {
    int lockInPeriod; // in years

    FixedDepositAccount(int accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

