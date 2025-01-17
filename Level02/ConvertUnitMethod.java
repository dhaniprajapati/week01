public class ConvertUnitMethod 
{

    //initalize method to convert kilometers to miles
    public static double convertKmToMiles(double km) 
	{
        double kmToMiles = 0.621371; 
        return km * kmToMiles; 
    }

    //initalize method to convert miles to kilometers
    public static double convertMilesToKm(double miles) 
	{
        double milesToKm = 1.60934; 
        return miles * milesToKm;
    }

    //initalize method to convert meters to feet
    public static double convertMetersToFeet(double meters) 
	{
        double metersToFeet = 3.28084; 
        return meters * metersToFeet; 
    }

    //initalize method to convert feet to meters
    public static double convertFeetToMeters(double feet) 
	{
        double feetToMeters = 0.3048; 
        return feet * feetToMeters;
    }
	public static void main(String[] args) 
	{
        //print result
        System.out.println("10 km to miles: " + convertKmToMiles(10));
        System.out.println("10 miles to km: " + convertMilesToKm(10));
        System.out.println("5 meters to feet: " + convertMetersToFeet(5));
        System.out.println("5 feet to meters: " + convertFeetToMeters(5));
    }
}