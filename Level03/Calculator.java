//importing scanner object from util package
import java.util.Scanner;

//create a Calculator
public class Calculator
{
    public static void main(String[] agrs)
	{
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in); 

         //Taking user input
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.print("Enter operator sign: ");
        String op = input.next();
        
        //Create the result variable and store the final result.
        double result;

        //create switch case for doing the operation of Addition, Subtraction, Multiplication and Division
        switch(op)
		{
            case "+":
                result = first + second;
                System.out.println("The addition of two number "+first+" and "+second+" is "+result);
                break; //break is important to get out from the switch if the case if executed

            case "-":
                result = first - second;
                System.out.println("The subtraction of two number "+first+" and "+second+" is "+result);
                break; 

            case "*":
                result = first * second;
                System.out.println("The multipication of two number "+first+" and "+second+" is "+result);
                break;

            case "/":
                result = first / second;
                System.out.println("The division of two number "+first+" and "+second+" is "+result);
                break;

            // if the output variable is other than the four signs then we print Invalid Operator
            default:
                System.out.println("Invalid Operator");
                break; 
        }
        input.close();
    }
}
