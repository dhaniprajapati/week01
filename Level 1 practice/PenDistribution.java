//create PenDistribution class 
public class PenDistribution
{
	public static void main(String[] args)
	{
		//create a variable numberOfPens and assign the value '14'
		int numberOfPens = 14;
		//create a variable numberOfstudents and assign the value '14'
		int numberOfstudents= 3;
		//create a variable penToEachStudent
		//
		int penToEachStudent= numberOfPens/numberOfstudents;
		//create a variable remainingPens
		//
		int remainingPens= numberOfPens%numberOfstudents;
		//print result 
		System.out.print("The Pen Per Student is " +penToEachStudent+ " and the remaining pen not distributed is " +remainingPens);
	}
}