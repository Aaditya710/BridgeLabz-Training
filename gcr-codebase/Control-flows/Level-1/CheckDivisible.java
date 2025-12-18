// Creating checkDivisible class to check if the number is divisible or not

import java.util.*;
public class CheckDivisible{
     public static void main(String[]args){

          // Taking input from user
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the number");
          int number = input.nextInt();

          // Checking divisibility
          if(number%5==0){
              System.out.println("Is the number " + number + " divisible by 5? Yes");
          }else{
               System.out.println("Is the number " + number + " divisible by 5? No");
          }
}
}