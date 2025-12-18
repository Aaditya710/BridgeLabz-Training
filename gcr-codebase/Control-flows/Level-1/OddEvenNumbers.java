// Creating OddEvenNumbers class to find if number is odd or even
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            for (int i = 1; i <= number; i++) {

                // Check odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }
}
}