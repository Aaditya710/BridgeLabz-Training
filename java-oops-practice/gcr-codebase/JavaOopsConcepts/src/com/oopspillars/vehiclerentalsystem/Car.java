package com.oopspillars.vehiclerentalsystem;

class Car extends Vehicle {

    public Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance | Policy: " + getInsurancePolicyNumber();
    }
}

