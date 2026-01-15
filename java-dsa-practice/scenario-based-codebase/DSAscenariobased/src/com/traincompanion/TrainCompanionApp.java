package com.traincompanion;

public class TrainCompanionApp {
	public static void main(String [] args) {
		TrainCompanion train = new TrainCompanion();
		
		train.addCompartment("Engine", "Control");
		train.addCompartment("C1", "WiFi");
		train.addCompartment("C2", "Pantry");
		train.addCompartment("C3", "Medical");
		train.addCompartment("Guard", "Security");
		
		train.traverseForward();
		train.traverseBackward();
		train.showAdjacentCompartments("C2");
		train.removeCompartment("C1");
		train.traverseForward();
	}

}
