//create AverageMarkOfSam class to compute average marks of sam in PCM
public class AverageMarkOfSam
{
	public static void main(String[] args)
	{
		//create a variable maths and assign the value '94'
		int maths= 94;
		//create a variable physics and assign the value '95'
		int physics= 95;
		//create a variable chemistry and assign the value '96'
		int chemistry= 96;
		//calculate the average mark by adding marks of maths, physics and chemistry and divide it by 3
		int averageMark= (maths+physics+chemistry)/3;
		//print the result
		System.out.print("Sam,s average mark in PCM is "  +averageMark);
	}
}