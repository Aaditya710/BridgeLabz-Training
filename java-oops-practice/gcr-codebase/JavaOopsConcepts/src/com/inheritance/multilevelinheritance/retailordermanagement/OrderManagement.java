package com.inheritance.multilevelinheritance.retailordermanagement;

public class OrderManagement {
    public static void main(String[] args) {

        Order o1 = new Order(101, "2025-01-10");
        ShippedOrder o2 = new ShippedOrder(102, "2025-01-11", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder(103, "2025-01-12", "TRK67890", "2025-01-15");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}

