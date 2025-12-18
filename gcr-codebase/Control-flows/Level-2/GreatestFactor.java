// Creating GreatestFactor class to find the greatest factor of a number
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            int greatestFactor = 1; // initialize greatest factor

            // loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i; // assign factor
                    break; // exit the loop after finding the greatest
                }
            }

            System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
        }
}
}