package RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(101, "Ramesh"));
        vehicles.add(new Bike(102, "Suresh"));
        vehicles.add(new Auto(103, "Mahesh"));

        double distance = 10; // km

        for (Vehicle v : vehicles) {
            v.updateLocation("MG Road");
            v.getVehicleDetails();
            System.out.println("Current Location: " + v.getCurrentLocation());
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            System.out.println("--------------------------------");
        }
    }
}

