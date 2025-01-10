//importing scanner class from util package
import java.util.Scanner;
//Create Table class 
public class Table
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);

        //get the input from the user
        System.out.print("Enter number: ");
        int number = input.nextInt();
		//Print multiplication table from 6 to 9 using for loop
        for (int i = 6; i <= 9; i++) 
		{
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close the scanner
		input.close();
	}
}