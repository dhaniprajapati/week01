//importing scanner class from util package
import java.util.Scanner;
//craete SumOfNaturalNumbersMethod class
public class SumOfNaturalNumbersMethod
{

    //initialize method to calculate the sum of the first n natural numbers
    public static int sumOfNaturalNumbers(int n)
	{
		//create sum variable and initialize it to 0
        int sum = 0; 
        //run for loop from 1 to n to calculate the sum
        for (int i = 1; i <= n; i++) 
		{
			//add the number to sum
            sum += i;
        }
		//return the calculated value to the result
        return sum; 
    }
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        //check if the input is a positive number or not
        if (n < 1) 
		{
            System.out.println("Enter a positive number greater than 0.");
        } else {
            //call the method to calculate the sum of n natural numbers
            int sum = sumOfNaturalNumbers(n);

            //print the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        //close the scanner class
        scanner.close();
    }
}