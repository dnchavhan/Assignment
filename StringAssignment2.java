package Array;

import java.util.Scanner;

public class StringAssignment2 {
	
	public static int myStringLength(String inputstring)
	{

		int i=0;
		int count=0;
		int flag=0;
		while(true)
		{
			try
			{
		
			char ch=inputstring.charAt(i);
			count++;
			}
			catch (StringIndexOutOfBoundsException e) 
			{
				flag=1;
			}
			if(flag==1)
			{
			break;	
			}
			i++;
				
		}
				return count;
	}
	
	public static void main(String[] args) 
	{
	
				Scanner sc= new Scanner(System.in);
				System.out.println("enter the inputstring1");
				String inputstring1=sc.nextLine();
				
				System.out.println("enter the inputstring2");
				String inputstring2=sc.nextLine();
			
			int len1=myStringLength(inputstring1);
			int len2=myStringLength(inputstring2);
			
			int count=0;
			if(len1<len2)
			{
				System.out.println("NOT Substring");
			}
			else 
			{
			int k=0;
			for(int i=0;i<len2;i++)
			{
		         
				for(int j=k;j<len1;j++)
				{
			  
					if(CustomCharAtmethod.myCharAt(i, inputstring2)==CustomCharAtmethod.myCharAt(j, inputstring1))
					{
						k=j;
						count++;
						break;
					}
				}
			}
			
			if(len2==count)
			{
				System.out.println("SubString is Present");
			}
			else
			{
				System.out.println("SubString is not Present");
			}
			}
			
			
			}

}
