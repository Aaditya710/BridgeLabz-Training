import java.util.Scanner;

public class UpperCaseConversion {

    // Method to convert text to uppercase
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    // Method to compare strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String userUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();
        boolean result = compareStrings(userUpper, builtInUpper);

        // Displaying the output
        System.out.println("User-defined Uppercase : " + userUpper);
        System.out.println("Built-in Uppercase     : " + builtInUpper);
        System.out.println("Are both equal?        : " + result);
    }
}
