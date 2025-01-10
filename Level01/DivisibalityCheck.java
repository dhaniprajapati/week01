//importing scanner class from util package
import java.util.Scanner;
// Create DivisibalityCheck class
public class DivisibalityCheck
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input = new Scanner(System.in);
		//take input from user
		System.out.print("Enter the number:");
		int number= input.nextInt();
		//check whether the number is divisible by 5 or not
		int check = number%5;
		//if check value is 0 number is divisibal by 5
		if(check==0)
		{
			System.out.print("Is the number " +number+ " divisible by 5? Yes" );
		}
		else
		{
			System.out.print("Is the number " +number+ " divisible by 5? No" );
		}
		input.close();
	}
}


		