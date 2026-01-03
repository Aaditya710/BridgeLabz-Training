package com.oopspillars.vehiclerentalsystem;

abstract class Vehicle implements Insurable {

    // Encapsulated fields
    private String vehicleNumber;
    private String type;
    protected double rentalRate;   // accessible to subclasses

    // Sensitive data (encapsulation)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Cost (" + days + " days): " + calculateRentalCost(days));
        System.out.println("Insurance Cost: " + calculateInsurance());
        System.out.println("Insurance Info: " + getInsuranceDetails());
        System.out.println("----------------------------------");
    }

    // Getters (no direct access to sensitive data)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected String getInsurancePolicyNumber() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

