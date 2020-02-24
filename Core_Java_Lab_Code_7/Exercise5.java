package Core_Java_Lab_Code_7;

import java.util.Arrays;

public class Exercise5 {

	static int getSecondSmallest (int arr[])
	{
		//ArrayList<Integer> ar = new ArrayList<>();
		
	   Arrays.sort(arr);
		
	   int l = arr.length;
	   
	   int x = arr[1];
	   
		return x;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {56,23,7898,120,345,4,8,36};
		
		System.out.println(Exercise5.getSecondSmallest(arr));
		
	}

}
