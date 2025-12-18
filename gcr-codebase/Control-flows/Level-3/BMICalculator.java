import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        // Determine weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display the results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("Weight: %.2f kg\n", weight);
        System.out.printf("Height: %.2f m\n", heightM);
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
}
}