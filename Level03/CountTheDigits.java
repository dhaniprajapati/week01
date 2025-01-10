//import Scanner class from util package
import java.util.Scanner;

//create a CountTheOfDigits class 
public class CountTheDigits
{
    public static void main(String[] agrs)
	{
        //initialize Scanner object from class
        Scanner input = new Scanner(System.in); 

         //taking user input 
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 
        
        int originalNumber = number;

        //Create a variable count and initialize it to 0.
        int count = 0;

        //using a while loop to count digits of the number.
        while(number != 0)
		{

            //if the number is not equal to zero then increment the count variable by 1.
            count = count + 1;

            //divide the number by 10 to remove the last digit of the number
            number = number / 10;
        }
        //print the output
        System.out.println("There are "+count+" digits in a number "+originalNumber);
        input.close();
    }
}
