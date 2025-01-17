import java.util.Scanner;
//create class DigitFrequency
public class DigitFrequency 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        //taking user input
        System.out.println("Enter a number: ");
		//use long for large numbers
        long number = scanner.nextLong(); 
        //convert the number to a string to easily access each digit
        String numberStr = Long.toString(number);
        int length = numberStr.length();
        //create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
        //run for loop to find the frequency of each digit
        for (int i = 0; i < length; i++) 
		{
            char digitChar = numberStr.charAt(i);
			//converting char into int
            int digit = Character.getNumericValue(digitChar);
			//increment in the frequency of the digit
            frequency[digit]++; 
        }
        //run for loop and print result
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) 
		{
            if (frequency[i] > 0) 
			{ 
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        // Close the scanner
        scanner.close();
    }
}