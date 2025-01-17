//importing scanner class from util package
import java.util.Scanner;
//create FactorsOfNumber class
public class FactorsOfNumber
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
		//taking user input
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
		//create variable and assign value 10
        int maxFactors = 10;
		//create factors array of size maxFactor
        int[] factors = new int[maxFactors];
		//create index variable to show the index of the array and initialize it to 0
        int index = 0;

        //for loop to find the factors of the number
        for (int i = 1; i <= number; i++) 
		{
			//check if the number is even or odd
            if (number % i == 0) 
			{
                //Check if we need to expand the factors array
                if (index == maxFactors) 
				{
					//double the size if needed
                    maxFactors *= 2;
					//using the temp array to store the elements from the factors array
                    int[] temp = new int[maxFactors];
					//to copy the factor array to the temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
				//save the factor
                factors[index++] = i;
            }
        }

        //print the factors
        System.out.print("Factors of " + number + ": ");
		//for loop to display the factors of the numbers
        for (int i = 0; i < index; i++) 
		{
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}