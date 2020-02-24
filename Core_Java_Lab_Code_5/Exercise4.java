package Core_Java_Lab_Code_5;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("First Name");
		String firstName=sc.nextLine();
		
		System.out.println("Last Name");
		String lastName=sc.nextLine();
		
		try {
			if(firstName.isEmpty() || lastName.isEmpty()) {
				
				throw new NullPointerException();
			   }
			else
				System.out.println(firstName+" "+lastName);
			
		}catch(NullPointerException e) {
			
			System.out.println("First and Last name should not be empty");
		}
		
	  }
}
