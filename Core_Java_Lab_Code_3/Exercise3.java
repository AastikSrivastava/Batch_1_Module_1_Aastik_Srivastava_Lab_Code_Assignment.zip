package Core_Java_Lab_Code_3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public void getSorted() {
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[3];
		
		for(Integer i:arr) {
			
			arr[i]=sc.nextInt();
		}
		String str=Arrays.toString(arr);
		
		System.out.println(str);
	
	}
}

