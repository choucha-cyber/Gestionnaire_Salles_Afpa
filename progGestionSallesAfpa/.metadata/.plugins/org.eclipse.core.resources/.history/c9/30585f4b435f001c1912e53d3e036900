package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdentificationDao {

	//Appel de la connection
		Connection connect = GetConnection.getConnection();
	
		
		public boolean login(String mailLogin, String passwordLogin) {
			
			Boolean msg = false;
			try {
				PreparedStatement sql = connect.prepareStatement("SELECT * FROM identification WHERE emailLogin=? "
						+ "AND passwordLogin=PASSWORD(?)");
				sql.setString(1, mailLogin);
				sql.setString(2, passwordLogin);
				
				///System.out.println(sql);
				ResultSet rs = sql.executeQuery();
				
				if(rs.next()) {
					
					msg = true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return msg;
			
		}
	
}
