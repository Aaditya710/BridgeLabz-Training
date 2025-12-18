import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i;           // Add to sum
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
}
}