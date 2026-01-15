package com.trafficmanager;

public class Roundabout {

    private Vehicle head = null;

    // Add vehicle to roundabout
    public void addVehicle(String vehicleNumber) {
        Vehicle newVehicle = new Vehicle(vehicleNumber);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }
        System.out.println("Vehicle entered roundabout: " + vehicleNumber);
    }

    // Remove vehicle from roundabout
    public void removeVehicle(String vehicleNumber) {

        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = null;

        do {
            if (curr.vehicleNumber.equals(vehicleNumber)) {

                // Only one vehicle
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        head = head.next;
                    }
                    if (prev != null) {
                        prev.next = curr.next;
                    } else {
                        Vehicle temp = head;
                        while (temp.next != curr) {
                            temp = temp.next;
                        }
                        temp.next = curr.next;
                    }
                }
                System.out.println("Vehicle exited roundabout: " + vehicleNumber);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Vehicle not found in roundabout.");
    }

    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout vehicles: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}

