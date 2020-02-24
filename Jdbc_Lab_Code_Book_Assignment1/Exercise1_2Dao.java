package Jdbc_Lab_Code_Book_Assignment1;

import java.sql.*;



public class Exercise1_2Dao {
	ResultSet rst;
	Statement st;
	PreparedStatement pst;
	Connection connection;
	
public Exercise1_2Dao() throws SQLException {

	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","bini");
	connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","bini");
	if(connection!=null)
		System.out.println("Connection established");
	else
		System.out.println("Something went wrong");
	st=connection.createStatement();
	}

public boolean insert(int author_id,String first_name,String middle_name,String last_name,int phoneNo) throws SQLException {
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

public boolean update(int author_id,String first_name,String middle_name,String last_name,int phoneNo) throws SQLException {
	pst=null;
	   pst=connection.prepareStatement("update author set firstName=?,middleName=?, lastName=?, phoneNumber=? where authorId=?");

	   pst.setString(1, first_name);
	   pst.setString(2, middle_name);
	   pst.setString(3, last_name);
	   pst.setInt(4, phoneNo );
	   pst.setInt(5, author_id);
	   
	   int rst=pst.executeUpdate();
	   if(rst==1)
		   return true;
	   else
		   return false;
	
}

public boolean delete(int author_id) throws SQLException {
	pst=null;
	pst=connection.prepareStatement("delete from author where authorId=?");
	pst.setInt(1, author_id);
	
	int rst=pst.executeUpdate();
	System.out.println("test");
	if(rst==1)
		return true;
	else
		return false;
	
	
}
public void getAllAuthor()  throws SQLException{
	// TODO Auto-generated method stub
	pst=connection.prepareStatement("select* from author");
	rst=pst.executeQuery();
	
	while(rst.next())
	{
		System.out.println(rst.getString(1)+" "+rst.getString(2)+" "+rst.getString(3)+" "+rst.getString(4)+" "+rst.getString(5));
		
	}
	
}


}

