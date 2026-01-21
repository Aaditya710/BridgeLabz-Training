package com.tailorshop;

public class Order {
    int orderId;
    int deadline; 
    
    //contructor
    public Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Order " + orderId + " - Deadline: " + deadline + " days";
    }
}
