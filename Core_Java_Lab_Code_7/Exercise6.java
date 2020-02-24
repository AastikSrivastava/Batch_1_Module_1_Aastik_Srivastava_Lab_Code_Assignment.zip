package Core_Java_Lab_Code_7;

import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Exercise6 {
	
	static List<Integer> voterList(HashMap< Integer ,LocalDate>  hs )
	{
		List<Integer> list = new ArrayList<>();
		Set<Integer> id = hs.keySet();
		
		LocalDate ld = null;
		
		LocalDate ld1 = ld.now();
		
		
		for(Integer integer : id) 
		{
			ld=hs.get(integer);
		
			Period pd = Period.between(ld,ld1);
			
			if(pd.getYears()>=18) {
				list.add(integer);
			}
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer , LocalDate > hs = new HashMap<>();
		
		hs.put(10001,LocalDate.of(2040,3,12));
		hs.put(10002,LocalDate.of(1993,07,23));
		hs.put(10003,LocalDate.of(1998,12,06));
		hs.put(10004,LocalDate.of(2014,9,06));
		hs.put(10005,LocalDate.of(1997,12,20));
		
		System.out.println(Exercise6.voterList(hs));
		
	}

}
