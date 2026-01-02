package com.inheritance.hybridinheritance.restaurantmanagement;

public class RestaurantDriver {
	public static void main(String[] args) {
		Worker chef = new Chef("Ramesh", 101);
		Worker waiter = new Waiter("Sohan", 102);

		chef.performDuties();
		waiter.performDuties();
	}
}
