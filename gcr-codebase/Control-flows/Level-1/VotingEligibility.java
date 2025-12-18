// Creating VotingEligibility class to check the voting eligibility of a person
import java.util.*;
public class VotingEligibility{
      public static void main(String[] args){
           Scanner input = new Scanner(System.in);

           // Taking input from user
           int age = input.nextInt();
           
           // Cheking if eligible or not
           if(age >= 18){
               System.out.println("The person's age is " + age + " and can vote.");
           }else{
                System.out.println("The person's age is " + age + " and cannot vote.");
           }

}
}