import java.util.Scanner;

public class CheckNumber{

     // Creating a method to solve
     static int CheckingNumber(int n){
          if(n < 0){
             return -1;
          }else if(n == 0){
               return 0;
          }else{
               return 1;
          }

     }
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          
          // Taking input from the user
          int n = sc.nextInt();
 
          // Calling the method
          CheckingNumber(n);
          System.out.println(CheckingNumber(n));
     }

}