import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
          System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a string:");
        String str = sc.next();
        handleException(str);
       }
}
