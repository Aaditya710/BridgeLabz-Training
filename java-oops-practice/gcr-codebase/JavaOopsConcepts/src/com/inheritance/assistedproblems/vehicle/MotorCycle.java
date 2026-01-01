package com.inheritance.assistedproblems.vehicle;

class MotorCycle extends Vehicle{
	  String name;
	  int maxSpeed;
	  String fuelType;
	  String engine;
	  
	  MotorCycle (String name, int maxSpeed, String fuelType, String engine){
			super(name, maxSpeed, fuelType);
			this.engine = engine;
}
	  
	  void vehicleDetails() {
		  System.out.println("Bike : ");
		  System.out.println("Bike name : " + super.name);
		  System.out.println("Bike maximum speed : " + super.maxSpeed);
		  System.out.println("Bike fuelType : " + super.fuelType);
		  System.out.println("Bike engine type : " + this.engine);
	  }
}

