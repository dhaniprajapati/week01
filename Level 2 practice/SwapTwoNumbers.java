//import scanner class from util package
import java.util.Scanner;
//create SwapTwoNumbers class
public class SwapTwoNumbers 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input 
        System.out.print("Enter the first number (number1): ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number (number2): ");
        int number2 = input.nextInt();

        // Print numbers before swapping
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers with each other
        int value = number1;
        number1 = number2;
        number2 = value;

        // Print the result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner
        input.close();
    }
}
