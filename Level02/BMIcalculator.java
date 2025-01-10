//importing scanner class from util package
import java.util.Scanner;
//create a class BMIcalculator
public class BMIcalculator
{
    public static void main(String[] args) 
	{
		//initializing scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input 
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightInCm = input.nextDouble();

        //convert the height from cm to meters
        double heightInMeters = heightInCm / 100;

        //calculate the BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);

        //Determine weight status based on BMI using the if else statement
        String status;
        if (bmi <= 18.4) 
		{
            status = "Underweight";
        } 
		else if (bmi <= 24.9) 
		{
            status = "Normal";
        } 
		else if (bmi <= 39.9) 
		{
            status = "Overweight";
        } 
		else 
		{
            status = "Obese";
        }

        // print the BMI and weight status
        System.out.println("\n--- Results ---");
        System.out.printf("Your BMI: "+ bmi);
        System.out.println("Weight Status: " + status);

        input.close();
    }
}