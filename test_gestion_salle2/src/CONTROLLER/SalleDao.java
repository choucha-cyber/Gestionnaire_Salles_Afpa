package CONTROLLER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import MODEL.Salle;

public class SalleDao {
	
	//Appel de la connection
	Connection connect = GetConnection.getConnection();
		
	public boolean reserver(Salle object) {
		
		boolean message = false;
		try {
			
			PreparedStatement req = connect.prepareStatement("INSERT INTO salle"
					+ "(num_etage, num_salle, disponibilite) VALUES (?,?, ?) ");
			
			req.setInt(1, object.getNum_etage());
			req.setInt(2, object.getNum_salle());
			req.setBoolean(3, object.getDisponibilite());
			
			
			req.executeUpdate();
			message = true;
			System.out.println("reservation OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
			
		}
		return message;
		
	}

	
	//Affichage des salles dispo
	public List<Salle> read() {
		List<Salle> listeSalleDispo = new ArrayList<>();
		
		try {//req sql pour afficher les salle dispo donc 'where disponibilite = true' (champs a ajouter dans la bdd)
			PreparedStatement req = connect.prepareStatement("SELECT * FROM salle WHERE disponibilite = true ");
			
			ResultSet rs = req.executeQuery();
			//System.out.println(req);
			while(rs.next()) {
				Salle salle = new Salle();
				salle.setId(rs.getInt("id"));
				salle.setNum_etage(rs.getInt("num_etage"));
				salle.setNum_salle(rs.getInt("num_salle"));
				salle.setDisponibilite(rs.getBoolean("disponibilite"));
				
				
				listeSalleDispo.add(salle);
			}
			//System.out.println("-------------------"+listeArticle);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO - KO - KO");
		}
		return listeSalleDispo;
	}
	
	

}
