import java.util.Scanner;
//create BMICalculator2D class
public class BMICalculator2D 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        //taking user input 
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        //create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        //using for loop to take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) 
		{
            //input weight
            double weight;
			//do while loop to take the weight
            do 
			{
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
				//check if the number is positive or not
                if (weight < 0) 
				{
                    System.out.println("Please enter a positive value for weight.");
                }
            } 
			while (weight < 0);
            personData[i][0] = weight; // Store weight
            //input height
            double height;
			//do while loop to take the height
            do 
			{
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
				//check if the number is positive or not
                if (height < 0) 
				{
                    System.out.println("Please enter a positive value for height.");
                }
            } 
			while (height < 0);
            personData[i][1] = height; //to store height
            //calculate BMI
            personData[i][2] = weight / (height * height); // BMI = weight / (height^2)
            //create if else ststement to determine weight status based on BMI
            if (personData[i][2] <= 18.4) 
			{
                weightStatus[i] = "Underweight";
            } 
			else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) 
			{
                weightStatus[i] = "Normal";
            } 
			else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) 
			{
                weightStatus[i] = "Overweight";
            } 
			else 
			{
                weightStatus[i] = "Obese";
            }
        }
		//create for loop to print the result
        for (int i = 0; i < numberOfPersons; i++) 
		{
            System.out.println(personData[i][1]+", "+ personData[i][0]+", "+ personData[i][2]+", "+weightStatus[i]);
        }
        // Close the scanner
        scanner.close();
    }
}