// Creating PowerOfNumber class to solve
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        // Displaying output after calculating
        if (power < 0) {
            System.out.println("Please enter a positive integer for the power.");
        } else {
            int result = 1; // initialize result

            for (int i = 1; i <= power; i++) {
                result *= number; // multiply result by number in each iteration
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
 }
}