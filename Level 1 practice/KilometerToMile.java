//import scanner class from util package
import java.util.Scanner;
//create KilometerToMile class 
public class KilometerToMile
{
    public static void main(String args[])
    {
	//initialize scanner class object	
    Scanner input= new Scanner(System.in);
	//to take the input from user
    System.out.print("Enter distance in Kilometers:");
	//create the variable km 
    double km= input.nextDouble();
	//create the variable km 
    double miles= km * 1.6;
	//print the output 
    System.out.print("The total miles is "+miles+ " mile for the given " +km+ "km");
	//closing scanner class object
    input.close();
    }
}