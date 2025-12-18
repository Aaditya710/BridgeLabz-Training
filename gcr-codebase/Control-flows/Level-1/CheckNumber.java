// Creating CheckNumber class for checking the number
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a number");
        int number = input.nextInt();

        // Checking the number
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
}
}
