package Package1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.mysql.jdbc.Statement;
public class Task
{
  Scanner scanner=new Scanner(System.in);
  public void addBook()
  {
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="insert into test.bookinfo values(?,?,?,?)";
	try
	{
	  Connection connection=DriverManager.getConnection(url);
	  PreparedStatement preparedStatement=connection.prepareStatement(query);
	  
	  System.out.println("Add a book name: ");
	  String addbook=scanner.next();
	  preparedStatement.setString(1,addbook);
	  
	  System.out.println("Add author name: ");
	  String authorName=scanner.next();
	  preparedStatement.setString(2,authorName);
	  
	  System.out.println("Add a price: ");
	  String addPrice=scanner.next();
	  preparedStatement.setString(3,addPrice);
	  
	  System.out.println("Add bookID: ");
	  String addId=scanner.next();
	  preparedStatement.setString(4,addId);
	  preparedStatement.executeUpdate();
	  System.out.println("Book is added successfully.....");
	  
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
  }
  public void searchAuthor()
  {
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	String query="select BookName from test.bookinfo where BookAuthor='?'";
	try
	{
	Connection connection=DriverManager.getConnection(url);
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	
	System.out.println("Search the author: ");
	String author=scanner.next();
	preparedStatement.setString(1,author);
	ResultSet resultSet=preparedStatement.executeQuery();
	  while(resultSet.next())
	  {
		String username=resultSet.getString("BookName");
		System.out.println("The author is present in the database is: "+username);
	  }
	  connection.close();
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
  }
  public void modifyPrice()
  {
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
    String query="update test.bookinfo set BookPrice=? where BookName=?";
    try
	{
	Connection connection=DriverManager.getConnection(url);
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	
	System.out.println("Enter name of the book: ");
	String name=scanner.next();
	preparedStatement.setString(1,name);
	
	System.out.println("Enter the price of the book: ");
	String price=scanner.next();
	preparedStatement.setString(2,price);
	
	preparedStatement.executeUpdate();
	connection.close();
	}
	catch(Exception e)
	{
	  e.printStackTrace();
	}
  }
  public void removeAuthor()
  {
	 String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	 String query="delete from test.bookinfo where BookAuthor=?";
	 try
		{
		Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		System.out.println("Enter name of the author: ");
		String author=scanner.next();
		preparedStatement.setString(1,author);
		
		preparedStatement.executeUpdate();
		connection.close();
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		} 
  }
}
