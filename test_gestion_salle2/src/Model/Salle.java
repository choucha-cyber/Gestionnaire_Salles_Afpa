package Model;



public class Salle {

	//attributs
	private int id;
	private int etage;
	private int numSalle;
	private boolean disponible;
	
	//constructs
	public Salle(int id, int etage, int numSalle) {
		
		this.id = id;
		this.etage = etage;
		this.numSalle = numSalle;
	}
	
	//Assessors

	public Salle() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public int getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}
	
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	//methods
	
	
	
	
}
