import java.util.*;

public class PalindromeChecker {

    // Iterative method using start and end indexes
    static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method
    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true; 
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Using character arrays and reversed array
    static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();
        String text = input.replaceAll("\\s+", "").toLowerCase();
        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeCharArray(text);

        // Displaying the output
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3 (Char Array): " + (result3 ? "Palindrome" : "Not a Palindrome"));
    }
}
