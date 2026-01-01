package com.assistedproblems.vehicle;

class Vehicle {
	String name;
	int maxSpeed;
	String fuelType;
	
	Vehicle(String name, int maxSpeed, String fuelType){
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}

	void vehicleDetails() {
		System.out.println("Details of vehicles :");
	}
}
