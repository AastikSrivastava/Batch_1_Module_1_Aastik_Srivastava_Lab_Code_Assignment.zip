package Core_Java_Lab_Code_6;


import java.util.Scanner;

public class Exercise5 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be modified: ");
		int number1=sc.nextInt();
		int number2=Exercise5.modifyNumber(number1);
		System.out.println("Modified no: "+number2);
	}
	public static int modifyNumber(int number1) {
		String s=Integer.toString(number1);
		StringBuffer sb=new StringBuffer();
		char ch1,ch2;
		int s1,s2,c=0,d;
		for(int i=0;i<s.length()-1;i++) {
			c++;
			ch1=s.charAt(i);
			ch2=s.charAt(i+1);
			s1=(int)ch1;
			s2=(int)ch2;
			d=Math.abs(s1-s2);
			sb=sb.append(d);
		}
		sb=sb.append(s.charAt(c));
		int b=Integer.parseInt(sb.toString());
		return b;
	}
}
