import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number < 0) {
            number = Math.abs(number); // handle negative numbers
        }
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store digits of the number in array
        while (number != 0) {

            if (index == maxDigit) {
                break; // stop if array is full
            }

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying output
        System.out.println("\nLargest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
    }
}
