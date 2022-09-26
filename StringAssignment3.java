package Array;

import java.util.Scanner;

public class StringAssignment3 {
	
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String inputstr=sc.nextLine();
		
		
		int i=0;
		int count=0;
		int flag=0;
		
		while(true)
		{
			try
			{
			char ch=inputstr.charAt(i);
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
		
		System.out.println(count);
		
		String outputstr="";
		
		
		for(int i1=0;i1<count;i1++)
		{
		char ch=inputstr.charAt(i1);
			if(ch<=90 && ch>=65)
			{
				char ch1=(char) (ch+32);
				outputstr+=ch1;
			}
			else if(ch>=97 && ch<=122) 
			{
				char ch1=(char) (ch-32);
				outputstr+=ch1;			
			}
			else
			{
				outputstr+=ch;
			}
		}
		
		System.out.println("Input String is ="+ inputstr);
		System.out.println("Output String is ="+outputstr);
		
		
	}

}
