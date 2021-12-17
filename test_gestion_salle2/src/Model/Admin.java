package Model;



public class Admin {
	
	
	//attributs
	private int id;
	private String nom;
	private String prenom;
	private Statut statut; //manager ou formateur
	private String email;
	private String mdp;
	
	
	//construct
	public Admin(String nom, String prenom, Statut statut, String email, String mdp) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
		this.email = email;
		this.mdp = mdp;
	}


	//Assessors
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


	public Statut getStatut() {
		return statut;
	}


	public void setStatut(Statut statut) {
		this.statut = statut;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	//methods
	
	
		
			
		
	

}
