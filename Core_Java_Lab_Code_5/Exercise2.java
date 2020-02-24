package Core_Java_Lab_Code_5;

import java.util.Scanner;

public class Exercise2 {

	public static int Fibonacci(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		else
			 return (Fibonacci(n-1)+Fibonacci(n-2));
		
	}
	
	public static int IterativeFibo(int n) {
		
		int i,f3=0;
		
		int f1=1,f2=1;
		
		for(i=1;i<n-1;i++){
	   		f3=f1+f2;
		   f1=f2;
		   f2=f3;
		}
		
		return f3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int t=n;
		
		int f3=IterativeFibo(n);
		
		System.out.println("Iterative nth value is "+f3);
		
		int fibo=Fibonacci(t);
		
		System.out.println("Recursively nth value of fibonacci is "+fibo);
		
	}

}
