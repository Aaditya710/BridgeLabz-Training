package com.oopspillars.librarymanagementsystem;

public interface Reservable {
    void reserveItem(String borrowerName, String borrowerContact);
    boolean checkAvailability();
}

