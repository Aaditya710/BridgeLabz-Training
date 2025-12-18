// Creating FactorsWhileLoop class to find the factors of given number
import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Taking input from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

    
        // Displaying result after calculating
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            System.out.println("Factors of " + number + " are:");
            int i = 1; // counter variable
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        sc.close();
    }
}