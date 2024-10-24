package _19jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class _3insertData {

	public void dataInsertion() {
		try {
			String url="jdbc:mysql://localhost:3306/studentsinfo";
			String username="root";
			String password="root";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			String query="insert personalinfo values(?,?,?)";
			
			PreparedStatement pstm = conn.prepareStatement(query);           //// here we take PreparedStatement interface
			
			pstm.setInt(1, 4);                               ///Here we set the values  in bracket 1st is index of placeholder and then the value...
			pstm.setString(2, "Amey");
			pstm.setString(3, "amey@4321");
			
			pstm.execute();                                      ///here execute the query...
			
			System.out.println("Data inserted succesfully");
			conn.close();
		} 
		catch (Exception e) {
            
			System.out.println(e);
		}
	}
}
