package Array;

import java.util.Scanner;

public class StringAssignment1 {
	
	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the inputstring1");
			String str1=sc.nextLine();
			
			System.out.println("enter the inputstring2");
			String str2=sc.nextLine();
			
			
			char input1[]=str1.toCharArray();
			int ind=0;
			
			for(int i=0;i<str1.length();i++)
			{
				char c=str1.charAt(i);
				if(c=='a' || c=='A'|| c=='E'|| c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
				{
					try
					{
				input1[i]=str2.charAt(ind);
				     ind++;
					}
					catch (StringIndexOutOfBoundsException e)
					{
						input1[i]='_';	
					}
				}

			}
			String s=new String(input1);
			System.out.println("Result String ="+s);
	}
	}

