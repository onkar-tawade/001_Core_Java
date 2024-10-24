package _19jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class _5updateData {

	public void updateData() {
		try {
			String url="jdbc:mysql://localhost:3306/studentsinfo";
			String username="root";
			String password="root";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			String query="update personalinfo set id=? where name=?";
			
			PreparedStatement pstm = conn.prepareStatement(query);           //// here we take PreparedStatement interface
			
			pstm.setInt(1, 4);                      ///Here we set the values on placeholder
			pstm.setString(2, "Amey");              ///Here we set the values on placeholder
			
			pstm.executeUpdate();                                      ///here execute the query...
			
			System.out.println("Data updated succesfully");
			conn.close();
		} 
		catch (Exception e) {
            
			System.out.println(e);
		}
	}
	
}
