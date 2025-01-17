import java.util.Scanner;
//create a class ReverseNumber
public class ReverseNumber 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        //taking user input 
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        //create temp variable to Count the number of digits
        int temp = number;
        int count = 0;
        while (temp != 0) 
		{
		//remove the last digit by dividing it by 10
            temp /= 10; 
		//increment the digit count
            count++; 
        }
        //create an array to store the digits
        int[] digits = new int[count];
        temp = number; 
        //create for loop to extract digits and store them in the array
        for (int i = 0; i < count; i++) {
			//get the last digit using module
            digits[i] = temp % 10; 
			//remove the last digit
            temp /= 10; 
        }
        //Create an array to store the reversed digits
        int[] reversedDigits = new int[count];
        //using foor loop reverse the digits
        for (int i = 0; i < count; i++) 
		{
			//to store in reverse order
            reversedDigits[i] = digits[count - 1 - i]; 
        }
        //print the reversed digits
        System.out.println("Reversed number: ");
        for (int i = 0; i < count; i++) 
		{
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
        // Close the scanner
        scanner.close();
    }
}