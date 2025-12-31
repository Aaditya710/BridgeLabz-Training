package com.inheritance.assistedproblems.employeedetails;

class Intern extends Employee{
	String name;
	int id;
	int duration;
	Intern(String name, int id, int duration){
		super(name, id);
		this.duration = duration;
	}
	void displayDetails() {
		System.out.println("Intern name : " + super.name);
		   System.out.println("Intern id : " + super.id);
		   System.out.println("Duration of internship : " + this.duration + "months");
	}
}