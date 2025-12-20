import java.util.*;

public class QuotientAndReminder{
     public static int[] findQuotientAndReminder(int number, int divisor){           
          int quotient = number % divisor;
          int reminder = number / divisor;

          return new int[] { reminder, quotient };
     }
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);

          // Taking input from user
          int number = sc.nextInt();
          int divisor = sc.nextInt();
           
          int[] result = findQuotientAndReminder(number, divisor);


          System.out.println("reminder is: " + result[0]);
          System.out.println("quotient is: " + result[1]);

     }
}