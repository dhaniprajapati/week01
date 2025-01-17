//importing scanner class from util package
import java.util.Scanner;
//Create ReturnCharacters class
public class ReturnCharacters
{
    //initialize method to return characters in a string without using toCharArray()
    public static char[] returnCharactersFromString(String str) 
	{
		 //create a char array of the same length as the string
        char[] characters = new char[str.length()];
        //run for loop to store the characters of the string in the array
        for (int i = 0;i < str.length();i++) 
		{
            characters[i] = str.charAt(i);
        }
        return characters;
    }
    //initialize method to compare two char arrays and return a boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) 
	{
        //check if lengths are same or different
        if (arr1.length != arr2.length) 
		{
            return false;
        }
        //compare each characters stored in the arrays
        for (int i = 0; i < arr1.length; i++) 
		{
            if (arr1[i] != arr2[i]) 
			{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a string: ");
        String input= scanner.nextLine();

        //get  characters from string using the user-defined method
        char[] userDefinedArray = returnCharactersFromString(input);
        //get characters from string using the toCharArray() method
        char[] builtInArray = input.toCharArray();

        //compare the two char arrays 
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

        //print result 
        System.out.println("Characters from user-defined method: ");
        for (char chr : userDefinedArray) 
		{
            System.out.print(chr + " "); 
        }
        System.out.println();

        System.out.println("Characters from toCharArray() method: ");
        for (char chr : builtInArray) 
		{
            System.out.print(chr + " ");
        }
        System.out.println();

        System.out.println("Are the two character arrays from string equal? " + areEqual);

        scanner.close();
    }
}