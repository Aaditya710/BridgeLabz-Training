package com.trafficmanager;

public class TrafficManager {

    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        EntryQueue entryQueue = new EntryQueue(3);

        // Vehicles arrive
        entryQueue.enqueue("CAR-101");
        entryQueue.enqueue("CAR-102");
        entryQueue.enqueue("CAR-103");
        entryQueue.enqueue("CAR-104"); // Overflow case

        // Vehicles enter roundabout
        while (!entryQueue.isEmpty()) {
            String vehicle = entryQueue.dequeue();
            if (vehicle != null) {
                roundabout.addVehicle(vehicle);
            }
        }

        roundabout.printRoundabout();

        // Vehicle exits
        roundabout.removeVehicle("CAR-102");
        roundabout.printRoundabout();
    }
}

