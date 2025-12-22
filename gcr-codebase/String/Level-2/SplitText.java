import java.util.Scanner;

public class SplitText {

    // Method to find length of String without using length()
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

    // Method to split text into words without using split()
    static String[] splitTextManually(String str) {

        int length = findLength(str);
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
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        // Extract words using indexes
        String[] words = new String[wordCount];
        int wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length - 1; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];

            if (start < end) {
                words[wordIndex++] = str.substring(start, end);
            }
        }

        return words;
    }

    // Method to compare two String arrays
    static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String str = sc.nextLine();

        String[] manualSplit = splitTextManually(str);
        String[] builtInSplit = str.split(" ");
        boolean result = compareStringArrays(manualSplit, builtInSplit);

        // Displaying the output
        System.out.println("\nManual Split Result:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);
    }
}
