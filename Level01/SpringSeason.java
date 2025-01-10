//importing scanner class from util package
import java.util.Scanner;
//Create SpringSeason class 
public class SpringSeason
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        // Getting inputs from the user
        System.out.print("Enter a month(1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the day: ");
        int day = input.nextInt();

        // Check if the date is in the spring season using if else statements and different logical operators
        if ((month == 3 && day >= 20 && day <= 31) || // March 20-31
            (month == 4 && day >= 1 && day <= 30) ||  // April
            (month == 5 && day >= 1 && day <= 31) ||  // May
            (month == 6 && day >= 1 && day <= 20)) {  // June 1-20
            System.out.print("It's a Spring Season.");
        } 
		else 
		{
            System.out.print("Not a Spring Season.");
        }

        input.close();
    }
}
