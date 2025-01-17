//importing scanner class from util package
import java.util.Scanner;
//create SubstringComparison class
public class SubstringComparison
{
	public static String userDefinedCharAt(String text, int indexFirst, int indexLast)
	{
		String subString= " ";
		for(int i=indexFirst; i< indexLast;i++)
		{
			subString+=text.charAt(i);
		}
		return subString;
	}
	public static String inBuiltSubstring(String text, int indexFirst, int indexLast)
	{
		String substr= text.substring(indexFirst,indexLast);
		return substr; 
	}
	public static boolean compareSubstrings(String substring, String substr)
	{
		return substring.equals(substr);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string text: ");
		String text= sc.nextLine();
		System.out.print("Enter first index: ");
		int indexFirst= sc.nextInt();
		System.out.print("Enter last index: ");
		int indexLast= sc.nextInt();
		
		String userDefinedCharAt= userDefinedCharAt(text,indexFirst,indexLast);
		String inBuiltSubstring= inBuiltSubstring(text,indexFirst,indexLast);
		boolean areEqual= compareSubstrings(userDefinedCharAt,inBuiltSubstring);
		if(areEqual)
		{
			System.out.print("Both the substrings are equal");
		}
		else
		{
			System.out.print("Both the substrings are unequal");
		}
		sc.close();
	}
}
			
		