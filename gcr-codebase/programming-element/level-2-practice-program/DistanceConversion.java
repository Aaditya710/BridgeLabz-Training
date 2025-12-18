// Creating DistanceConversion for Converting the distance
import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {


        // Taking Input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Displaying the output
        System.out.println("The distance in yards is " + distanceInYards +" while the distance in miles is " + distanceInMiles);
    }
}
