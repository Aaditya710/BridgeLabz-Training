package com.inheritance.assistedproblems.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle a1 = new Car("Toyota Wellfire", 170, "Petrol", "7 seater");
		 Vehicle a2 = new MotorCycle("GT 650", 170, "Petrol", "4 stroke");
		 Vehicle a3 = new Truck("Volvo maz", 130, "Diesel", "40 ton");
		 
		 a1.vehicleDetails();
		 a2.vehicleDetails();
		 a3.vehicleDetails();
	}

}

