import java.util.Scanner;
public class UnitConverterMethod 
{

    //initalize method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) 
	{
		double celsius = 0;
        return (fahrenheit - 32) * 5 / 9;
    }

    //initalize method  to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) 
	{
		double fahrenheit = 0;
        return (celsius * 9 / 5) + 32;
    }

    //initalize method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) 
	{
        double poundsToKilograms = 0.453592;
        return pounds * poundsToKilograms;
    }

    //initalize method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) 
	{
        double kilogramsToPounds = 2.20462; 
        return kilograms * kilogramsToPounds;
    }

    //initalize method  to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) 
	{
        double gallonsToLiters = 3.78541; 
        return gallons * gallonsToLiters; 
    }

    //initalize method  to convert liters to gallons
    public static double convertLitersToGallons(double liters) 
	{
        double litersToGallons = 0.264172; 
        return liters * litersToGallons;
    }
	public static void main(String[] args) 
	 {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a unit for conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        double result;

        if (choice == 1) 
		{
            result = convertFahrenheitToCelsius(value);
            System.out.println("Result: " + result + " °C");
        } 
		else if (choice == 2) 
		{
            result = convertCelsiusToFahrenheit(value);
            System.out.println("Result: " + result + " °F");
        } 
		else if (choice == 3) 
		{
            result = convertPoundsToKilograms(value);
            System.out.println("Result: " + result + " kg");
        } 
		else if (choice == 4) 
		{
            result = convertKilogramsToPounds(value);
            System.out.println("Result: " + result + " lbs");
        } 
		else if (choice == 5) 
		{
            result = convertGallonsToLiters(value);
            System.out.println("Result: " + result + " liters");
        } 
		else if (choice == 6) 
		{
            result = convertLitersToGallons(value);
            System.out.println("Result: " + result + " gallons");
        } 
		else 
		{
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}