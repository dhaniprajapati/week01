//importing scanner class from util package
import java.util.Scanner;

// create a ArmstrongNumberChecker class 
public class ArmstrongNumberChecker 
{
    public static void main(String[] agrs){
		
        //initializing Scanner object to take input
        Scanner input = new Scanner(System.in); 

         //taking user input 
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Create a variable to store the user input number
        int originalNumber = number;

        //Create a variable sum and assign value 0.
        int sum = 0;

        //using a while loop `to check the Armstrong number
        while(number != 0)
		{
            //create a variable that stores the remainder when we divide the number by 10.
            int remainder = number % 10;

            //find and add the sum to the cube of the remaindef
            sum = sum + (int)Math.pow(remainder,3);
            number = number / 10;
        }
        //check the value of the originalNumber variable and the sum varibale.
        if(originalNumber == sum)
		{
            System.out.println("The number "+originalNumber+" is an Armstrong number");
        }
		else
		{
            System.out.println("The number "+originalNumber+" is not an Armstrong number");
        }
		input.close();
    }
}


