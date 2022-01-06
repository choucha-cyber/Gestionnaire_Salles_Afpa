package Controller;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Model.Salle;

public class SalleDao {
	
	static //Appel de la connection
	Connection connect = GetConnection.getConnection();
	
	
	//REQUETE DE RESERVATION SALLE	(disponible Salle true/false)
	public boolean reserver(Salle salle) {
		
		boolean message = false;
		try {
			//Jamel
			PreparedStatement req = connect.prepareStatement("INSERT INTO salle"
					+ "(etage, numSalle, disponible) VALUES (?,?, ?) ");
			
			req.setInt(1, salle.getEtage());
			req.setInt(2, salle.getNumSalle());
			req.setString(3, salle.toString());
			
			
			req.executeUpdate();
			message = true;
			System.out.println("reservation OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Echec réservation salle");
			
		}
		return message;
		
	}

	

	public static List<Salle> afficherSallesDispo() {
		List<Salle> listeSalleDispo = new ArrayList<>();
		
		try {
//			PreparedStatement req = connect.prepareStatement("SELECT * FROM salle");
			PreparedStatement req = connect.prepareStatement("SELECT * FROM salle WHERE disponible = true ");
			
			ResultSet rs = req.executeQuery();
			while(rs.next()) {
//				Salle salle = new Salle(rs.getInt("id"), rs.getInt("etage"),rs.getInt("numSalle"),rs.getBoolean("disponible"));
				Salle salle = new Salle(rs.getInt("id"), rs.getInt("etage"),rs.getInt("numSalle"));
				//Jamel
				//Afficher résultat du recordset
				listeSalleDispo.add(salle);
//				System.out.println(listeSalleDispo);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("La réservation a échouée");
		}
		return listeSalleDispo;
		
	}
	
	//Partie Ajout salle de formation Variante Backup !
	//Jamel 2021_12_23 16:35
//	public void addReservation(Salle room) {
//		Connection connect = GetConnection.getConnection();
//		try {
//			PreparedStatement sql = connect.prepareStatement("INSERT INTO salle (etage, numSalle VALUES (?,?)");
//			sql.setInt(1, room.getEtage());
//			sql.setInt(2, room.getNumSalle());
//		
//			
//			
//			System.out.println("INSERT INTO salle (etage, numSalle)"
//					+ " VALUES (?,?)");
//			
//			sql.executeUpdate();
//			
//			
//JOptionPane.showMessageDialog(null,"Ajout de : " + room.getEtage() + " " + room.getNumSalle() ,null, 1);
//			
//		} catch (SQLException e) {
//			JOptionPane.showMessageDialog(null,"Impossible de rÃ©server !" ,null, 0);
//			e.printStackTrace();
//		}
//		
//	
//
//}
	
////////////////////
//	//Partie Ajout salle de formation
//	//Jamel 2021_12_23 16:35
	public void addReservation(Salle room) {
		Connection connect = GetConnection.getConnection();
		try {
			PreparedStatement sql = connect.prepareStatement("INSERT INTO salle (etage, numSalle, disponible) VALUES (?,?,?)");
			sql.setInt(1, room.getEtage());
			sql.setInt(2, room.getNumSalle());
			sql.setBoolean(3,  room.getDisponible());
			sql.executeUpdate();
			
			
			System.out.println("INSERT INTO salle (etage, numSalle, disponible)"
					+ " VALUES (?,?,?))");
			
		
			
			
JOptionPane.showMessageDialog(null,"Ajout de : " + room.getEtage() + " " + room.getNumSalle() + " " + room.getDisponible(),null, 1);
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Impossible de rÃ©server !" ,null, 0);
			e.printStackTrace();
		}
		
	

}
////////////////////////////////
	

}//â—„
