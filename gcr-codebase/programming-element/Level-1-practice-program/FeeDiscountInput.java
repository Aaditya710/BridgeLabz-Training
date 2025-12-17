import java.util.Scanner;
// Create FeeDiscountInput class to calculate Discount on college fee
import java.util.*;
public class FeeDiscountInput {
    public static void main(String[] args) {
        double fee;
        double discountPercent;

        // Use Scanner to get the input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Displaying the discount price and remaining fees and closing the scanner
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
        input.close();
    }
}
