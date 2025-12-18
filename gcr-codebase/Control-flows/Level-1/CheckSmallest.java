// Creating CheckSmallest class for checking the smallest number

import java.util.*;
public class CheckSmallest{
      public static void main(String[] args){
      
           // Taking input from user
           Scanner input = new Scanner(System.in);

           System.out.println("Enter first number");
           int a = input.nextInt();

           System.out.println("Enter second number");
           int b = input.nextInt();

           System.out.println("Enter third number");
           int c = input.nextInt();

           // Checking if the first number is smallest
           if(a < b || b < c){
                  System.out.println(" Is the first number the smallest? Yes");
           }else{
                System.out.println(" Is the first number the smallest? No");
           }

 }
}