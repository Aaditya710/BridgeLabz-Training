package com.inheritance.assistedproblems.employeedetails;

class Manager extends Employee{
	String name;
	int id;
	int teamSize;
	Manager(String name, int id, int teamSize){
		super(name, id);
		this.teamSize = teamSize;
	}
	void displayDetails() {
		System.out.println("Manager name : " + super.name);
		   System.out.println("Manager id : " + super.id);
		   System.out.println("Manager team size : " + this.teamSize);
	}
	
}
