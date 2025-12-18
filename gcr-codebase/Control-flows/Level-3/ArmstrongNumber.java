import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number; 
        int sum = 0;                 

        // Use while loop to process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;    // Find the last digit
            sum += digit * digit * digit;       // Cube the digit and add to sum
            originalNumber = originalNumber / 10; // Remove the last digit
        }

        // Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
}
}