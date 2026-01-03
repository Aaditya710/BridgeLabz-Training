package com.oopspillars.vehiclerentalsystem;

class Bike extends Vehicle {

    public Bike(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Bike", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance | Policy: " + getInsurancePolicyNumber();
    }
}
