 //import the Scanner class from util package
import java.util.Scanner;

public class SmallestAndLargestNumMethod
{

    //initialize method to find the smallest and largest of three numbers enterred by user
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) 
	{
		//create variables to store the smallest and largest number
        int smallest;
        int largest;

        //using if else ststement to find the smallest number
        if (number1 <= number2 && number1 <= number3) 
		{
            smallest = number1;
        } 
		else if (number2 <= number1 && number2 <= number3) 
		{
            smallest = number2;
        } 
		else 
		{
            smallest = number3;
        }

        //using if else ststement to find the largest number
        if (number1 >= number2 && number1 >= number3) 
		{
            largest = number1; 
        } 
		else if (number2 >= number1 && number2 >= number3) 
		{
            largest = number2;
        } 
		else 
		{
            largest = number3;
        }

        //return the smallest and largest numbers using an array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        //call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // print the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        //close the scanner class
        scanner.close();
    }
}