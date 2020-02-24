package Core_Java_Lab_Code_10;

import java.util.Scanner;

public class Exercise1 {

	interface funcInterface{
		double operation(int x,int y);
	}
	
	private double operate(int x,int y, funcInterface obj) {
		return obj.operation(x,y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funcInterface power=(int x,int y)->Math.pow(x,y);
		Exercise1 tobj=new Exercise1();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		System.out.println(tobj.operate(p, q,power));
	}

}
