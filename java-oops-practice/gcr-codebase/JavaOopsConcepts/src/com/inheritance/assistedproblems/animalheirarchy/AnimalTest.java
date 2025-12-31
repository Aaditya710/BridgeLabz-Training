package com.inheritance.assistedproblems.animalheirarchy;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal a1 = new Dog("Jack", 5);
		 Animal a2 = new Cat("Kitty", 4);
		 Animal a3 = new Bird("Sparrow", 2);
		 
		 a1.makeSound();
		 a2.makeSound();
		 a3.makeSound();
	}

}
