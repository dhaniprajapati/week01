//importing scanner class from util package
import java.util.Scanner;
//create CheckNumbers class
public class CheckNumbers
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        //using for loop and taking user input for each array index
        for (int i = 0; i < numbers.length; i++) 
		{
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        //using for loop for checking each numbers
        for (int number : numbers) 
		{
			//checking if the number is positive or not
            if (number > 0) 
			{
				//checking if the number is even or odd
				if(number%2==0)
				{
					//print result if the number is even
					System.out.println(number + " is positive and even");
				}
				else
				{
					//print result if the number is odd
					System.out.println(number + " is positive and odd");
				}
			}
			else if(number < 0)
			{
				System.out.println(number + " is negetive");
			}
            else 
			{
                System.out.println("The number is zero.");
            }
        }

        //Compare first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) 
		{
			//print result if both the elements are equal
            System.out.println("First and last elements are equal.");
        } 
		else if (numbers[0] > numbers[numbers.length - 1]) 
		{
			//print result if the first element is greater
            System.out.println("First element is greater than last element.");
        } 
		else 
		{
			//print result if the first element is less
            System.out.println("First element is less than last element.");
        }
		scanner.close();
    }
}