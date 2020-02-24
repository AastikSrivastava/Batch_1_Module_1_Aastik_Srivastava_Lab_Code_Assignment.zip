package Core_Java_Lab_Code_5;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) throws EmployeeException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		
		int salary=sc.nextInt();
		
		if(salary<3000)
			throw new EmployeeException("Salary leass than 3000");
		else
			System.out.println("Salary is "+salary);
	}

}

