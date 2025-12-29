// Creating DiscountDashboard class for shopkeeper discount dashboard
import java.util.*;
public class DiscountDashboard{
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Total number of items : ");
          int totalItems = sc.nextInt();
          double totalPrice = 0;
          double Discount = 0;
          double actualPrice = 0;

          int [] arr = new int [totalItems];
          for(int i = 0; i < totalItems; i++){
             System.out.println("Price of items : ");
             arr[i] = sc.nextInt();
             totalPrice += arr[i];
          }
          if(totalPrice >= 2500 && totalPrice < 5000){
             Discount = totalPrice * 0.025;
          }
          else if(totalPrice >= 5000 && totalPrice < 10000){
             Discount = totalPrice * 0.050;
          }
          else if(totalPrice >= 10000){
             Discount = totalPrice * 0.15;
          }
          else{ 
             System.out.println("Your bill is : " + totalPrice);
             System.out.println("You have to add items worth" + (5000 - totalPrice) + "to avail discounts");
          }
            
          actualPrice = totalPrice - Discount;
          System.out.println("Your bill is : " + totalPrice);
          System.out.println("Your bill after discount is : " + actualPrice);
       
     }
}