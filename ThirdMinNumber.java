package Array;

public class ThirdMinNumber {
	
	public static int getThirdMinNo(int[] a) {
	      int temp;
	      
	      for (int i = 0; i < a.length; i++) {
	         for (int j = i + 1; j < a.length; j++) {
	            if (a[i] > a[j]) {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	     
	      return a[2];
	   }
	   public static void main(String args[]) {
	      int a[] = { 11,10,4, 15, 16, 13, 2 };
	      System.out.println("Third Smallest: " +getThirdMinNo(a));
	   }

}
