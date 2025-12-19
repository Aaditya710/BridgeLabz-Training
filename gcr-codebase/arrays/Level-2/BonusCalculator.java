import java.util.*;
public class BonusCalculator{
     public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          int total = 10;
          double [] salary = new double[total];
          double [] yos = new double[total];
          double [] bonus = new double[total];
          double [] newSalary = new double[total];
          
          // Taking input from user
          System.out.println("Enter salary and years of service of 10 employees ");
          for(int i = 0; i < totalEmployees; i++){
              System.out.println(i + 1);
              System.out.println("Enter salary : ");
              salary[i] = sc.nextDouble();
              System.out.println("Enter salary : ");
              yos[i] = sc.nextDouble();
           
              // Validate Input
              if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;   // decrement index to re-enter data
                continue;
            }

            totalOldSalary += salary[i];
        }

        // Calculate bonus and new salary
        for (int i = 0; i < totalEmployees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("Total Old Salary of Employees = " + totalOldSalary);
        System.out.println("Total Bonus Paid by Zara = " + totalBonus);
        System.out.println("Total New Salary of Employees = " + totalNewSalary);
    }
}                 