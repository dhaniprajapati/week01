//importing scanner class from util package
import java.util.Scanner;

public class QuadraticMethod 
{

    //initialize method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) 
	{
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) 
		{
            // distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};7
        } 
		else if (delta == 0) 
		{
            // One real root
            double root = -b / (2 * a);
            return new double[]{root}; // Return the single root
        } 
		else 
		{
            // No real roots
            return new double[]{}; // Return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        }

        scanner.close(); // Close the scanner
    }
}