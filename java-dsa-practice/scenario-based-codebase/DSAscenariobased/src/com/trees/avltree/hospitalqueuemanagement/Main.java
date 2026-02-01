package com.trees.avltree.hospitalqueuemanagement;

public class Main {

	public static void main(String[] args) {

		HospitalAVL hospital = new HospitalAVL();

		hospital.registerPatient(930, "Aditya");
		hospital.registerPatient(1015, "Ayush");
		hospital.registerPatient(945, "Aviral");
		hospital.registerPatient(1100, "Arpit");

		System.out.println("Patients by Arrival Time:");
		hospital.displayPatientsByArrival();

		System.out.println("\nDischarging patient at 09:45");
		hospital.dischargePatient(945);

		System.out.println("\nUpdated Queue:");
		hospital.displayPatientsByArrival();
	}
}