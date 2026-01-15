package com.smartcheckout;

import java.util.Arrays;

public class SupermarketApp {
	public static void main(String [] args) {
		SmartCheckout checkout = new SmartCheckout();
		checkout.addItem("Milk", 40, 5);
		checkout.addItem("Bread", 30, 3);
		checkout.addItem("Eggs", 6, 12);
		
		Customer c1 = new Customer("Rahul", Arrays.asList("Milk", "Bread"));
		Customer c2 = new Customer("Anita", Arrays.asList("Eggs", "Milk", "Milk"));
		
		checkout.addCustomer(c1);
		checkout.addCustomer(c2);
		
		checkout.processCheckout();
		checkout.processCheckout();
		checkout.processCheckout();	
	}
}
