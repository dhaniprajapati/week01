//import scanner class from util package
import java.util.Scanner;
//create SideOfSquare class
public class SideOfSquare
{
    public static void main(String[] args)
	{
       
        //initialize scanner class object	
		Scanner input= new Scanner(System.in);
		//taking input from user
		System.out.print("Enter perimeter:");
		//create variable
		double perimeter = input.nextDouble();
		//create variable 
		//calculate the side of square
		double sideOfSquare = perimeter/4;
		System.out.print("The length of the side is "+sideOfSquare+ " whose perimeter is " +perimeter);
		input.close();
	}
}