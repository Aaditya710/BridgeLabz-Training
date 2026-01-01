package com.inheritance.singleinheritance.libraryManagement;

class BookDetails {
    public static void main(String[] args) {

        Book author = new Author("The Alchemist", 1988, "Paulo Coelho","Brazilian author known for spiritual novels");
        
        author.displayInfo();
        
    }
}

