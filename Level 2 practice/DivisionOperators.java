// Import the Scanner class from the util package
import java.util.Scanner;

// Class to perform division and modulus operations
public class DivisionOperators {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Check for division by zero
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Calculate the quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Print the result
            System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder + 
                               " when dividing " + number1 + " by " + number2);
        }

        // Close the Scanner object
        input.close();
    }
}
