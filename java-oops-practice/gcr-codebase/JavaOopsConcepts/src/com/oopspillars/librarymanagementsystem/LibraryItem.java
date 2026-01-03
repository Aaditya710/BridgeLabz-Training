package com.oopspillars.librarymanagementsystem;

public abstract class LibraryItem implements Reservable {

    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(itemId + " " + title + " " + author);
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        isAvailable = false;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
