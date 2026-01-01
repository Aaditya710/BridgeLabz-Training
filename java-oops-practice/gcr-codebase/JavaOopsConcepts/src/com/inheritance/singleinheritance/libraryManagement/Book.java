package com.inheritance.singleinheritance.libraryManagement;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    
    void displayInfo() {
    	System.out.println("Details of books");
    }
}
