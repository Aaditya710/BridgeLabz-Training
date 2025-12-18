// Creating RocketCountdownFor creating a countdown using for loop
import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the countdown number");
        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

}
}
