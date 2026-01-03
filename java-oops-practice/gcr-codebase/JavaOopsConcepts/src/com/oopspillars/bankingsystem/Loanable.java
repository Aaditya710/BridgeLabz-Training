package com.oopspillars.bankingsystem;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

