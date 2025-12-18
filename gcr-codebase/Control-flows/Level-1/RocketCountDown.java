// Creating RocketCountdown to make a countdown
import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the countdown number");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
