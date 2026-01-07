package com.petpal;

class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
