package Core_Java_Lab_Code_3;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public int getSecondSmallestElement(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static void main(String args[]) {
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		Exercise1 obj=new Exercise1();
		
		int x=obj.getSecondSmallestElement(arr);
		
		System.out.println(x);
		
	}
}
