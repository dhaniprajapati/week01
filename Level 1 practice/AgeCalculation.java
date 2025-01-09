//create AgeCalculation class to compute the current age of Harry
public class AgeCalculation
{
	public static void main(String[] args)
	{
		
		//create a variable birthYear and assign the value 2000
		int birthYear = 2000;
		//create a variable currentYear and assign the value 2024
		int currentYear = 2024;
		//to find the current age, subtract birthYear from currentYear
		int currentAge = currentYear - birthYear;
		System.out.print(" Harry's age in 2024 is " +currentAge);
	}
}