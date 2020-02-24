package Core_Java_Lab_Code_1;

import java.util.Arrays;

public class Exercise1 {

	 static int getSecondSmallest(int arr[])
	{
	     Arrays.sort(arr);	 
		 
		return arr[1];
	  	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={23,445,78,6,2,-32,0,10,100,93,77,1};
		
		System.out.println(getSecondSmallest(arr));
			
	}
}
