//importing scanner class from util package
import java.util.Scanner;
//creating FindTheSmallestNumber class
public class FindTheSmallestNumber
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input= new Scanner(System.in);
		
		//Taking inputs from user
		System.out.print("Enter number 1: ");
		int number1= input.nextInt();
		System.out.print("Enter number 2: ");
		int number2= input.nextInt();
		System.out.print("Enter number 3: ");
		int number3= input.nextInt();
		
		//to find the smallest number and print it
		if((number1<number2) && (number1<number3))
		{
			System.out.print("Is the first number the smallest? Yes");
		}
		else
		{
			System.out.print("Is the first number the smallest? No");
		}
		input.close();
	}
}

