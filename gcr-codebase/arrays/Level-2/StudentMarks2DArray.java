import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Subject: 0 - Physics, 1 - Chemistry, 2 - Maths
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" :
                                 (j == 1) ? "Chemistry" : "Maths";

                System.out.print(subject + ": ");
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Re-enter!");
                    j--; // decrement index to re-enter value
                }
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Calculate grade
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Displaying the output 
        System.out.println("\n----- Student Results -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Percentage: " + percentage[i] +
                    "% | Grade: " + grade[i]);
        }
    }
}
