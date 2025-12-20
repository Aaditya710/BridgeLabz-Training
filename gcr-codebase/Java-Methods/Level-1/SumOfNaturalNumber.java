import java.util.Scanner;

class SumOfNaturalNumbers {

    // Method to calculate sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
        } else {
            int result = calculateSum(n);
            System.out.println("The sum of first " + n + " natural numbers is " + result);
        }
    }
}
