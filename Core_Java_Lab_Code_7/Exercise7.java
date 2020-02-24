package Core_Java_Lab_Code_7;

import java.util.Arrays;

public class Exercise7 {

     static int[] getSorted(int arr[])
     {
    	 int l=arr.length;
    	 int j=0;
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 int x=arr[i];
    		 int rev=0,y;
    		 while(x!=0)
    		 {
    			 y=x%10;
    			 rev=rev*10+y;
    			 x=x/10;
    		 }
    		 
    		 arr[i]=rev; 
    	 }
    	 
    	 Arrays.sort(arr);

		return arr;
    	 
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {152,897,45,347,111,500};
		
		
   for(int x:Exercise7.getSorted(arr))
   {
	   System.out.println(x+" ");
   }
		
		
	}

}
