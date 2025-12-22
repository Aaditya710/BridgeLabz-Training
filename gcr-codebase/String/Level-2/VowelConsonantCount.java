import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    static int[] findVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {   // length allowed here
            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        int[] result = findVowelsAndConsonants(input);

        // Displaying the output
        System.out.println("\nTotal Vowels: " + result[0]);
        System.out.println("Total Consonants: " + result[1]);
    }
}
