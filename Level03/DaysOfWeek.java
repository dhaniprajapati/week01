//importing scanner object from util package
import java.util.Scanner;

// Create DaysOfWeek class
public class DaysOfWeek
{
    public static void main(String[] args)
	{
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 

        //taking user input
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = input.nextInt();

        System.out.print("Enter year: ");
        int y = input.nextInt();
		
        //create variables to store intermediate calculations
        int y0, x, m0, d0;

        //appply the formula for the Gregorian calendar
        y0 = y - (14 - m) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0) / 12) % 7;

        //print the output
        System.out.println("The day of the week is: " + d0);
		input.close();
    }
}
