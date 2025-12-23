import java.util.*;
public class FrequencyNestedLoops {

    // Method to find frequency of characters 
    static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
        }
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue; 
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] freqResult = findCharacterFrequency(input);

        // Displaying the output
        System.out.println("\nCharacter Frequencies:");
        for (String s : freqResult) {
            System.out.println(s);
        }
    }
}
