package MODEL;


import java.util.Date;

public class Salle {

	private int id;
	private int num_etage;
	private int num_salle;
	private boolean disponibilite;
	
	
	
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle(int num_etage, int num_salle, boolean disponibilite) {
		super();
		this.num_etage = num_etage;
		this.num_salle = num_salle;
		this.disponibilite = disponibilite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum_etage() {
		return num_etage;
	}
	public void setNum_etage(int num_etage) {
		this.num_etage = num_etage;
	}
	public int getNum_salle() {
		return num_salle;
	}
	public void setNum_salle(int num_salle) {
		this.num_salle = num_salle;
	}
	public boolean getDisponibilite() {//ajouter la condition true
		// TODO Auto-generated method stub
		return false;
	}
	
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	
	
	
	
}
