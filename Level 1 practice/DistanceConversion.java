//create DistanceConversion class 
public class DistanceConversion
{
	public static void main(String[] args)
	{
		//create a variable distanceInKilometers and assign the value '10.8'
		double distanceInKilometers = 10.8;
		//1km= 1.6miles
		//create a variable convertKilometersToMiles
		double convertKilometersToMiles= distanceInKilometers* 1.6;
		//print result 
		System.out.print("The distance " +distanceInKilometers +"km in miles is " +convertKilometersToMiles);
	}
}
		