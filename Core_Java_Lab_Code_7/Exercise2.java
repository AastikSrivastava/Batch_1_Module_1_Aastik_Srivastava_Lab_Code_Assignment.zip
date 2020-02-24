package Core_Java_Lab_Code_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise2 {

	static HashMap<Character , Integer> countCharacter(Character arr[])
	{
		HashMap<Character , Integer> hashmap = new HashMap<>();
		
		List<Character> list = Arrays.asList(arr);
		
		for(Character c : list)
		{
			hashmap.put(c,Collections.frequency(list,c));
		}
		
		return hashmap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character arr[] = {'A','A','P','L','E','E'};
		
		System.out.println(Exercise2.countCharacter(arr));
		
		
	}

}
