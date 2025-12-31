package com.inheritance.assistedproblems.animalheirarchy;

class Bird extends Animal{
	Bird(String name, int age){
		super(name, age);
	}
	
	void makeSound() {
		System.out.println("Bird : chirp, chirp");
	}
}

