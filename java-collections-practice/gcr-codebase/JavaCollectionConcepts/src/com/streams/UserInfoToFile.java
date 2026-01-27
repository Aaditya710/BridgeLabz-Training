package com.streams;
import java.io.*;

public class UserInfoToFile {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Taking input from user
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Writing data to file
            FileWriter fw = new FileWriter("user_info.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");

            fw.close();

            System.out.println("Information saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
