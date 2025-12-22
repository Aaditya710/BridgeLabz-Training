import java.util.Scanner;

public class TrimString {

    // Method to find start and end index after trimming spaces
    static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        int start = indexes[0];
        int end = indexes[1];
        String trimmedUsingCharAt = createSubstring(input, start, end);
        String trimmedBuiltIn = input.trim();
        boolean isSame = compareStrings(trimmedUsingCharAt, trimmedBuiltIn);

        // Displaying the output
        System.out.println("\nTrimmed String (Using charAt): \"" + trimmedUsingCharAt + "\"");
        System.out.println("Trimmed String (Using trim()): \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both strings equal? " + isSame);
    }
}
