// Creating EmployeeBonus class to find if the employee is eligible for bonus or not
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking salary input from user
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        // Check eligibility for bonus
        if (years > 5) {
            bonus = salary * 0.05;   // 5% bonus
            System.out.println("Bonus amount = " + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5 years.");
        }
}
}