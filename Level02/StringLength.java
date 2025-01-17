import java.util.Scanner;

public class StringLength
{
    // method to calculate the length of the string without using length() method
    public static int calculateLength(String str) 
	{
		// create a variable and initialize count to 0
        int count = 0; 
        try 
		{
			//run infinite loop
            while (true) 
			{
                str.charAt(count); //to access each character
                count++; //increment counter
            }
        } 
		catch (IndexOutOfBoundsException e) 
		{
            //exception indicates the end of the string
        }
        return count; //return the final count
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        //calculate length using user defined method
        int userDefined= calculateLength(inputString);

        //calculate length using built-in method
        int builtIn = inputString.length();

        //print the results
        System.out.println("Length calculated using custom method: " + userDefined);
        System.out.println("Length calculated using built-in method: " + builtIn);

        scanner.close(); // close the scanner
    }
}
