import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        double total = physics + chemistry + maths;
        double average = total / 3;
        double percentage = (total / 300) * 100; // Assuming each subject is out of 100

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        // Display the results
        System.out.println("\n--- Student Report ---");
        System.out.println("Physics Marks: " + physics);
        System.out.println("Chemistry Marks: " + chemistry);
        System.out.println("Maths Marks: " + maths);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
}
}