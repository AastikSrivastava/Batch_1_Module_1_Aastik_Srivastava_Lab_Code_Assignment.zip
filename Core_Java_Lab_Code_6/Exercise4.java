package Core_Java_Lab_Code_6;


import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		String s1 = Exercise4.alterString(s);
		System.out.println(s+" is changed as "+s1);
	}

	public static String alterString(String s) {
		char ch;
		String s1="";
		for (int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			if ((ch != 'A') && (ch != 'E') && (ch != 'I') && (ch != 'O') && (ch != 'U') && (ch != 'a') && (ch != 'e')
					&& (ch != 'i') && (ch != 'o') && (ch != 'u')) {
				
				s1+=(char)(ch + 1);

			} else {
				s1+=ch;

			}

		}
		return s1;
	}

}