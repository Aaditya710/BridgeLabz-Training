import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for n students in 3 subjects
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // 3 subjects: Physics, Chemistry, Maths
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(101); // Physics 0-100
            scores[i][1] = rand.nextInt(101); // Chemistry 0-100
            scores[i][2] = rand.nextInt(101); // Maths 0-100
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to calculate grades based on percentage
    static String[] calculateGrades(double[][] totalsPercentages) {
        int n = totalsPercentages.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percent = totalsPercentages[i][2];
            if (percent >= 90)
                grades[i] = "A+";
            else if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }

        return grades;
    }

    // Method to display the scorecard in tabular format
    static void displayScorecard(int[][] scores, double[][] totalsPercentages, String[] grades) {
        System.out.println("S.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int)totalsPercentages[i][0] + "\t" +
                    totalsPercentages[i][1] + "\t" +
                    totalsPercentages[i][2] + "\t\t" +
                    grades[i]
            );
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 10;
        int[][] scores = generateScores(n);
        double[][] totalsPercentages = calculateTotalAveragePercentage(scores);
        String[] grades = calculateGrades(totalsPercentages);

        displayScorecard(scores, totalsPercentages, grades);
    }
}
