package myApp;
import java.sql.*;
public class DBconn {
		public static void main(String[] args) {
		    try {
		      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBS","root","Vivek@123");
//		      System.out.println("Connected With the database successfully");
		    } catch (SQLException e) {
		    	
		    	e.printStackTrace();
		    }
		      System.out.println("Connected");
		    }
		  }

