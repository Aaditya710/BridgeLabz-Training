package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class EntryQueue {

    private Queue<String> queue = new LinkedList<>();
    private int capacity;

    public EntryQueue(int capacity) {
        this.capacity = capacity;
    }

    public void enqueue(String vehicle) {
        if (queue.size() == capacity) {
            System.out.println("Queue Overflow! " + vehicle + " cannot enter now.");
        } else {
            queue.add(vehicle);
            System.out.println("Vehicle added to waiting queue: " + vehicle);
        }
    }

    public String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return null;
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

