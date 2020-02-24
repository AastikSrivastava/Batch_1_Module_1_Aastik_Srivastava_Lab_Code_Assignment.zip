package Core_Java_Lab_Code_1;

import java.util.Arrays;

public class Exercise2 {

	static char[] getArray(String s)
	{
		char tempArray[] = s.toCharArray(); 

        int len = s.length();
        char temp[]=s.toCharArray();
        Arrays.sort(tempArray);
        
        if(len%2==0)
        {
		for(int i=0;i<len;i++)
		{  
			if(i<len/2)
			{
		temp[i]=	Character.toUpperCase(tempArray[i]);
			}
			else if(i>=len/2)
			{
				temp[i]=		Character.toLowerCase(tempArray[i]);
			}
			
			
		}
        }
        else if(len%2!=0)
        {
		for(int i=0;i<len;i++)
		{  
			if(i<=len/2)
			{
				temp[i]=Character.toUpperCase(tempArray[i]);
			}
			else if(i>(len/2))
			{
				temp[i]=Character.toLowerCase(tempArray[i]);
			}
			
			
		}
        }
        
		return temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="democracy";
		System.out.println(Exercise2.getArray(s))   ;

	}

}
