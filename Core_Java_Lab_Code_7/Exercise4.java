package Core_Java_Lab_Code_7;

import java.util.HashMap;
import java.util.Set;

public class Exercise4 {

	static HashMap<Integer , String > getStudent (HashMap<Integer, Integer> hs )
	{
		HashMap<Integer , String> hashmap1 = new HashMap<>();
		
		Set<Integer> reg_set = hs.keySet();
		
		String medal = null;
		
		Integer marks;
		
		for(Integer key : reg_set)
		{
			marks= hs.get(key);
			
			if(marks>=90)
			{
				medal="Gold";
			}
			else if(marks>=80 && marks<90)
			{
				medal="Silver";
			}
			else if (marks >=70 && marks<80)
			{
				medal="Bronze";
			}
			hashmap1.put(key,medal);
			
			
		}
		return hashmap1;
		
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer , Integer> hs = new HashMap<>();
		
		
		hs.put(101,70);
		hs.put(102,96);
		hs.put(103,82);
		hs.put(104,75);
		
		System.out.println(Exercise4.getStudent(hs));
		
	}
	
}
