package Jdbc_Lab_Code_Book_Assignment2;

import java.sql.SQLException;
import java.util.Scanner;

import Jdbc_Lab_Code_Book_Assignment1.Exercise1_2Dao;

public class Assignment2Client {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	
	try {
		Assignment2Service exc=new Assignment2Service();
		
		
		for(;;) {
			System.out.println("\nChoose the operation that you want to perform:");
			System.out.println("1.Insert Author Record");
			System.out.println("2.Insert Book Record");
			System.out.println("3.Select the list of all book titles which are written by specific Author");
			System.out.println("4.Update the price of books for particular author name");
			System.out.println("5.Show all Author Records");
			System.out.println("6.Exit");
			int x=sc.nextInt();
			
			switch(x) {
			case 1: exc.insertAuthor();
			        break;
			case 2:exc.insertBook();
			       break;
			case 3:exc.selectBookTitles();
			       break;
			case 4:exc.updatePrice();
			       break;
			case 5:exc.showAll();
			       break;
			case 6: System.exit(0);
			}
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
}
}
}

