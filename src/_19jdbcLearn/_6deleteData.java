package _19jdbcLearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class _6deleteData {

	public void deleteData() {
		
		try {
			String url="jdbc:mysql://localhost:3306/studentsinfo";
			String username="root";
			String password="root";
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			String query="delete from personalinfo where id=2";
			
			PreparedStatement pstm = conn.prepareStatement(query);
			
			pstm.executeUpdate();
			
			System.out.println("Delete Successfully...");
			
			conn.close();
		}
		catch (Exception e) {

		         System.out.println(e);
		}
	}
}
