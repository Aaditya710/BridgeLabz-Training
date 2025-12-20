import java.util.Scanner;

public class SpringSeason{

     // Creating a method to solve
     static void CheckingSeason(int day, int month){
            if ((month == 3 && day >= 20) ||(month == 4) ||(month == 5)                       ||(month == 6 && day <= 20)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
     }
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          
          // Taking input from user
          int day = sc.nextInt();
          int month = sc.nextInt();

          // Calling the method
          CheckingSeason(day, month);
     }
}