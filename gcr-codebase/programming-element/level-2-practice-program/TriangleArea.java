// Creating TriangleArea class for getting the area of triangle 
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

           
        // Taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaSqCm = 0.5 * base * height;

        // Convert square centimeters to square inches
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " 
                            + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
