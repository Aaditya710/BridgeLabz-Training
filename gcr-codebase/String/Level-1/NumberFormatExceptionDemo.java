import java.util.*;
public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println("Converted number: " + num);
    }

    // Method to handle NumberFormatException
    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Invalid input: Cannot convert text to number.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a value:");
        String str = sc.next();

        // Calling method 
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(str);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred in generateException()");
        }
        
        // Calling method to handle exception
        System.out.println("Handling NumberFormatException");
        handleException(str); 
    }
}
