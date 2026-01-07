package com.petpal;

import java.util.Random;

abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;   
    private int energy;   
    private String mood;

    public Pet(String name, String type, int age) {
        Random rand = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = rand.nextInt(50);
        this.energy = rand.nextInt(50) + 50;
        updateMood();
    }

    public void feed() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        updateMood();
        System.out.println(name + " has been fed.");
    }

    public void play() {
        energy -= 15;
        hunger += 10;
        updateMood();
        System.out.println(name + " enjoyed playing.");
    }

    public void sleep() {
        energy += 25;
        if (energy > 100) energy = 100;
        updateMood();
        System.out.println(name + " is sleeping.");
    }

    private void updateMood() {
        if (energy > 70 && hunger < 30)
            mood = "Happy";
        else if (energy < 30)
            mood = "Tired";
        else
            mood = "Normal";
    }

    public void showStatus() {
        System.out.println("Pet: " + name + " | Mood: " + mood +
                " | Energy: " + energy + " | Hunger: " + hunger);
    }

    abstract void makeSound();
}

