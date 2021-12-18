package Model;

import java.util.Date;

import javax.swing.JOptionPane;



public class Reservation {
	
	private int id;
	private Date dateReservation;
	private boolean disponibilite;
	private Periode periodeReservation;
	private int idSalle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public boolean isDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	public Periode getPeriodeReservation() {
		return periodeReservation;
	}
	public void setPeriodeReservation(Periode periodeReservation) {
		this.periodeReservation = periodeReservation;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	
	public Reservation(int id, Date dateReservation, boolean disponibilite, Periode periodeReservation, int idSalle) {
		super();
		this.id = id;
		this.dateReservation = dateReservation;
		this.disponibilite = disponibilite;
		this.periodeReservation = periodeReservation;
		this.idSalle = idSalle;
	}
	
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", dateReservation=" + dateReservation + ", disponibilite=" + disponibilite
				+ ", periodeReservation=" + periodeReservation + ", idSalle=" + idSalle + "]";
	}
	
	
	
	public void sauvegarde() {
		JOptionPane.showMessageDialog(null, "Votre salle a bien été réservée ☺");
	}
	
	
	

}


