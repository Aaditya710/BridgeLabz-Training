import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };
        if (month >= 1 && month <= 12)
            return months[month - 1];
        else
            return "Invalid Month";
    }

    // Method to check leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in the month
    static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month using Zeller's Congruence
    static int getFirstDayOfMonth(int month, int year) {
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;   
        int j = y / 100; 
        int h = (1 + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        int dayOfWeek = ((h + 6) % 7);
        return dayOfWeek;
    }

    // Method to display the calendar
    static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        System.out.printf("\n     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); 
        }
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
}
}
