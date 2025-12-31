package com.inheritance.assistedproblems.employeedetails;

class Employee {
       String name;
       int id;
 
       Employee(String name, int id){
    	   this.name = name;
    	   this.id = id;
       }
       void displayDetails(){
    	   System.out.println("Employee name : " + this.name);
   		   System.out.println("Employee id : " + this.id);
       }
}
