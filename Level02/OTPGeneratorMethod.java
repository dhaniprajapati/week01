public class OTPGeneratorMethod 
{

    //initialize method to generate a 6-digit OTP number
    public static int generateOTP() 
	{
		 //generate a random 6-digit number and return the result
        return (int) (Math.random() * 900000) + 100000;
    }

    //method to ensure all OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otpArray) 
	{
		//run loop to check if there's a duplicate OTP
        for (int i = 0; i < otpArray.length; i++) 
		{
			//run loop to compare the current OTP with the others
            for (int j = i + 1; j < otpArray.length; j++) 
			{
                if (otpArray[i] == otpArray[j]) 
				{
                    return false;
                }
            }
        }
		//if all OTPs are unique
        return true;
    }
   public static void main(String[] args) 
   {
        int numberOfOTPs = 10;

        //create array to store the generated OTPs
        int[] otpArray = new int[numberOfOTPs];

        //generate OTPs and store them in the array
        System.out.println("Generating OTPs...");
        for (int i = 0; i < numberOfOTPs; i++) 
		{
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        //check if all OTPs are unique or not
        if (areOTPsUnique(otpArray)) 
		{
            System.out.println("All OTPs are unique.");
        } 
		else 
		{
            System.out.println("Some OTPs are duplicate. OTPs are not unique.");
        }
    }
}