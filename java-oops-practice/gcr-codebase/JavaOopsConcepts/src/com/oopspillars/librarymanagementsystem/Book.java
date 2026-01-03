package com.oopspillars.librarymanagementsystem;

public class Book extends LibraryItem {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}
