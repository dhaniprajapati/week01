import java.util.Scanner;
//create a class UntilZeroSum
public class UntilZeroSum 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        //create variable and  initialize total value as 0.0
        double total = 0.0;
		//taking user input
		System.out.print("Enter number: ");
        double inputUser = input.nextDouble();

       //using a while loop to continue until the user enters 0
        while (inputUser > 0) 
		{
			
			//adding the user input to the total
            total += inputUser;
			
			System.out.print("Enter a number: ");
            inputUser = input.nextDouble();
			//to check if the user entered 0 using if statement
            if (inputUser == 0) 
			{
                break; //exit the loop if the input is 0
            }
            
        }

        //print the total value
        System.out.println("The total sum is: " + total);

        // Close the scanner
		input.close();
	}	
}