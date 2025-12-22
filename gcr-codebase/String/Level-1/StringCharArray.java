import java.util.Scanner;

public class StringCharArray {

    // Method to create user define array
    public static char[] getCharacters(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a string:");
        String str = sc.next();

        char[] arr1 = getCharacters(str);
        char[] arr2 = str.toCharArray();

        boolean result = compareCharArrays(arr1, arr2);

        // Displaying the output
        System.out.println("Characters using user-defined method:");
        for (char ch : arr1) {
            System.out.print(ch + " ");
        }

        System.out.println("\nCharacters using built-in toCharArray() method:");
        for (char ch : arr2) {
            System.out.print(ch + " ");
        }
        System.out.println("\ncharacter arrays equal? " + result);
    }
}

