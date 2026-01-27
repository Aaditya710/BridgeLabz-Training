package com.streams;

import java.io.*;

public class StudentBinaryFile {

    public static void main(String[] args) {

        String fileName = "students.dat";

        // WRITING student data to binary file
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeInt(101);           // Roll number
            dos.writeUTF("Aman");        // Name
            dos.writeDouble(8.75);       // GPA

            dos.writeInt(102);
            dos.writeUTF("Neha");
            dos.writeDouble(9.10);

            System.out.println("Student data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing student data.");
        }

        // READING student data from binary file
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            System.out.println("\nStudent Details:");

            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println(
                        "Roll: " + roll +
                        ", Name: " + name +
                        ", GPA: " + gpa);
            }

        } catch (IOException e) {
            System.out.println("Error while reading student data.");
        }
    }
}

