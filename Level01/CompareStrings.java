//importing Scanner class from util package
import java.util.Scanner;
//Create CompareStrings class
public class CompareStrings
{
	//initialize method to compare two strings
	public static boolean compareTwoStringUser(String one, String two)
	{
		//
		if(one.length() != two.length())
		return false;
		for(int i=0;i< one.length();i++)
		{
			if(one.charAt(i) != two.charAt(i))
			{
				return false;
			}
		}
		return true;

	}
	public static boolean compareTwoStringInbuilt(String one, String two)
	{
	return one.equals(two);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first string: ");
		String one = sc.nextLine();
		System.out.print("Enter second string: ");
		String two = sc.nextLine();
		
		boolean CompareTwoStringUser = compareTwoStringUser(one,two);
		boolean CompareTwoStringInbuilt = compareTwoStringInbuilt(one,two);
		
		if(CompareTwoStringUser&&CompareTwoStringInbuilt)
		{
			System.out.print("Both the strings are equal");
		}
		else
		{
			System.out.print("Both the strings are not equal");
		}
		
	}
}
		