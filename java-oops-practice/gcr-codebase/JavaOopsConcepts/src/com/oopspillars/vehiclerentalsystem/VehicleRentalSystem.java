package com.oopspillars.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12AB1234", 1500, "CAR998877"));
        vehicles.add(new Bike("MH14CD5678", 500, "BIK445566"));
        vehicles.add(new Truck("MH10EF9012", 3000, "TRK112233"));

        int rentalDays = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails(rentalDays); // polymorphism
        }
    }
}
