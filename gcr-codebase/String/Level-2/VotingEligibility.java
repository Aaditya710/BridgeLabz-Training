import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random 2-digit ages 
    static int[] generateAges(int n) {

        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; 
        }
        return ages;
    }

    // Method to check voting eligibility
    static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // age as String
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display the 2D array
    static void displayResult(String[][] table) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < table.length; i++) {
            boolean canVote = Boolean.parseBoolean(table[i][1]);
            System.out.println(table[i][0] + "\t" + canVote);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] resultTable = checkVotingEligibility(ages);

        // Displaying the result
        displayResult(resultTable);
    }
}
