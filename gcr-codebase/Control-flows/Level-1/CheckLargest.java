// Creating CheckLargest class to find out the largest number
import java.util.*;
public class CheckLargest{
      public static void main(String[] args){
      
           // Taking input from user
           Scanner input = new Scanner(System.in);

           System.out.println("Enter first number");
           int a = input.nextInt();

           System.out.println("Enter second number");
           int b = input.nextInt();

           System.out.println("Enter third number");
           int c = input.nextInt();

           // Checking which number is largest
           if(a < b && b > c){
                  System.out.println(" Is the first number the largest? No");
                  System.out.println(" Is the second number the largest? Yes");
                  System.out.println(" Is the third number the largest? No");
           }else if(a > b && b > c){
                  System.out.println(" Is the first number the largest? Yes");
                  System.out.println(" Is the second number the largest? No");
                  System.out.println(" Is the third number the largest? No");
           }else{
                  System.out.println(" Is the first number the largest? No");
                  System.out.println(" Is the second number the largest? No");
                  System.out.println(" Is the third number the largest? Yes");
           }


 }
}