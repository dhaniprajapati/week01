//create VolumeOfEarth class 
public class VolumeOfEarth
{
	public static void main(String[] args)
	{
		//create a variable radiusOfEarth and assign the value
		double radiusOfEarth= 6378;
		//create a variable volumeInKm and calculate it
		//volume of sphere= (4/3) * pi * radius^3
		double volumeInKm= (4/3)* Math.PI * Math.pow(6378,3);
		//create a variable kmInMiles and calculate it
		double kmInMiles= radiusOfEarth*1.6;
		//create a variable volumeInMiles and calculate it
		double volumeInMiles= (4/3)* Math.PI * Math.pow(kmInMiles,3);
		//print the result
		System.out.print(" The volume of earth in cubic kilometers is " +volumeInKm+ " and cubic miles is " +volumeInMiles);
	}
}