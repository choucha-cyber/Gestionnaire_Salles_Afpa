package Model;

import javax.swing.JOptionPane;

public class Identification {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	private String statut;
	private String connexionValeur;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getConnexionValeur() {
		return connexionValeur;
	}
	public void setConnexionValeur(String connexionValeur) {
		this.connexionValeur = connexionValeur;
	}
	public Identification(int id, String nom, String prenom, String email, String motDePasse, String statut,
			String connexionValeur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.statut = statut;
		this.connexionValeur = connexionValeur;
	}
	
	
	
	
	public Identification(String nom, String prenom, String email, String motDePasse, String statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.statut = statut;
	}
	@Override
	public String toString() {
		return "Identification [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", motDePasse="
				+ motDePasse + ", statut=" + statut + ", connexionValeur=" + connexionValeur + "]";
	}

	
//METHODES
	
	public boolean verifMail() {
		return false;
	}
	
	
	public boolean isManager() {
		return false;
	}
	
	public boolean connexion() {
		return false;
	}
	public void creationCompte() {
		JOptionPane.showMessageDialog(null, "Votre compte est initialisé");
	}
	
	
	

	
	


}
