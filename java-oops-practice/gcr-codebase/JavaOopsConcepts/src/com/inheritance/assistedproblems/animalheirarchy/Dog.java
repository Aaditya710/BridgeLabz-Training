package com.inheritance.assistedproblems.animalheirarchy;

class Dog extends Animal{
	Dog(String name, int age){
		super(name, age);
	}
	
	void makeSound() {
		System.out.println("Dog : bark, bark");
	}
}
