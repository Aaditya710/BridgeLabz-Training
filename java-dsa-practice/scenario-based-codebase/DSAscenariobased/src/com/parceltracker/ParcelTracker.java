package com.parceltracker;

public class ParcelTracker {
	private Stage head;
	public ParcelTracker() {
		head = new Stage("Packed");
		Stage shipped = new Stage("Shipped");
		Stage inTransit = new Stage("In Transit");
		Stage delivered = new Stage("Delivered");
		
		head.next = shipped;
		shipped.next = inTransit;
		inTransit.next = inTransit;
		inTransit.next = delivered;
	}
	
	public void trackParcel() {
		if(head == null) {
			System.out.println("Parcel missing. Tracking not possible.");
			return;
		}
		
		Stage temp = head;
		System.out.println("Parcel Tracking Status:");
		
		while(temp != null) {
			System.out.println(temp.name);
			if(temp.next != null) {
				System.out.println(" -> ");
			}
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void addCheckpoint(String afterStage, String newStage) {
		if(head == null) {
			System.out.println("Parcel missing. Cannot add checkpoint");
			return;
		}
		
		Stage temp = head;
		while(temp != null) {
			if(temp.name.equals(afterStage)) {
				Stage checkpoint = new Stage(newStage);
				checkpoint.next = temp.next;
				temp.next = checkpoint;
				System.out.println("Checkpoint added: "+ newStage);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Stage not found: " + afterStage);
	}
}
