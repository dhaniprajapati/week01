
import java.util.Scanner;
//create a class FindTheFactor
public class FindTheFactor
{//importing scanner class from util package
    public static void main(String[] args) 
	{
		//initializing scanner class object
        Scanner input = new Scanner(System.in);
		//taking input from user
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();


        //check if the number is positive or not using for loop
        if (number <= 0) 
		{
            System.out.println("Enter a positive integer greater than 0.");
        } 
		else 
		{
            System.out.println("Factors of " + number + " are:");

            //for loop to find factors of number
            for (int i = 1; i < number; i++) 
			{
                //check if the number is perfectly divisible by i or not
                if (number % i == 0) 
				{
                    System.out.println(i); // Print the factor
                }
            }
            
        }
        // Close the scanner
        input.close();
	}
}