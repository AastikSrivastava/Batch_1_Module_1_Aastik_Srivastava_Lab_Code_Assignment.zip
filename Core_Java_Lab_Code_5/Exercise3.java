package Core_Java_Lab_Code_5;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		
		int x;
		
		int c=0;
		
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		
		for(int i=1;i<x;i++) {
			c=0;
			
			for(int j=1;j<x;j++) {
				if(i%j==0)
					c++;
			}
			//System.out.println(c);
			if(c<=2)
				System.out.println(i);
		}
		
	}
}

