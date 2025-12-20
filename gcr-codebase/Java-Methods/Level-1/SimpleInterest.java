import java.util.Scanner;

class SimpleInterest {

    // Method to calculate Simple Interest
    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Displaying the Output
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +", Rate of Interest " + rate +" and Time " + time);
    }
}
