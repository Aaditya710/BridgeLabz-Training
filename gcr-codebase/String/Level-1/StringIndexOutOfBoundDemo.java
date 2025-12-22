import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate the exception
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught!");
            System.out.println("Invalid index accessed in the string.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a string:");
        String text = sc.next();n
        System.out.println("Generating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException()");
        }
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(text);
    }
}
