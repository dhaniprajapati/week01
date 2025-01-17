//importing scanner class from util package
import java.util.Scanner;

public class LeapYearCheckerMethod
{

    //initialize method to check if the year is a leap year or not
    public static boolean isLeapYear(int year) 
	{
        //check if the year is divisible by 4 and not divisible by 100 or the year is divisibleby 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        //check if the year is graeter than 1582 or not
        if (year < 1582) 
		{
            System.out.println("Enter a year greater than or equal to 1582.");
            scanner.close();
            return;
        }

        //check if the year is a leap year
        if (isLeapYear(year)) 
		{
            System.out.println(year + " is a Leap Year.");
        } 
		else 
		{
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}