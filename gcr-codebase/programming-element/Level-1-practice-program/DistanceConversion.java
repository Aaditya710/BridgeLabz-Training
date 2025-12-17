// Create DistanceConversion Class to convert the kilometer and miles

import java.util.Scanner;
public class DistanceConversion {
    public static void main(String[] args) {
        double km;
        double miles;


        // taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();   
        miles = km / 1.6;


        // Displaying the converted distance
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
