package Core_Java_Lab_Code_1;
import java.util.Arrays;

import Core_Java_Lab_Code_7.Exercise7;

public class Exercise3 {
	
	static int[] getSorted (int arr[])
	{
		int rev=0;
		int len=arr.length;
		int brr[]=new int[len];
		
		for(int i=0;i<arr.length;i++)
		{
			int x=arr[i];
			
		while(x!=0)
		{
			int y=x%10;
		        rev=rev*10+y;
			    x=x/10;
		}
	      brr[i]=rev;
		
		}
		
		Arrays.sort(brr);
		
		return brr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[]={133,100,34,98,67,8832};
		
		for(int x:Exercise3.getSorted(arr))
		   {
			   System.out.println(x+" ");
		   }		
	}
}
