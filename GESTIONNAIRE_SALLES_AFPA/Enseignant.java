package GESTIONNAIRE_SALLES_AFPA;

public class Enseignant {
	
	private int id_enseignant;
	private String nom_enseignant;
	public Enseignant(int id_enseignant, String nom_enseignant) {
		super();
		this.id_enseignant = id_enseignant;
		this.nom_enseignant = nom_enseignant;
	}
	public int getId_enseignant() {
		return id_enseignant;
	}
	
	public String getNom_enseignant() {
		return nom_enseignant;
	}
	public void setNom_enseignant(String nom_enseignant) {
		this.nom_enseignant = nom_enseignant;
	}
	
	
	

}
