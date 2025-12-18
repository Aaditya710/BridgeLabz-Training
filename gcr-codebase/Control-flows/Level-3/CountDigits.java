import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Initialize count variable
        int count = 0;
        int temp = number; // Store original number for display

        // Use loop to count digits
        if (number == 0) {
            count = 1; // Special case: 0 has 1 digit
        } else {
            if (number < 0) {
                number = -number;
            }

            while (number != 0) {
                number = number / 10; // Remove the last digit
                count++;               // Increase count
            }
        }
        System.out.println("Number of digits in " + temp + " is: " + count);
}
}