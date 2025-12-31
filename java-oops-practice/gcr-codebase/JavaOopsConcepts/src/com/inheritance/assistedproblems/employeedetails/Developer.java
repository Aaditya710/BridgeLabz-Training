package com.inheritance.assistedproblems.employeedetails;

class Developer extends Employee{
	String name;
	int id;
	String programmingLanguage;
	Developer(String name, int id, String programmingLanguage){
		super(name, id);
		this.programmingLanguage = programmingLanguage;
	}
	void displayDetails() {
		System.out.println("Developer name : " + super.name);
		System.out.println("Developer id : " + super.id);
	    System.out.println("Developer team size : " + this.programmingLanguage);
	}
	
}
