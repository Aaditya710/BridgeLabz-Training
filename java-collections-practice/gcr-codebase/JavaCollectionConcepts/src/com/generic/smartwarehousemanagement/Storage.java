package com.generic.smartwarehousemanagement;

import java.util.*;

public class Storage<T extends WarehouseItem> {
	private List<T> items = new ArrayList<>();
	// add items
	public void addItem(T item) {
		items.add(item);
	}
	//getter 
	public List<T> getItems(){
		return items;
	}
}
