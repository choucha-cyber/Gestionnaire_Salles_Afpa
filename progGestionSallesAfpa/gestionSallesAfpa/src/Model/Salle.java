package Model;

public class Salle {
	private int id;
	private int etage;
	private String salle;
	
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
	public String getSalle() {
		return salle;
	}
	public void setSalle(String salle) {
		this.salle = salle;
	}
	
	
	
	public Salle(int id, int etage, String salle) {
		super();
		this.id = id;
		//Par défaut on le met à 1
		this.etage = 1;
		this.salle = salle;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Salle [id=" + id + ", etage=" + etage + ", salle=" + salle + "]";
	}
	
	//Par défaut on le met à 1
	public int selectionEtage() {
		return 1;
	}
	
	public boolean selectionSalle() {
		return false;
	}
	
	

}

