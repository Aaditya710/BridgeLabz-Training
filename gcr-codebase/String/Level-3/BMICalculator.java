import java.util.*;

public class BMICalculator {

    // Method to calculate BMI and status given weight and height (in kg, cm)
    static String[] calculateBMIStatus(double weight, double heightCm) {

        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal weight";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";
        return new String[]{String.valueOf(bmi), status};
    }

    // Method to compute BMI and status for all persons
    static String[][] computeBMITable(double[][] personData) {
        int n = personData.length;
        String[][] bmiTable = new String[n][4]; // weight, height, BMI, status

        for (int i = 0; i < n; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            String[] bmiStatus = calculateBMIStatus(weight, height);
            bmiTable[i][0] = String.valueOf(weight);
            bmiTable[i][1] = String.valueOf(height);
            bmiTable[i][2] = bmiStatus[0]; // BMI
            bmiTable[i][3] = bmiStatus[1]; // Status
        }

        return bmiTable;
    }

    // Method to display the BMI table 
    static void displayBMITable(String[][] bmiTable) {
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");

        for (int i = 0; i < bmiTable.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    bmiTable[i][0] + "\t\t" +
                    bmiTable[i][1] + "\t\t" +
                    bmiTable[i][2] + "\t\t" +
                    bmiTable[i][3]
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[][] personData = new double[n][2]; 

        System.out.println("Enter weight (kg) and height (cm) of 10 persons:");

        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " height (cm): ");
            personData[i][1] = sc.nextDouble();
        }
        String[][] bmiTable = computeBMITable(personData);

        // Displaying the output
        displayBMITable(bmiTable);
    }
}
