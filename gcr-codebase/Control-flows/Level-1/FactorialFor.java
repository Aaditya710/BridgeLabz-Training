// Creating FactorialFor class to find the factorial
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Check whether the number is a natural number
        if (num <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            // Print result
            System.out.println("Factorial of " + num + " is " + factorial);
        }

}
}