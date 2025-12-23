import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters and return as 2D array
    static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }
        int uniqueCount = 0;
        boolean[] counted = new boolean[256]; 

        for (int i = 0; i < text.length(); i++) {
            int ascii = (int) text.charAt(i);
            if (!counted[ascii]) {
                uniqueCount++;
                counted[ascii] = true;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        counted = new boolean[256]; // Reset for storing characters

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int ascii = (int) ch;
            if (!counted[ascii]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ascii]);
                index++;
                counted[ascii] = true;
            }
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] freqTable = findCharacterFrequency(input);

        // Displaying the output
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------------");
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "\t\t" + freqTable[i][1]);
        }
    }
}
