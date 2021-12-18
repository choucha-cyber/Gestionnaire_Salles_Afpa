package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Identification;

public class IdentificationDao {

	//Partie Login
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
		
		//Partie Inscription
		public void inscription(Identification individu) {
			
			try {
				PreparedStatement sql = connect.prepareStatement("INSERT INTO identification (nom, prenom, email, motDePasse, statut)"
						+ " VALUES (?,?,?,PASSWORD(?),?)");
				sql.setString(1, individu.getNom());
				sql.setString(2, individu.getPrenom());
				sql.setString(3, individu.getEmail());
				sql.setString(4, individu.getMotDePasse());
				sql.setString(5, individu.getStatut());
			
				
				
				System.out.println("INSERT INTO identification (nom, prenom, email, motDePasse, statut)"
						+ " VALUES (?,?,?,PASSWORD(?),?");
				
				sql.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//Partie Email
		public boolean mailExist(String mail) {
			Boolean msg = false;
			try {
				PreparedStatement sql = connect.prepareStatement("SELECT * FROM identification WHERE email = ?");
				
				sql.setString(1, mail);
				
				ResultSet rs = sql.executeQuery();
				
				if(!rs.next()) {
					msg = true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return msg;
		}
		
	
}
