//importing scanner class from util package
import java.util.Scanner;
//Create NaturalNumbersSum class 
public class NaturalNumbersSum
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		int sum=0;
		//create the variable and initialize its value 0
		int sumValue= 0;
		//create the variable and initialize counter value 1
		
		// Check if the number is a natural number
        if (number >0) 
		{
			// Calculate the sum of n natural numbers using while loop
			for(int i= 1;i<=number;i++)
			{
				sumValue+= i;
				
			}
				
            // Calculate the sum of n natural numbers using formula
            sum = number * (number + 1) / 2;
            
        } 
		System.out.println("The sum of n natural numbers using formula is " + sum);
		System.out.println("The sum of n natural numbers using loop is " + sumValue);
		if(sum==sumValue)
		{
			System.out.println(" Both the values are equal");
		}
		else
		{
			System.out.println(" Both the values are not equal");
		}
		

        input.close();
    }
}