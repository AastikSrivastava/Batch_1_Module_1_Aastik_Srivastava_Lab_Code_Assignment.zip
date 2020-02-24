package Jdbc_Lab_Code_Book_Assignment2;

import java.sql.SQLException;

import java.util.*;
public class Assignment2Service {

	Assignment2Dao obj;
	List <String>list;
	
	Scanner sc=new Scanner(System.in);
	
	public void selectBookTitles() throws SQLException {
		obj=new Assignment2Dao();
		System.out.println("Enter Author Name:");
		String name=sc.next();
		list=new ArrayList<String>();
		list=obj.selectBookTitles(name);
		for(String str:list) {
			System.out.println(str);
		}
		
	}
	
	public void updatePrice() throws SQLException {
		obj=new Assignment2Dao();
		System.out.println("Enter Author Name:");
		String name=sc.next();
		boolean b=obj.updatePrice(name);
		if(b)
			System.out.println("Price has been updated by Rs. 200");
		else
			System.out.println("Sorry, some error occurred");
	}
	
	public void insertAuthor() throws SQLException{
		obj=new Assignment2Dao();
		
		System.out.println("Enter Author Id:");
	       int author_id=sc.nextInt();
	       System.out.println("Enter Author First Name:");
	       String first_name=sc.next();
	       System.out.println("Enter Author Middle Name:");
	       String  middle_name=sc.next();
	       System.out.println("Enter Author Last Name:");
	       String last_name=sc.next();
	       System.out.println("Enter Phone Number:");
	       int phoneNo=sc.nextInt();
	       boolean result=obj.insertAuthor(author_id,first_name,middle_name,last_name,phoneNo);
	       if(result==true)
	    	   System.out.println("New Author has been inserted");
	       else
	    	   System.out.println("Some error occured");
	}
	
	public void insertBook() throws SQLException{
		
        obj=new Assignment2Dao();
		
		System.out.println("Enter Book ISBN:");
	       int isbn=sc.nextInt();
	       System.out.println("Enter Book Name:");
	       String book_name=sc.next();
	       System.out.println("Enter Book Price:");
	       int  price=sc.nextInt();
	       System.out.println("Enter Author Id:");
	       int author_id=sc.nextInt();
	      
	       boolean result=obj.insertBook(isbn,book_name,price,author_id);
	       if(result==true)
	    	   System.out.println("New Author has been inserted");
	       else
	    	   System.out.println("Some error occured");
	}
	
	public void showAll() throws SQLException {
		
		 obj=new Assignment2Dao();
		 obj.showAll();
	}

}
