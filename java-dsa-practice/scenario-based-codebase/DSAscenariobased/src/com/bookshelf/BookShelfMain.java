package com.bookshelf;

public class BookShelfMain {
	public static void main(String [] args) {
		BookShelf library = new BookShelf();
		
		library.addBook("Fiction", new Book(1, "Harry Potter"));
		library.addBook("Fiction", new Book(2, "The Hobbit"));
		library.addBook("Science", new Book(3, "Physics Basics"));
		
		library.display();
		library.borrowBook("Fiction", 1);
		library.display();
	}

}
