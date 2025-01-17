public class NullPointerException
{

    //initialize method to generate NullPointerException
    public static void getnullPointerException() 
	{
		//take string variable and initialize it to null
        String value= null; 
		try 
		{
            System.out.println(value.length());
        } 
		catch (NullPointerException e)
		{
            //it will throw NullPointerException whn we try to call the value
            System.out.println("Caught a NullPointerException: string cannot be null" );
        }
    }
    //method to show the handling of NullPointerException
    public static void handleNullPointerException() 
	{
        String value = null;
		try 
		{
            System.out.println(value.length());
        } 
		catch (Exception e)
		{
            //it will throw NullPointerException whn we try to call the value
            System.out.println("Handling the NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) 
	{
        //call the method to generate the null pointer exception
        System.out.println("generating NullPointerException:");
		try
		{
		//This will cause the program to crash
        getnullPointerException();
		}
		catch(Exception e)
		{
			System.out.print("Caught the Exception : " + e.getMessage());
		}
        //to handle the exception
        System.out.println("\nHandling NullPointerException:");
		//This will catch the exception and handle it
        handleNullPointerException();
    }
}