package com.inheritance.singleinheritance.libraryManagement;

class Author extends Book{
	
    String name;
    String bio;

    Author( String title, int publicationYear ,String name, String bio) {
    	super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    
    void displayInfo() {
        System.out.println("Book Title: " + super.title);
        System.out.println("Publication Year: " + super.publicationYear);
        System.out.println("Author Name: " + this.name);
        System.out.println("Author Bio: " + this.bio);
    }
}

