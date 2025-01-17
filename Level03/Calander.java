import java.util.Scanner;

public class import java.util.Scanner;

public class CalendarDisplay
{

    // Method to get the name of the month
    public static String getMonthName(int month)
    {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // month is 1-based
    }
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year)
    {
        // Leap year is divisible by 4, but not divisible by 100, unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year)
    {
        // Array of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // If the month is February, check for leap year
        if (month == 2 && isLeapYear(year))
        {
            return 29; // February has 29 days in a leap year
        }
        return daysInMonth[month - 1]; // month is 1-based
    }
    // Method to get the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year)
    {
        int y = year;
        int m = month;
        // Adjust the month and year for the algorithm
        if (m < 3)
        {
            m += 12;
            y--;
        }   
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0; // Day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }
    // Method to display the calendar
    public static void displayCalendar(int month, int year)
    {
        // Get the name of the month and the number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the header of the calendar
        System.out.println("     " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++)
        {
            System.out.print("    "); // 4 spaces for indentation
        }
        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++)
        {
            System.out.printf("%3d ", day); // Print day right-justified in a field of width 3

            // If it's Saturday, move to the next line
            if ((firstDay + day) % 7 == 0)
            {
                System.out.println();
            }
        }
        System.out.println(); // Move to the next line after the last day
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }
}
