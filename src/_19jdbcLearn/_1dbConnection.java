package _19jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class _1dbConnection {

	public void databaseCreation() {
		
		///....Steps for JDBC connection....- LECEC......

		///  L  -  Load the driver...
		///  E  -  Establish the connection...
		///  C  -  Create statement
		///  E  -  Execute-Query
		///  C  -  Close connection
		
		try {
			String url="jdbc:mysql://localhost:3306/";
			String  username="root";
			String password="root";

			Connection conn=DriverManager.getConnection(url, username, password);
			
			Statement stm= conn.createStatement();
			
			String query="create database tawaderao";
			stm.execute(query);
			System.out.println("Database created  Successfully.....");
			conn.close();
		} 
		catch (Exception e) {

              System.out.println(e);
			
		}
		
	}
	
}
