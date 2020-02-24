package Core_Java_Lab_Code_4;

import java.util.Scanner;

public class Operators {

	public static int CubeSum(int n) {
		
		int r,sum=0;
		
		while(n!=0) {
			
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int x=CubeSum(n);
		
		System.out.println(x);
	}
}
