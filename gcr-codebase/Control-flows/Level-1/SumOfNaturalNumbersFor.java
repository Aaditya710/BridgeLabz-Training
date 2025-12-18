import java.util.Scanner;

public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a natural number
        if (n <= 0) {
            System.out.println("The entered number is not a natural number.");
        } else {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor = sumFor + i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula n*(n+1)/2 = " + sumFormula);

            // Compare results
            if (sumFor == sumFormula) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }
        }
}
}