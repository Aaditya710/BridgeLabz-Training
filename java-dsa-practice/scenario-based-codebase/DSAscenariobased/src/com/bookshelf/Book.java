package com.bookshelf;

public class Book{
	int id;
	String name;
	
	Book(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + " - " + name;
	}
}
