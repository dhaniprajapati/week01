// Import the Scanner class from the util package
import java.util.Scanner;

// Class to perform double operations
public class DoubleOpt {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input value from the user
        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();

        // Perform double operations considering operator precedence
        double result1 = a + b * c;    // Multiplication has higher precedence than addition
        double result2 = a * b + c;    // Multiplication is performed first, then addition
        double result3 = c + a / b;    // Division is performed first, then addition
        double result4 = a % b + c;    // Modulus works with floating-point numbers

        // Print the results with formatted output
        System.out.println("\nThe results of Double Operations are:");
        System.out.printf("a + b * c = %.2f\n", result1);
        System.out.printf("a * b + c = %.2f\n", result2);
        System.out.printf("c + a / b = %.2f\n", result3);
        System.out.printf("a %% b + c = %.2f\n", result4);  // Use %% for printing the % symbol

        // Close the Scanner object
        input.close();
    }
}
