// Creating SquareSide class for getting the length of sides of square
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

      
        // Input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;


        // Displaying the length of side of a square
        System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter);
    }
}
