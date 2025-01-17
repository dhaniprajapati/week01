import java.util.Scanner;

public class TrigonometryCalculatorMethod
{

    //create method 
    public static double[] calculateTrigonometricFunctions(double angle) 
	{
        //create variable to convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        //create variables to calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        //return the results using array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        //taking user input 
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        //call method to calculate the trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        //print the result
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
        scanner.close();
    }
}