package com.traincompanion;

class TrainCompanion {
	Compartment head;
	Compartment tail;
	
	void addCompartment(String name, String service) {
		Compartment newCompartment = new Compartment(name, service);
		
		if(head == null) {
			head = tail = newCompartment;
		} else {
			tail.next = newCompartment;
			newCompartment.prev = tail;
			tail = newCompartment;
		}
		System.out.println("Added: " + name);
	}
	void removeCompartment(String name) {
			Compartment temp = head;
			while(temp != null) {
				if(temp.name.equalsIgnoreCase(name)) {
					if(temp == head)
						head = temp.next;
					if(temp == tail) 
						tail = temp.prev;
					if(temp.prev != null)
						temp.prev.next = temp.next;
					if(temp.next != null)
						temp.next.prev = temp.prev;
					
					System.out.println("Removed: " + name);
					return;
				}
				temp = temp.next;
			}
			System.out.println("Compartment not found");
	}
		
		void traverseForward() {
			System.out.println("\nTrain (Front to Back):");
			Compartment temp = head;
			while(temp != null) {
				System.out.println(temp.name + " - Service:" + temp.service);
				temp = temp.next;
			}
		}
		
		void traverseBackward() {
			System.out.println("\n Train (Back to Front):");
			Compartment temp = tail;
			while(temp != null) {
				System.out.println(temp.name + "- Service:" + temp.service);
				temp = temp.prev;
		    }
		}
		
		void showAdjacentCompartments(String name) {
			Compartment temp = head;
			
			while(temp != null) {
				if(temp.name.equalsIgnoreCase(name)) {
					System.out.println("\nCurrent:" + temp.name);
					System.out.println("Previous: " + 
					        (temp.prev != null ? temp.prev.name : "None"));
					System.out.println("Next: " + 
					        (temp.next != null ? temp.next.name: "None"));
					return;
				}
				temp = temp.next;
			}
			System.out.println("Compartment not found!");
	}
}
