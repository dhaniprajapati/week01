import java.util.Scanner;
//create class LargestNumber
public class LargestNumber
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);     
        //taking user input
        System.out.println("Enter a number: ");
		//long for larger numbers
        long number = scanner.nextLong(); 
        //create an array to store the digits
        int maxDigits = 10;
        long[] digits = new long[maxDigits];
		//create variable to store index value and assign the value to 0
        int index = 0;
        //while loop to extract digits and store them in the array
        while (number != 0) 
		{
			//
            if (index < maxDigits) 
			{
                digits[index] = number % 10; 
                //calculate the last digit
                number /= 10; 
                index++;
            } 
			else 
			{
                //Increase the size of the array if maxDigits is reached
                //Increase maxDigits by 10
                maxDigits += 10; 
                //create a new array with the new size
                long[] temp = new long[maxDigits];                 
                //copy the existing digits to the new array
                for (int i = 0; i < digits.length; i++) 
				{ 
                    temp[i] = digits[i];
                }              
                digits = temp; 
            }
        }

        //variables to store the largest and second largest digits
        long largest = -1;
        long secondLargest = -1;

        //run for loop in the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) 
		{
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) 
			{
                secondLargest = digits[i]; 
            }
        }
        //print result 
        if (largest != -1) 
		{
            System.out.println("Largest digit: " + largest);
        } 
		else 
		{
            System.out.println("No digits found.");
        }
        if (secondLargest != -1) 
		{
            System.out.println("Second largest digit: " + secondLargest);
        } 
		else 
		{
            System.out.println("No second largest digit found.");
        }
        scanner.close();
    }
}