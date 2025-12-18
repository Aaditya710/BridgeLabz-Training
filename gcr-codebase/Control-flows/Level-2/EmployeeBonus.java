// Creating EmployeeBonus class for getting employee bonus
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Taking input from user
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();

   
        // Displaying results after checking
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("You are eligible for a bonus.");
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
            System.out.println("Bonus amount: 0");
        }
}
}