package com.oopspillars.vehiclerentalsystem;

class Truck extends Vehicle {

    public Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // loading charge
    }

    @Override
    public double calculateInsurance() {
        return 1200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy: " + getInsurancePolicyNumber();
    }
}

