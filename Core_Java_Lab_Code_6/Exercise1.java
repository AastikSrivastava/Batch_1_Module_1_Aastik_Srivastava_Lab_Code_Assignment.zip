package Core_Java_Lab_Code_6;

import java.util.Scanner;
import java.util.StringTokenizer;
	 
	class Exercise1 {
	    public static void main(String args[]) {
	        int n;
	        int sum=0;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter line of integers with a space gap: ");
	        String str=sc.nextLine();
	        
	        StringTokenizer stkr=new StringTokenizer(str, " ");
	        
	        System.out.println("Integers: ");
	        
	        while (stkr.hasMoreTokens()) {
	        	
	            String s=stkr.nextToken();
	            
	            n=Integer.parseInt(s);
	            
	            System.out.println(n);
	            sum=sum+n;
	        }
	        System.out.println("sum of integers is: "+sum);
	    }
	}

