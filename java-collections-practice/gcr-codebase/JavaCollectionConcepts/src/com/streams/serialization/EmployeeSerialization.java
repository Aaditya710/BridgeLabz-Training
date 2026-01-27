package com.streams.serialization;

import java.io.*;
import java.util.ArrayList;

public class EmployeeSerialization {

    public static void main(String[] args) {

        String fileName = "employees.dat";

        // Create employee list
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Rahul", "IT", 50000));
        list.add(new Employee(2, "Amit", "HR", 40000));
        list.add(new Employee(3, "Neha", "Finance", 55000));

        // SERIALIZATION
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(list);
            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        // DESERIALIZATION
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            ArrayList<Employee> empList =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("\nEmployee Details:");
            for (Employee e : empList) {
                e.display();
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}

