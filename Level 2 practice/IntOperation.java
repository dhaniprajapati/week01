// Import the Scanner class from the util package
import java.util.Scanner;

// Class for performing integer operations
public class IntOperation {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for integer values
        System.out.print("Enter the value for a: ");
        int a = input.nextInt();
        System.out.print("Enter the value for b: ");
        int b = input.nextInt();
        System.out.print("Enter the value for c: ");
        int c = input.nextInt();

        // Perform integer operations considering operator precedence
        int result1 = a + b * c;   // Multiplication has higher precedence than addition
        int result2 = a * b + c;   // Multiplication is performed first, then addition
        int result3 = c + a / b;   // Division is performed first, then addition
        int result4 = a % b + c;   // Modulus has higher precedence than addition

        // Print the results with clear formatting
        System.out.println("\nThe results of integer operations are:");
        System.out.printf("a + b * c = %d\n", result1);
        System.out.printf("a * b + c = %d\n", result2);
        System.out.printf("c + a / b = %d\n", result3);
        System.out.printf("a %% b + c = %d\n", result4);  // Use %% for printing % sign

        // Close the Scanner object
        input.close();
    }
}
