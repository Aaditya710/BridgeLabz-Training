// Creating NaturalNumberSum to find the sum of natural number
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a number");
        int n = input.nextInt();

        // Checking if the number is a natural number
        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

}            
}