// Creating the QuotientAndReminder class for getting quotient and reminder

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {


        // Input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;


        // Displaying the output
        System.out.println("The Quotient is " + quotient +" and Reminder is " + remainder +" of two number " + number1 + " and " + number2);
    }
}
