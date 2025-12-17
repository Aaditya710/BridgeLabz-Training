// Creating CalculateDiscount class for calculating the discount on college fees

public class CalculateDiscount {
    public static void main(String[] args) {


        // Calculating the discount
        int fee = 125000;
        int discountPercent = 10;

        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;


        // Displaying the discount 
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
    }
}
