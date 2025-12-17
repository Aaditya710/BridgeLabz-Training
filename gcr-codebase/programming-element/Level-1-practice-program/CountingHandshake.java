// Creating the CountingHandshake for counting the total number of handshakes as given

import java.util.Scanner;

public class CountingHandshake {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();


        // Calculate maximum number of handshakes and Displaying
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        sc.close();
    }
}
