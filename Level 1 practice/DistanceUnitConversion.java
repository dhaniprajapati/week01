//import scanner class from util package
import java.util.Scanner;
//create DistanceUnitConversion class
public class DistanceUnitConversion
{
    public static void main(String[] args)
	{
       
        //initialize scanner class object	
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the distance in feet: ");
		//create variable
		double distanceInFoot = input.nextDouble();
		//create variable
		//change the distance in feet to distance in yards
		//1feet=1/3 yards
		double distanceInYards = distanceInFoot/3;
		//create variable
		//change the distance in feet to distance in miles
		//1mile= 1760 yards
		double distanceInMiles = distanceInFoot/1760;
		System.out.print("Distance in feet is "+distanceInFoot+ " whose value in yards is " +distanceInYards+ " and value in miles is " +distanceInMiles );
		input.close();
	}
}
