// Creating PowerOfNumberWhile class to check power of number
import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Taking output from user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();


        // Displaying output after calculating
        if (power < 0) {
            System.out.println("Please enter a positive integer for the power.");
        } else {
            int result = 1;     
            int counter = 0;     
            while (counter < power) {
                result *= number; 
                counter++;        
            }
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
}
}