package Model;

public class Admin {

		
		
		//attributs
		private int id;
		private String nom;
		private String prenom;
		//private Statut statut; //manager ou formateur
		private String email;
		private String mdp;
		
		
		//construct
		public Admin(String nom, String prenom, String email, String mdp) {
			
			this.nom = nom;
			this.prenom = prenom;
			//this.statut = statut;
			this.email = email;
			this.mdp = mdp;
		}


		public Admin(String nom, String prenom, String statut, String email,
				String mdp) {
			// TODO Auto-generated constructor stub
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


