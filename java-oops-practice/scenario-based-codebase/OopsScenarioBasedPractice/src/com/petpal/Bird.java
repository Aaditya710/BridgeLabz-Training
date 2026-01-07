package com.petpal;

class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}

