package com.smartcheckout;

import java.util.*;

public class SmartCheckout {
	private Queue<Customer> queue = new LinkedList<>();
	private HashMap<String, Item> itemMap = new HashMap<>();
	
	public void addItem(String name, double price, int stock) {
		itemMap.put(name,  new Item(price, stock));
	}
	
	public void addCustomer(Customer customer) {
		queue.add(customer);
		System.out.println("Customer added: " + customer.name);
	}
	
	public void processCheckout() {
		if(queue.isEmpty()) {
			System.out.println("No customers in queue.");
			return;
		}
		
		Customer customer = queue.poll();
		double total = 0;
		
		System.out.println("\nBilling for "+ customer.name);
		for(String itemName : customer.items) {
			Item item = itemMap.get(itemName);
			
			if(item == null) {
				System.out.println("Item not found: " + itemName);
				continue;
			}
			
			if(item.stock <= 0) {
				System.out.println("Out of stock: " + itemName);
				continue;
			}
			
			total += item.price;
			item.stock--;
			
			System.out.println(itemName + " - $" + item.price);
		}
		
		System.out.println("Total Bill: $" + total);
	}
}
