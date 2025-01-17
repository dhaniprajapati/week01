// create SpringSeasonMethod
public class SpringSeasonMethod
{

    //initialize method to check if it is Spring season or not
    public static boolean isSpringSeason(int month, int day) 
	{
        //check if the date is between March 20 and June 20
        if (month == 3 && day >= 20) 
		{
            return true;
        } 
		else if (month == 4) 
		{
            return true;
        } 
		else if (month == 5) 
		{
            return true;
        } 
		else if (month == 6 && day <= 20) 
		{
            return true;
        }
        return false;
    }

    public static void main(String[] args) 
	{
        //check if the correct number of arguments is provided
        if (args.length != 2) 
		{
            System.out.println("Please provide two integer values: month and day.");
            return; //exit the program if arguments are not correct
        }

        // Parse the command line arguments to integers
        int month = Integer.parseInt(args[0]); // First argument is the month
        int day = Integer.parseInt(args[1]);   // Second argument is the day

        // Call the method to check for Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}