import java.util.*;

public class BmiFitnessTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter your weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // Calculating BMI using the formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Displaying BMI value
        System.out.println("\nYour BMI is: " + bmi);

        // Determining BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }
    }
}
