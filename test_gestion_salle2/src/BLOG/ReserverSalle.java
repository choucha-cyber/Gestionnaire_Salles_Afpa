package BLOG;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import CONTROLLER.SalleDao;
import MODEL.Manager;
import MODEL.Salle;
import Test.TestBouton;
import Test.TestCalendar;

import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;


public class ReserverSalle extends JFrame {


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
						TestCalendar frame2 = new TestCalendar();
						frame2.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
	
	
	
	//JPanel zoneClient = (JPanel) this.getContentPane();
    //zoneClient.setLayout(new GridLayout(2,3));
    //for (int i = 0; i<5; i++)zoneClient.add (new JButton ("Bouton #" + i));


	/**
	 * Create the panel.
	 */

	public ReserverSalle() {
		getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label = new JLabel("");
		getContentPane().add(label);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		getContentPane().setLayout(null);
		setVisible(true);
		setBounds(27, 61, 866, 528);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(0, 85, 879, 444);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel disponible = new JLabel("disponible");
		disponible.setBackground(new Color(245, 245, 245));
		disponible.setForeground(new Color(0, 0, 0));
		disponible.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		disponible.setHorizontalAlignment(SwingConstants.CENTER);
		disponible.setBounds(39, 57, 80, 25);
		panel_1.add(disponible);

		JLabel prise = new JLabel("prise");
		prise.setBackground(new Color(0, 128, 128));
		prise.setForeground(new Color(0, 0, 0));
		prise.setHorizontalAlignment(SwingConstants.CENTER);
		prise.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		prise.setBounds(39, 119, 80, 25);
		panel_1.add(prise);

		JButton btnValider = new JButton("valider réservation");
		btnValider.setBackground(new Color(0, 139, 139));
		btnValider.setForeground(new Color(0, 0, 0));
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				System.out.println(manager.getEmail());

				Salle salle = new Salle(1, 5, true);

				SalleDao salleDao = new SalleDao();

				if (salleDao.reserver(salle)) {

					JOptionPane.showMessageDialog(null, "Votre salle a bien été réservé");
					panel_1.setVisible(false);

					HomePage home = new HomePage();
					home.setVisible(true);
				}
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnValider.setBounds(422, 375, 273, 41);
		panel_1.add(btnValider);
		
		JButton btnEtage = new JButton("etage 1");
		btnEtage.setBackground(Color.GRAY);
		btnEtage.setBounds(756, 18, 117, 29);
		panel_1.add(btnEtage);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(257, 72, 597, 291);
		panel_1.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblSalle1 = new JLabel("Salle 1");
		lblSalle1.setBounds(19, 64, 61, 28);
		lblSalle1.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(lblSalle1);
		
		JLabel lblSalle2 = new JLabel("Salle 2");
		lblSalle2.setBounds(19, 104, 61, 28);
		lblSalle2.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(lblSalle2);
		
		JLabel lblSalle3 = new JLabel("Salle 3");
		lblSalle3.setBounds(19, 144, 61, 28);
		lblSalle3.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(lblSalle3);
		
		JLabel lblSalle4 = new JLabel("Salle 4");
		lblSalle4.setBounds(19, 184, 61, 28);
		lblSalle4.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(lblSalle4);
		
		JLabel lblSalle5 = new JLabel("Salle 5");
		lblSalle5.setBounds(19, 224, 61, 28);
		lblSalle5.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(lblSalle5);
		
		JLabel lblhoraires = new JLabel("     9          10          11          12          13          14          15          16          17     ");
		lblhoraires.setBounds(79, 41, 496, 16);
		panel1.add(lblhoraires);
		
		JButton btnSalle1_9 = new JButton(" ");
		btnSalle1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		JButton btnSalle1_10 = new JButton(" ");
		btnSalle1_10.setBounds(129, 65, 52, 27);
		panel1.add(btnSalle1_10);
		
		JButton btnSalle1_12 = new JButton(" ");
		btnSalle1_12.setBounds(181, 65, 52, 27);
		panel1.add(btnSalle1_12);
		
		JButton Salle1_12 = new JButton(" ");
		Salle1_12.setBounds(245, 65, 52, 27);
		panel1.add(Salle1_12);
		
		JButton btnSalle1_13 = new JButton(" ");
		btnSalle1_13.setBounds(299, 65, 52, 27);
		panel1.add(btnSalle1_13);
		
		JButton btnSalle1_14 = new JButton(" ");
		btnSalle1_14.setBounds(351, 65, 52, 27);
		panel1.add(btnSalle1_14);
		
		JButton btnSalle1_15 = new JButton(" ");
		btnSalle1_15.setBounds(415, 65, 52, 27);
		panel1.add(btnSalle1_15);
		
		JButton btnSalle1_16 = new JButton(" ");
		btnSalle1_16.setBounds(467, 65, 52, 27);
		panel1.add(btnSalle1_16);
		
		JButton btnSalle1_17 = new JButton(" ");
		btnSalle1_17.setBounds(523, 65, 52, 27);
		panel1.add(btnSalle1_17);
		
		JButton btnSalle2_9 = new JButton(" ");
		btnSalle2_9.setBounds(79, 105, 52, 27);
		panel1.add(btnSalle2_9);
		
		JButton btnSalle3_9 = new JButton(" ");
		btnSalle3_9.setBounds(79, 144, 52, 27);
		panel1.add(btnSalle3_9);
		
		JButton btnSalle4_9 = new JButton(" ");
		btnSalle4_9.setBounds(79, 184, 52, 27);
		panel1.add(btnSalle4_9);
		
		JButton btnSalle5_9 = new JButton(" ");
		btnSalle5_9.setBounds(79, 224, 52, 27);
		panel1.add(btnSalle5_9);
		
		JButton btnSalle2_10 = new JButton(" ");
		btnSalle2_10.setBounds(129, 105, 52, 27);
		panel1.add(btnSalle2_10);
		
		JButton btnSalle3_10 = new JButton(" ");
		btnSalle3_10.setBounds(129, 145, 52, 27);
		panel1.add(btnSalle3_10);
		
		JButton btnSalle4_10 = new JButton(" ");
		btnSalle4_10.setBounds(129, 184, 52, 27);
		panel1.add(btnSalle4_10);
		
		JButton btnSalle5_10 = new JButton(" ");
		btnSalle5_10.setBounds(129, 223, 52, 27);
		panel1.add(btnSalle5_10);
		
		JButton btnSalle2_11 = new JButton(" ");
		btnSalle2_11.setBounds(181, 105, 52, 27);
		panel1.add(btnSalle2_11);
		
		JButton btnSalle3_11 = new JButton(" ");
		btnSalle3_11.setBounds(181, 145, 52, 27);
		panel1.add(btnSalle3_11);
		
		JButton btnSalle4_11 = new JButton(" ");
		btnSalle4_11.setBounds(181, 185, 52, 27);
		panel1.add(btnSalle4_11);
		
		JButton btnSalle5_11 = new JButton(" ");
		btnSalle5_11.setBounds(181, 223, 52, 27);
		panel1.add(btnSalle5_11);
		
		JButton btnSalle2_12 = new JButton(" ");
		btnSalle2_12.setBounds(245, 105, 52, 27);
		panel1.add(btnSalle2_12);
		
		JButton btnSalle3_12 = new JButton(" ");
		btnSalle3_12.setBounds(245, 145, 52, 27);
		panel1.add(btnSalle3_12);
		
		JButton btnSalle4_12 = new JButton(" ");
		btnSalle4_12.setBounds(245, 185, 52, 27);
		panel1.add(btnSalle4_12);
		
		JButton btnSalle5_12 = new JButton(" ");
		btnSalle5_12.setBounds(245, 225, 52, 27);
		panel1.add(btnSalle5_12);
		
		JButton btnSalle2_13 = new JButton(" ");
		btnSalle2_13.setBounds(299, 105, 52, 27);
		panel1.add(btnSalle2_13);
		
		JButton btnSalle3_13 = new JButton(" ");
		btnSalle3_13.setBounds(299, 145, 52, 27);
		panel1.add(btnSalle3_13);
		
		JButton btnSalle4_13 = new JButton(" ");
		btnSalle4_13.setBounds(299, 185, 52, 27);
		panel1.add(btnSalle4_13);
		
		JButton btnSalle5_13 = new JButton(" ");
		btnSalle5_13.setBounds(299, 225, 52, 27);
		panel1.add(btnSalle5_13);
		
		JButton btnSalle2_14 = new JButton(" ");
		btnSalle2_14.setBounds(351, 105, 52, 27);
		panel1.add(btnSalle2_14);
		
		JButton btnSalle3_14 = new JButton(" ");
		btnSalle3_14.setBounds(351, 145, 52, 27);
		panel1.add(btnSalle3_14);
		
		JButton btnSalle4_14 = new JButton(" ");
		btnSalle4_14.setBounds(351, 185, 52, 27);
		panel1.add(btnSalle4_14);
		
		JButton btnSalle5_14 = new JButton(" ");
		btnSalle5_14.setBounds(351, 225, 52, 27);
		panel1.add(btnSalle5_14);
		
		JButton btnSalle2_15 = new JButton(" ");
		btnSalle2_15.setBounds(415, 105, 52, 27);
		panel1.add(btnSalle2_15);
		
		JButton btnSalle3_15 = new JButton(" ");
		btnSalle3_15.setBounds(415, 145, 52, 27);
		panel1.add(btnSalle3_15);
		
		JButton btnSalle4_15 = new JButton(" ");
		btnSalle4_15.setBounds(415, 185, 52, 27);
		panel1.add(btnSalle4_15);
		
		JButton btnSalle5_15 = new JButton(" ");
		btnSalle5_15.setBounds(415, 225, 52, 27);
		panel1.add(btnSalle5_15);
		
		JButton btnSalle2_16 = new JButton(" ");
		btnSalle2_16.setBounds(467, 106, 52, 27);
		panel1.add(btnSalle2_16);
		
		JButton btnSalle3_16 = new JButton(" ");
		btnSalle3_16.setBounds(467, 145, 52, 27);
		panel1.add(btnSalle3_16);
		
		JButton btnSalle4_16 = new JButton(" ");
		btnSalle4_16.setBounds(467, 185, 52, 27);
		panel1.add(btnSalle4_16);
		
		JButton btnSalle5_16 = new JButton(" ");
		btnSalle5_16.setBounds(467, 225, 52, 27);
		panel1.add(btnSalle5_16);
		
		JButton btnSalle2_17 = new JButton(" ");
		btnSalle2_17.setBounds(523, 105, 52, 27);
		panel1.add(btnSalle2_17);
		
		JButton btnSalle3_17 = new JButton(" ");
		btnSalle3_17.setBounds(523, 145, 52, 27);
		panel1.add(btnSalle3_17);
		
		JButton btnSalle4_17 = new JButton(" ");
		btnSalle4_17.setBounds(523, 185, 52, 27);
		panel1.add(btnSalle4_17);
		
		JButton btnSalle5_17 = new JButton(" ");
		btnSalle5_17.setBounds(523, 225, 52, 27);
		panel1.add(btnSalle5_17);
		
				JLabel lblNewLabel = new JLabel("Réservation des salles");
				lblNewLabel.setBounds(282, 9, 295, 40);
				panel_1.add(lblNewLabel);
				lblNewLabel.setBackground(new Color(192, 192, 192));
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/MOI/Desktop/PROJET_GESTION_SALLES_AFPA/layout_set_logo.jpeg"));
		lblNewLabel_2.setBounds(27, 11, 95, 62);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnLocalisation = new JButton("Afpa Politzer");
		btnLocalisation.setBounds(339, 29, 117, 29);
		getContentPane().add(btnLocalisation);
		
		JLabel lblBienvenu = new JLabel("Bienvenu admin");
		lblBienvenu.setBounds(727, 34, 110, 16);
		getContentPane().add(lblBienvenu);

	}
}