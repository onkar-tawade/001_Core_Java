package _19jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class _2tableCreation {
	
	public void tableCreation(){
		try {
			String url="jdbc:mysql://localhost:3306/studentsinfo";
			String username="root";
			String password="root";
			
			Connection c= DriverManager.getConnection(url, username, password);//// Driver load and established connection....
			
			
			Statement stm=c.createStatement();///Create statement
			
			String query="create table personalInfo(id int(4),name varchar(40),email varchar(40))";/// making query
			
			stm.execute(query);///Execute query
			
			System.out.println("Table created successfully...");
			c.close();        /// close connection here.....
		} 
		catch (Exception e) {
             System.out.println(e);
		}
	}

}
