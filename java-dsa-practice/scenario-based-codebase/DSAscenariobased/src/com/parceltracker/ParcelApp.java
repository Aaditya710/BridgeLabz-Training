package com.parceltracker;

public class ParcelApp {
	public static void main(String [] args) {
		ParcelTracker tracker = new ParcelTracker();
		tracker.trackParcel();
		tracker.addCheckpoint("Shipped", "Customs Clearance");
		tracker.trackParcel();
		
		tracker = null;
		if(tracker != null) {
			tracker.trackParcel();
		} else {
			System.out.println("Parcel lost. Tracker unavailable.");
		}
		
	}

}
