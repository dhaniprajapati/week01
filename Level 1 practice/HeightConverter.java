//import scanner class from util package
import java.util.Scanner;
//create HeightConverter class
public class HeightConverter 
{
    public static void main(String[] args)
	{
       
        //initialize scanner class object	
		Scanner input= new Scanner(System.in);
		//create a variable heightInCm
		System.out.printf("Enter height:");
        double heightInCm = input.nextDouble();

        // Conversion of height in Cm to inches
		//1cm= 2.54inches
        double inches = heightInCm/ 2.54;

        // Conversion to height in feet to inches
		//1foot= 12iches
        double feet = inches/12.0;
        
        // print the Output
        System.out.printf("Your height in cm is "+heightInCm+ " while in feet is" +feet+ " and in inches is " +inches);
		input.close();
    }
}
