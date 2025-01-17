import java.util.*;
public class ReverseWords
{
	//method to split string
	public static String [] reverseWords(String str)
	{
		int length= str.lenght();
		String temp=new String[lenght];//temporary array to store words
		String word= "";
		String reverse="";
		for(int i=0;i<length;i++);
		{
			if(str.charAt(i)!="");
			{
				if(word()>0)
				{
					reverse+=word="";
				word+=str.charAt(i);
				}
			}
			else
			{
				word= str+word;
			}
		}
		return reverse.trim();
	}
	public static void main(String[] args)
	{
		String input= "Indian Institute Of Management";
		System.out.print= ("Entered text: "+input);
		System.out.print= ("Reversed: ")+reverseWords(input);
	}
}
		
		
		
	