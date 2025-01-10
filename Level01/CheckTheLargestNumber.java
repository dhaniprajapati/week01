import java.util.Scanner;

public class CheckTheLargestNumber 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check for the largest number using if-else statement
        if (number1 >= number2 && number1 >= number3) 
		{
            System.out.print("Is the first number the largest? Yes");
        } 
		else 
		{
            System.out.print("Is the first number the largest? No");
        }

        if (number2 >= number1 && number2 >= number3) 
		{
            System.out.print("Is the second number the largest? Yes");
        } 
		else 
		{
            System.out.print("Is the second number the largest? No");
        }

        if (number3 >= number1 && number3 >= number2) 
		{
            System.out.print("Is the third number the largest? Yes");
        } 
		else 
		{
            System.out.print("Is the third number the largest? No");
        }
		

        input.close();
    }
}
