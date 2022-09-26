package Array;

import java.util.Scanner;

public class StringAssignment5 {
	
		 public static void main(String[] args)
		    {
		        Scanner sc=new Scanner(System.in);
		        String[] arr=new String[4];
		        
		        System.out.println("Enter "+arr.length+" string values");
		        for(int i=0; i<arr.length; i++)
		            arr[i]=sc.next();
		        
		        
		        int n = arr.length;
		         
		        sort(arr,n);
		        printArraystring(arr, n);
		    }
		        static void sort(String []s, int n)
		        {
		            for (int i=1 ;i<n; i++)
		            {
		                String temp = s[i];
		         
		                  int j = i - 1;
		                while (j >= 0 && temp.length() < s[j].length())
		                {
		                    s[j+1] = s[j];
		                    j--;
		                }
		                s[j+1] = temp;
		            }
		        }
		         
		        static void printArraystring(String str[], int n)
		        {
		            for (int i=0; i<n; i++)
		                System.out.print(str[i]+" ");    
		        }
		        }
