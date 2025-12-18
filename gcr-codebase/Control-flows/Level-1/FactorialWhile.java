// Creating FactorialWhile class to find the factorial
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Check if the number is positive
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= num) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
}
}
``