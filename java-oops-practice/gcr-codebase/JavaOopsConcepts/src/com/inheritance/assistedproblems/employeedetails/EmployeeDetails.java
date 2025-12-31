package com.inheritance.assistedproblems.employeedetails;

public class EmployeeDetails {
	public static void main(String [] args) {

       Employee e1 = new Manager("Aaditya Joshi",101, 24);
 	   Employee e2 = new Developer("Ayush Chouhan",104, "Java");
 	   Employee e3 = new Intern("Ramvishal",113, 6);
 	   
  	    e1.displayDetails();
 	    e2.displayDetails();
 	    e3.displayDetails();
    }
}
