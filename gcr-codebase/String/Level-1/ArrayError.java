import java.util.*;

public class ArrayError {

    // Method to generate exception
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    // Method to handle exception
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException occurred");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter number of names:");
        int n = sc.nextInt();

        String[] names = new String[n];
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        try {
            generateException(names);
        } catch (RuntimeException e) {
            System.out.println("Exception generated");
        }
        handleException(names);
    }
}
