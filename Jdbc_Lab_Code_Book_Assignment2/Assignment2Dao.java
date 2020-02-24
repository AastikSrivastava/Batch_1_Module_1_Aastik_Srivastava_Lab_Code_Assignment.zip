package Jdbc_Lab_Code_Book_Assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class Assignment2Dao {

	Connection connection;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	List<String> bookTitles;
	
	public Assignment2Dao() throws SQLException {
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","bini");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","bini");
		if(connection!=null)
			System.out.println("Connection established");
		else
			System.out.println("Something went wrong");
		st=connection.createStatement();
		
	}

	public List<String> selectBookTitles(String authorName) throws SQLException{
		
		pst=connection.prepareStatement("select book_name from book inner join author on book.author_id=author.authorid  where firstname=?");
		pst.setString(1, authorName);
		rs=null;
		rs=pst.executeQuery();
		bookTitles=new ArrayList<>();
		
		while(rs.next()) {
			
			bookTitles.add(rs.getString(1));
		}
		
		return bookTitles;
	}
	
	public boolean updatePrice(String authorName) throws SQLException {
		
		 pst=null;
  	   pst=connection.prepareStatement("update book set cost=cost+200"
  	   		+ " where author_id=(select distinct author_id "
  	   		+ "from book inner join author on book.author_id=author.authorid where firstname=?)");
  	  pst.setString(1, authorName);
  	  
  	   int res=pst.executeUpdate();
  	
  	   if(res==1) 
  		   
  		   return true;
  	   else
  		   return false;
	}
	
	public boolean insertAuthor(int author_id,String first_name,String middle_name,String last_name,int phoneNo) throws SQLException {
		pst=null;
		   pst=connection.prepareStatement("insert into author values(?,?,?,?,?)");
		   pst.setInt(1, author_id);
		   pst.setString(2, first_name);
		   pst.setString(3, middle_name);
		   pst.setString(4, last_name);
		   pst.setInt(5, phoneNo);
		   int rst=pst.executeUpdate();
		   if(rst==1)
			   return true;
		   else
			   return false;
		
	}
	
	public boolean insertBook(int isbn,String book_name,int cost,int author_id) throws SQLException {
		pst=null;
		   pst=connection.prepareStatement("insert into book values(?,?,?,?)");
		   pst.setInt(1, isbn);
		   pst.setString(2, book_name);
		   pst.setInt(3,cost);
		   pst.setInt(4, author_id);
		  
		   int rst=pst.executeUpdate();
		   if(rst==1)
			   return true;
		   else
			   return false;
		
	}
	
	public void showAll()  throws SQLException{
		// TODO Auto-generated method stub
		pst=connection.prepareStatement("select* from author");
		rs=pst.executeQuery();
		System.out.println("Author Table: \n");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			
		}
		
		pst=null;
		pst=connection.prepareStatement("select* from book");
		rs=pst.executeQuery();
		System.out.println("Book Table: \n");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
		}
		
	}
}
