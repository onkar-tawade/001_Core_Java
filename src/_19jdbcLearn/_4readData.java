package _19jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class _4readData {
	
	public void readData() {
	try {
		String url="jdbc:mysql://localhost:3306/studentsinfo";
		String username="root";
		String password="root";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		String query="select * from personalinfo";
		
		Statement stm = conn.createStatement();           //// here we take PreparedStatement interface
		
		ResultSet rs = stm.executeQuery(query);                                      ///here executeQuery returns the ResultSet
		
		while(rs.next()) {         /// this loop is till execute when rs have the values....means rs==true....
		System.out.println("id = "+ rs.getInt(1));
		System.out.println("name = "+rs.getString(2));
		System.out.println("email = "+rs.getString(3));
		
		System.out.println();
		
		}
		
		System.out.println("Read data succesfully");
		
		conn.close();
	} 
	catch (Exception e) {
        
		System.out.println(e);
	}
}
}

