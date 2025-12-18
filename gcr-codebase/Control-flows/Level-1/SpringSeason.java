// Creating SpringSeason class to check if it is spring season or not
import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        // Taking input from user
        int month = input.nextInt();
        int day = input.nextInt();

        // Checking Spring Season
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {

            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
