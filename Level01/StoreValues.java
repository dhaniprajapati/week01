//importing scanner class from util package
import java.util.Scanner;
//create StoreValues class
public class StoreValues 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		//create double to store array of 10 elements
        double[] numbers = new double[10];
		//create a variable to store the total and initialize it to 0.0.
        double total = 0.0;
		//create index variable and initialize it to 0 for the array
        int index = 0;
		//using infinite while loop
        while (true) 
		{
			//using user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
			//using if else to determine if the input is smaller than equal to 0 or index is greater than equal to 10
            if (input <= 0 || index >= 10) 
			{
				//exit loop for the if condition
                break;
            }
			//to assign the number to the array element and increment the index value 
			//if the user entered a number other than 0 or a negative number inside the while loop
            numbers[index++] = input;
        }
        //using for loop to get the values of each element and add it to the total
        for (int i = 0; i < index; i++) 
		{
            total += numbers[i];
        }

        System.out.println("Total: " + total);
    }
}