package com.inheritance.assistedproblems.vehicle;

class Truck extends Vehicle{
	  String name;
	  int maxSpeed;
	  String fuelType;
	  String loadCapacity;
	  
  Truck(String name, int maxSpeed, String fuelType, String loadCapacity){
			super(name, maxSpeed, fuelType);
			this.loadCapacity = loadCapacity;
  }
	  
	  void vehicleDetails() {
		  System.out.println("Truck : ");
		  System.out.println("Truck name : " + super.name);
		  System.out.println("Truck maximum speed : " + super.maxSpeed);
		  System.out.println("Truck fuelType : " + super.fuelType);
		  System.out.println("Truck load capacity : " + this.loadCapacity);
	  }
}

