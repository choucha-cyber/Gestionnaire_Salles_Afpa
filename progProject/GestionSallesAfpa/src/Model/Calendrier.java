package Model;

import java.util.Date;

import javax.swing.JOptionPane;

public class Calendrier{
	
	private int id;
	private Date dateCalendrier;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateCalendrier() {
		return dateCalendrier;
	}
	public void setDateCalendrier(Date dateCalendrier) {
		this.dateCalendrier = dateCalendrier;
	}
	
	public Calendrier(int id, Date dateCalendrier) {
		super();
		this.id = id;
		this.dateCalendrier = dateCalendrier;
	}
	
	
	@Override
	public String toString() {
		return "Calendrier [id=" + id + ", dateCalendrier=" + dateCalendrier + "]";
	}

	
	public Date dateCalendrier() {
		return dateCalendrier;
	}
	
	public boolean connectionValeur() {
		return false;
	}
	
	
	public void apercu() {
		JOptionPane.showMessageDialog(null, "apercu");
	}
	
	

}
