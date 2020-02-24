package Core_Java_Lab_Code_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise3 {

	
	static HashMap<Integer , Integer> getSquares(Integer arr[])
	{
		HashMap<Integer , Integer> hashmap = new HashMap<>();
		
       List<Integer> list = Arrays.asList(arr);
		
		for(Integer c : list)
		{
		     hashmap.put(c, c*c);
		}
		return hashmap;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Integer arr[]={1,23,4,12,7,19};
		
		System.out.println(Exercise3.getSquares(arr));
		
	}

}
