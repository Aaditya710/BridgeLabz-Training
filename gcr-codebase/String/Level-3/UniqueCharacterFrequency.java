import java.util.*;
public class UniqueCharacterFrequency {

    // Method to find the length of string 
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string
        }
        return count;
    }

    // Method to find unique characters using nested loops
    static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters using unique characters
    static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] freqTable = new String[uniqueChars.length][2];

        int[] freq = new int[256];
        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }
        for (int i = 0; i < uniqueChars.length; i++) {
            freqTable[i][0] = String.valueOf(uniqueChars[i]);
            freqTable[i][1] = String.valueOf(freq[(int) uniqueChars[i]]);
        }

        return freqTable;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] freqTable = findCharacterFrequency(input);

        // Displaying the result
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t\t" + freqTable[i][1]);
        }
    }
}
