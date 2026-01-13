package com.ambulanceroute;

public class RouteManage {
	private HospitalUnit head;
	private HospitalUnit tail;
	
	public void addUnit(String unitName, boolean available) {
		
		HospitalUnit newUnit = new HospitalUnit(unitName, available);
		if(head == null) {
			head = newUnit;
			tail = newUnit;
			tail.next = head;
		}
		else {
			tail.next = newUnit;
			tail = newUnit;
			tail.next = head;
		}
	}
	
	public void findAvailableUnit() {
		if(head == null) {
			System.out.println("No hospital units available");
			return;
		}
		
		HospitalUnit temp = head;
		do {
			if(temp.available) {
				System.out.println("Patient redirected to: " + temp.unitName);
				return;
			}
			temp = temp.next;
		}while(temp != head);
		System.out.println("No unit available for emergency.");
	}
	
	public void removeUnit(String unitName) {
		if(head == null) {
			return;
		}
		
		HospitalUnit current = head;
		HospitalUnit previous = tail;
		
		do {
			if(current.unitName.equalsIgnoreCase(unitName)) {
				if(head == tail) {
					head = null;
					tail = null;
				}
				else {
					previous.next = current.next;
					if(current == head) {
						head = current.next;
						tail.next = head;
					}
				}
				System.out.println(unitName + " removed (under maintainance)");
				return;
			}
			previous = current;
			current = current.next;
		}while(current != head);
		System.out.println("unit not found: " +unitName);
	}

}
