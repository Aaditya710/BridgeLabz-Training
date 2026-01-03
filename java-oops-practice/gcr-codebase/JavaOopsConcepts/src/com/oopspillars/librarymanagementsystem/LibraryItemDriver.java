package com.oopspillars.librarymanagementsystem;

public class LibraryItemDriver {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Java", "James Gosling");
        item.getItemDetails();
    }
}

