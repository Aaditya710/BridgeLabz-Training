package RideHailingApplication;

class Bike extends Vehicle {

    public Bike(int vehicleId, String driverName) {
        super(vehicleId, driverName, 8); // Bike rate
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // no base charge
    }
}
