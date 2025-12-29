import java.util.*;
public class NumberGuessingGame{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         int num = (int)(Math.random() * 100) + 1; 
         int tries = 5;
         boolean result = false;

         do{
           System.out.println("Guess a number between 1 to 100");
           int number = sc.nextInt();


           if(num > number){
             System.out.println("Too low");
             tries--;
             System.out.println("Tries left :" +tries);
           }
           else if(num < number){
             System.out.println("Too high");
             tries--;
             System.out.println("Tries left :" +tries);
           }
           else{
              System.out.println("Congratulations you guess the correct number");
              result = true;
           }
         }while(result || tries != 0);
     }
}