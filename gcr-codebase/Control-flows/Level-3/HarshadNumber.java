import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;              
        int temp = number;          

        // Use while loop to sum the digits
        while (temp != 0) {
            int digit = temp % 10;  // Get last digit
            sum += digit;           // Add digit to sum
            temp = temp / 10;       // Remove last digit
        }

        // Check if the number is divisible by the sum of digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
}
}