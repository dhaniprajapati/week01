//importing scanner class from util package
import java.util.Scanner;
//creating AgeForVoting class
public class AgeForVoting
{
	public static void main(String[] args)
	{
		//initializing scanner class object
		Scanner input= new Scanner(System.in);
		
		//Taking inputs from user
		System.out.print("Enter current age: ");
		int age = input.nextInt();
		
		//checking whether the person is eligible to vote or not using if-else statement
		if(age>=18)
		{
			System.out.print( "The person's age is " +age+ " and can vote. ");
		}
		else
		{
			System.out.print( "The person's age is " +age+ " and cannot vote. ");
		}
		//closing scanner class
		input.close();
	}
}

