import java.util.*;

public class NumberOfChocolates{

     // Creating a method to get number of chocolates
     public static int[] findNumberOfChocolates(int noOfChocolates, int noOfStudents){
           
         int ChocolatesDistributed = noOfChocolates % noOfStudents;
         int RemainingChocolates = noOfChocolates / noOfStudents;
         return new int[] {ChocolatesDistributed, RemainingChocolates};

     }
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
       

          // Taking input from user
          int noOfChocolates = sc.nextInt();  
          int noOfStudents = sc.nextInt();

          int[] result = findNumberOfChocolates(noOfChocolates, noOfStudents);

          // Displaying output
          System.out.println("Number of chocolates eachchild gets: " + result[0]);
          System.out.println("Total number of remaining chocolates: " + result[1]);         
     }
}