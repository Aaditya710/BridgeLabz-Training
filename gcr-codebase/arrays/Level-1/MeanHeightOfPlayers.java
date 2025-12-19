import java.util.Scanner;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for heights
        System.out.println("Enter the height of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;

        // Display result
        System.out.println("\nMean height of the football team = " + mean);
    }
}
