//create CalculateProfit class 
public class CalculateProfit
{
	public static void main(String[] args)
	{
		//create a variable costPrice and assign the value '129'
		int costPrice = 129;
		
		//create a variable sellingPrice and assign the value '191'
		int sellingPrice = 191;
		
		//calculate the profit by subtracting costPrice from sellingPrice
		int profit= sellingPrice-costPrice;
		
		//create a variable profitPercent and calculate the profit percent
		double profitPercent= (profit / (double) costPrice) * 100;
		
		//print the cost price and selling price
		//print the profit and profitPercents
		System.out.print("The Cost Price is INR" +costPrice+ "and Selling Price is INR " +sellingPrice+ "The Profit is INR " +profit+ "\n and the Profit Percentage is " +profitPercent);
		
	}
}
		