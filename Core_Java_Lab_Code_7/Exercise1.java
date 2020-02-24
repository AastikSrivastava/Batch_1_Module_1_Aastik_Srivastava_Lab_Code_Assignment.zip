package Core_Java_Lab_Code_7;

import java.util.*;

public class Exercise1 {
	static List<String> getValues(HashMap<Integer, String> hashMap) {
		
		Collection<String> list1 = hashMap.values();
		
		List<String> list2 = new ArrayList<String>();
		
		for (String string : list1) {
			
			list2.add(string);
		}
		return list2;
	}

	public static void main(String[] args) {
		String ar[] = { "Delhi", "Chennai", "Jaipur","Kolkata","Noida","Ghaziabad","Bulandshahar" };
		HashMap<Integer, String> hashMap1 = new HashMap<>();
		Random random = new Random();
		for (int i = 0; i < ar.length; i++) 
			hashMap1.put(random.nextInt(), ar[i]);
		List<String> myList = getValues(hashMap1);
		System.out.println(myList);	
		System.out.println("\n\n"+hashMap1.values());
	}

}
