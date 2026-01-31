package com.iostream.writecsv;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String file = "src/main/java/com/iostream/writecsv/employees.csv";

        try (FileWriter writer = new FileWriter(file)) {

            writer.append("ID,Name,Department,Salary\n");

            writer.append("101,Aditya,IT,55000\n");
            writer.append("102,Ayush,HR,48000\n");
            writer.append("103,Aviral,Finance,62000\n");
            writer.append("104,Nitya,Marketing,50000\n");
            writer.append("105,Arpit,Development,70000\n");

            System.out.println("CSV file created successfully");

        } catch (IOException e) {
            System.out.println("Error writing CSV file");
        }
    }
}