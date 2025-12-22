import java.util.Scanner;
public class WordLength{

    // Method to find length of a String 
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }

    // Method to split text into words using charAt()
    static String[] splitstr(String str) {

        int length = findLength(str);

        // Count words
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (str.charAt(i) == ' ') {
                inWord = false;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int index = 0;
        spaceIndex[index++] = -1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;

        // Step 3: Extract words
        String[] words = new String[wordCount];
        int wordIndex = 0;

        for (int i = 0; i < spaceIndex.length - 1; i++) {
            int start = spaceIndex[i] + 1;
            int end = spaceIndex[i + 1];

            if (start < end) {
                words[wordIndex++] = str.substring(start, end);
            }
        }

        return words;
    }

    // Method to create 2D array of words 
    static String[][] createWordLengthTable(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  
            result[i][1] = String.valueOf(findLength(words[i]));        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String str = sc.nextLine();

        // Split text into words
        String[] words = splitstr(str);
        String[][] wordLengthTable = createWordLengthTable(words);

        // Displaying the output
        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int length = Integer.parseInt(wordLengthTable[i][1]); // Convert String to Integer
            System.out.println(word + "\t\t" + length);
        }
    }
}
