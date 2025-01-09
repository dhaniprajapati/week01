//import scanner class from util package
import java.util.Scanner;
//create AreaOfTriangle class
public class AreaOfTriangle 
{
    public static void main(String[] args)
	{
       
        //initialize scanner class object	
		Scanner input= new Scanner(System.in);
		//taking input from user
		System.out.print("Height: ");
		double height = input.nextDouble();
		//taking input from user
		System.out.print("Base: ");
		double base = input.nextDouble();
		//create variable 
		//calculate the Area of triangle
	double area = 0.5 * base* height;
		System.out.print("Area of the triangle: " +area);
		input.close();
	}
}
		