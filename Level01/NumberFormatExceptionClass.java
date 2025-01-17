//importing scanner class from util package
import java.util.Scanner;
//create NumberFormatException class
public class NumberFormatExceptionClass
{
	public static void numberFormatException(String text)
	{
		int number= Integer.parseInt(text);
	}
	public static void handleException(String text)
	{
		try
		{
			int number= Integer.parseInt(text);
			System.out.print("Give parsed number: " +number);
		}
		catch(java.lang.NumberFormatException e)
		{
            System.out.println("Number Format Exception: Invalid input");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime Exception: " + e.getMessage());
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter string text: ");
		String text= sc.nextLine();
		//call the method
		System.out.println("Generating NumberFormatException...");
        numberFormatException(text);
		System.out.println("Generating Runtime Exception...");
        handleException(text);
		sc.close();
	}
}

		
		
		
		