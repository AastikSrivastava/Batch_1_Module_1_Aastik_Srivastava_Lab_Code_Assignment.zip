package Jdbc_Lab_Code_Book_Assignment1;

import java.sql.*;
import java.util.Scanner;

public class Exercise1_2 {
public static void main(String[] args)   {

	Scanner sc=new Scanner(System.in);
	
	boolean result;
	
	 String first_name,middle_name,last_name;
	 
	int author_id,phoneNo;
	try {
		
	Exercise1_2Dao exc=new Exercise1_2Dao();
	
	
	for(;;) {
		System.out.println("\nChoose the operation that you want to perform:");
		System.out.println("1.Insert Author Record");
		System.out.println("2.Delete Author Record");
		System.out.println("3.Update Author Record");
		System.out.println("4.Show all Author Records");
		System.out.println("5.Exit");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:System.out.println("Enter Author Id:");
		       author_id=sc.nextInt();
		       System.out.println("Enter Author First Name:");
		       sc.nextLine();
		       first_name=sc.nextLine();
		       System.out.println("Enter Author Middle Name:");
		       
		        middle_name=sc.nextLine();
		       System.out.println("Enter Author Last Name:");
		       
		       last_name=sc.nextLine();
		       System.out.println("Enter Phone Number:");
		       phoneNo=sc.nextInt();
		       result=exc.insert(author_id,first_name,middle_name,last_name,phoneNo);
		       if(result==true)
		    	   System.out.println("Insert operation has been performed");
		       else
		    	   System.out.println("Some error occured");
		       break;
		
		case 3:System.out.println("Enter Author Id that you want to update:");
	        author_id=sc.nextInt();
	       System.out.println("Enter Author First Name:");
	       sc.nextLine();
	      first_name=sc.nextLine();
	       System.out.println("Enter Author Middle Name:");
	       
	        middle_name=sc.nextLine();
	       System.out.println("Enter Author Last Name:");
	       last_name=sc.nextLine();
	       System.out.println("Enter Phone Number:");
	     phoneNo=sc.nextInt();
	  
	       result=exc.update(author_id,first_name,middle_name,last_name,phoneNo);
	       if(result==true)
	    	   System.out.println("Update operation has been performed");
	       else
	    	   System.out.println("Some error occured");
	       break;
	       
	       
		case 2:
			System.out.println("Enter Author Id:");
	        author_id=sc.nextInt();
			result=exc.delete(author_id);
			 if(result==true)
		    	   System.out.println("Delete operation has been performed");
		       else
		    	   System.out.println("Some error occured");
			 break;
			 
			 
		case 4:
		       exc.getAllAuthor();
		       break;
		       
		case 5:System.exit(0);
			
		       
		}
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	
	
}
}
