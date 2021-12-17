package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Salle;

public class SalleDao {
	
	//Appel de la connection
	Connection connect = GetConnection.getConnection();
		
	public boolean reserver(Salle salle) {
		
		boolean message = false;
		try {
			
			PreparedStatement req = connect.prepareStatement("INSERT INTO salle"
					+ "(num_etage, num_salle, disponibilite) VALUES (?,?, ?) ");
			
			req.setInt(1, salle.getEtage());
			req.setInt(2, salle.getNumSalle());
			req.setBoolean(3, salle.isDisponible());
			
			
			req.executeUpdate();
			message = true;
			System.out.println("reservation OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("échec résa");
			
		}
		return message;
		
	}

	
	//Affichage des salles dispo
	public List<Salle> afficherSallesDispo() {
		List<Salle> listeSalleDispo = new ArrayList<>();
		
		try {//req sql pour afficher les salle dispo donc 'where disponibilite = true' (champs a ajouter dans la bdd)
			PreparedStatement req = connect.prepareStatement("SELECT * FROM salle WHERE disponibilite = true ");
			
			ResultSet rs = req.executeQuery();
			//System.out.println(req);
			while(rs.next()) {
				Salle salle = new Salle();
				salle.setId(rs.getInt("id"));
				salle.setEtage(rs.getInt("num_etage"));
				salle.setNumSalle(rs.getInt("num_salle"));
				salle.setDisponible(rs.getBoolean("disponibilite"));
				
				
				listeSalleDispo.add(salle);
			}
			//System.out.println("-------------------"+listeArticle);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
		}
		return listeSalleDispo;
	}
	
	//isDisponible
		public boolean disponible() {
			boolean message =  false;
			
			try {
				PreparedStatement sql = connect.prepareStatement("SELECT * FROM salle WHERE disponible = ? ");
				sql.setBoolean(1,  disponible());
				
				ResultSet rs = sql.executeQuery();
				
					if(!rs.next()) {
						message = true;
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return message;
			
			
		}
	
	

}
