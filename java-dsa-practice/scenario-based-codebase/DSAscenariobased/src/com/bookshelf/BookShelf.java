package com.bookshelf;
import java.util.*;

public class BookShelf {
	HashMap <String, LinkedList<Book>> catalog = new HashMap<>();
	
    void addBook(String genre, Book book) {
    	
    	if(!catalog.containsKey(genre)) {
    		catalog.put(genre, new LinkedList<>());
    	}
    	
    	catalog.get(genre).add(book);
    	System.out.println("Added : " + book.name);
    }
    
    void borrowBook(String genre, int bookId) {
    	if(!catalog.containsKey(genre)) {
    		System.out.println("Genre not found");
    		return;
    	}
    	
    	LinkedList<Book> books = catalog.get(genre);
    	
    	for(Book b : books) {
    		if(b.id == bookId) {
    			books.remove(b);
    			System.out.println("Borrowed : " + b.name);
    			return;
    		}
    	}
    	
    	System.out.println("Book not found");
    }
    
    void display() {
    	System.out.println("Library Catalog:");
    	for(String genre : catalog.keySet()) {
    		System.out.println("Genre" + genre);
    		for(Book b : catalog.get(genre)) {
    			System.out.println(" " + b);
    		}
    	}
    }
}
