//importing scanner class from util package
import java.util.Scanner;
//create a class CheckLeapYear
public class CheckLeapYear
{
    public static void main(String[] args) 
	{
		//initializing scanner class object
        Scanner input = new Scanner(System.in);

        //taking user inputs
        
		System.out.print("Enter a year: ");
        int year = input.nextInt();

        //check if the year is valid or not using if else statement
        if (year < 1582) 
		{
            System.out.println("Year must be 1582 or later.");
        } 
		else 
		{
            //using nested if else statement to find the leap year
            if (year % 4 == 0) 
			{
                if (year % 100 == 0) 
				{
                    if (year % 400 == 0) 
					{
                        System.out.println(year + " is a Leap Year.");
                    } 
					else 
					{
                        System.out.println(year + " is not a Leap Year.");
                    }
                } 
				else 
				{
                    System.out.println(year + " is a Leap Year.");
                }
            } 
			else 
			{
                System.out.println(year + " is not a Leap Year.");
            }

           
        }

        //Close the scanner
        input.close();
    }
}
