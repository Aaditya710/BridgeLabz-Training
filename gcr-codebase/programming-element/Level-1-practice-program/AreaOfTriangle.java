// Creating AreaOfTriangle class for calculating the area of triangle
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Input base and height in inches
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        double areaSqInches = 0.5 * base * height;
        double areaSqCm = areaSqInches * 6.4516;


        // Output
        System.out.println("Area of Triangle:");
        System.out.println("In square inches: " + areaSqInches);
        System.out.println("In square centimeters: " + areaSqCm);
        sc.close();
    }
}
