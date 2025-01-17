//import scanner class from util package
import java.util.Scanner;
//Create SimpleInterest class
public class SimpleInterestMethod
{
	//initialize method to calculate simple interest
	public static double calculateSimpleInterest(double principal, double rate, double time) 
	{
        //calculate simple interest and return the result 
        return (principal * rate * time) / 100;
	}
    public static void main(String[] args) 
	{
        
        Scanner input = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();


        System.out.print("Enter the Time in years: ");
        double time = input.nextDouble();
	
        //call the method to calculate the Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        //print the output
        System.out.println("The Simple Interest is " + simpleInterest + 
            " for Principal " + principal + 
            ", Rate of Interest " + rate + "%, and Time " + time + " years.");

        //close the scanner
        input.close();
    }
}
