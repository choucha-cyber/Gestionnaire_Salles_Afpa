package BLOG;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import CONTROLLER.SalleDao;
import CONTROLLER.ManagerDao;
import MODEL.Salle;
import Test.TestCalendar;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReserverSalle frame = new ReserverSalle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 957, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 79, 957, 463);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton reservSalle = new JButton("Réserver une salle");
		reservSalle.setBounds(651, 76, 161, 23);
		panel_1.add(reservSalle);
		reservSalle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ManagerDao.currentManager == null) {
					JOptionPane.showMessageDialog(null, "Vous devez vous connecter avant de réserver une salle");
					//contentPane.removeAll();
					dispose();
					AjoutManager ins = new AjoutManager();
					/*contentPane.add(ins);
					contentPane.repaint();
					contentPane.revalidate();*/
					ins.setVisible(true);
				}
				
			}
		});
		
		SalleDao salleDao = new SalleDao();
		if(salleDao.read().isEmpty()) {
			
			JLabel lblNewLabel = new JLabel("Pas de réservation pour le moment. effectuez une réservation ? ");
			lblNewLabel.setBounds(59, 25, 718, 150);
			panel_1.add(lblNewLabel);
			
			
		}
	}
	
	//Liste des salles
		public DefaultTableModel liste() {
			
			String [] col = {"id","num_etage","num_salle"};
			DefaultTableModel tab = new DefaultTableModel(null, col);
			
			SalleDao salleDao = new SalleDao();
			List<Salle> listeSalle = new ArrayList<>();
			listeSalle.addAll(salleDao.read());
			for (Salle salle : listeSalle) {
				Vector vect = new Vector();
				vect.add(salle.getId());
				 vect.add(salle.getNum_etage());
				 vect.add(salle.getNum_salle());
				 
				 tab.addRow(vect);
			}
			return tab;
		}
}
