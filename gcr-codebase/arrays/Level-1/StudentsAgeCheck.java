// Creating StudentsAgeCheck class to check that How many students are eligible to vote

import java.util.*;

public class StudentsAgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        // Taking input from user
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }

        // Displaying output
        for (int i = 0; i < 10; i++) {
            if (age[i] >= 18) {
                System.out.println("Student with age " + age[i] + " can vote.");
            } 
            else if(age[i] < 0){
                System.out.println("Invalid age");
            }
            else {
                System.out.println("Student with age " + age[i] + " cannot vote.");
            }
        }
    }
}
