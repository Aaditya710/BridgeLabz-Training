package com.assistedproblems.vehicle;

class Car extends Vehicle{
	  
	  String capacity;
	  
      Car(String name, int maxSpeed, String fuelType, String capacity){
    			super(name, maxSpeed, fuelType);
    			this.capacity = capacity;
      }
	  
	  void vehicleDetails() {
		  System.out.println("Car : ");
		  System.out.println("Car name : " + super.name);
		  System.out.println("Car maxSpeed : " + super.maxSpeed);
		  System.out.println("Car fuelType : " + super.fuelType);
		  System.out.println("Car capacity : " + this.capacity);
	  }
}
