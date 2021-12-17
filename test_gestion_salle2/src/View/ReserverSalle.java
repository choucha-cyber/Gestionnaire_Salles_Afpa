package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.Admin;
import Model.Salle;
import Test.TestCalendar;

import javax.swing.ImageIcon;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.RoundingMode;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import Controller.AdminDao;
import Controller.SalleDao;

import javax.swing.JTextPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;


public class ReserverSalle extends JFrame {
	

		private JPanel contentPane;
		private JTable table;
		private JTextField textFieldDispo;
		private JTextField textFieldPrise;
		private JButton btn1M, btn1A, btn2M, btn2A, btn3M, btn3A, btn4M, btn4A, btn5M, btn5A; //ou faire un arraylist
		private JLabel label;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ReserverSalle frame = new ReserverSalle(null);
						frame.setVisible(true);
		
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	

	/**
	 * Create the panel.
	 * @param currentAdmin 
	 */

	public ReserverSalle(Admin currentAdmin) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setVisible(true);
		setBounds(27, 61, 893, 528);

	
		
		
		SpinnerModel model = new SpinnerNumberModel(9.9, 1, 15, 0.1);     
		JSpinner spinner = new JSpinner(model);
		
		JButton btnLocalisation = new JButton("Afpa Politzer");
		btnLocalisation.setBounds(193, 29, 117, 29);
		getContentPane().add(btnLocalisation);
		
		JLabel lblBienvenu = new JLabel("Bienvenu admin");
		lblBienvenu.setBounds(727, 34, 110, 16);
		getContentPane().add(lblBienvenu);
		
				JLabel lblNewLabel = new JLabel("Réservation des salles");
				lblNewLabel.setBounds(321, 34, 295, 40);
				getContentPane().add(lblNewLabel);
				lblNewLabel.setBackground(new Color(192, 192, 192));
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				
						JLabel disponible = new JLabel("disponible");
						disponible.setBounds(0, 172, 80, 25);
						getContentPane().add(disponible);
						disponible.setBackground(new Color(245, 245, 245));
						disponible.setForeground(new Color(0, 0, 0));
						disponible.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
						disponible.setHorizontalAlignment(SwingConstants.CENTER);
						
								JLabel prise = new JLabel("prise");
								prise.setBounds(6, 231, 80, 25);
								getContentPane().add(prise);
								prise.setBackground(new Color(0, 128, 128));
								prise.setForeground(new Color(0, 0, 0));
								prise.setHorizontalAlignment(SwingConstants.CENTER);
								prise.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
								//recup valeur
								JDateChooser dateChooser = new JDateChooser();
								dateChooser.setBounds(123, 88, 95, 26);
								getContentPane().add(dateChooser);
								dateChooser.getCalendarButton().setBounds(67, 0, 28, 26);
								dateChooser.getCalendarButton().addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
									}
								});
								dateChooser.setLayout(null);
								
								JLabel lblDate = new JLabel("choisir date");
								lblDate.setBounds(6, 86, 95, 25);
								getContentPane().add(lblDate);
								lblDate.setHorizontalAlignment(SwingConstants.CENTER);
								
								JSpinner spinner_1 = new JSpinner();
								spinner_1.setBounds(836, 121, 51, 26);
								getContentPane().add(spinner_1);
								//lblConfirmation.setText("Confirmation");
								
								JLabel lblEtage = new JLabel("Etage");
								lblEtage.setBounds(786, 125, 53, 21);
								getContentPane().add(lblEtage);
								
								JButton btn5M = new JButton("Salle 5, matin");
								btn5M.setBounds(305, 333, 190, 29);
								getContentPane().add(btn5M);
								
								JButton btn5A = new JButton("Salle 5, après-midi");
								btn5A.setBounds(515, 336, 221, 29);
								getContentPane().add(btn5A);
								
								JButton btn4M = new JButton("Salle 4, matin");
								btn4M.setBounds(307, 282, 190, 29);
								getContentPane().add(btn4M);
								
								JButton btn3M = new JButton("Salle 3, matin");
								btn3M.setBounds(310, 240, 188, 29);
								getContentPane().add(btn3M);
								
								JButton btn2M = new JButton("Salle 2, matin");
								btn2M.setBounds(309, 201, 188, 29);
								getContentPane().add(btn2M);
								
								JButton btn1M = new JButton("Salle 1, matin");
								btn1M.setBounds(310, 151, 190, 29);
								getContentPane().add(btn1M);
								
								JButton btn4A = new JButton("Salle 4, après-midi");
								btn4A.setBounds(517, 287, 213, 29);
								getContentPane().add(btn4A);
								
								JButton btn3A = new JButton("Salle 3, après-midi");
								btn3A.setBounds(515, 242, 221, 29);
								getContentPane().add(btn3A);
								
								JButton btn2A = new JButton("Salle 2, après-midi");
								btn2A.setBounds(517, 203, 221, 29);
								getContentPane().add(btn2A);
								
								JButton btn1A = new JButton("Salle 1, après-midi");
								btn1A.setBounds(516, 153, 221, 29);
								getContentPane().add(btn1A);
								
								textFieldDispo = new JTextField();
								textFieldDispo.setBounds(85, 173, 95, 25);
								getContentPane().add(textFieldDispo);
								textFieldDispo.setColumns(10);
								
								textFieldPrise = new JTextField();
								textFieldPrise.setBounds(86, 232, 95, 25);
								getContentPane().add(textFieldPrise);
								textFieldPrise.setBackground(Color.BLUE);
								textFieldPrise.setColumns(10);
								
								JLabel labelConfirmation = new JLabel();
								labelConfirmation.setText("confirm :");
								labelConfirmation.setBounds(223, 437, 503, 40);
								getContentPane().add(labelConfirmation);
								
								JLabel lblSalle1 = new JLabel("Salle 1");
								lblSalle1.setBounds(204, 152, 61, 28);
								getContentPane().add(lblSalle1);
								lblSalle1.setHorizontalAlignment(SwingConstants.CENTER);
								
								JLabel lblSalle2 = new JLabel("Salle 2");
								lblSalle2.setBounds(209, 196, 61, 28);
								getContentPane().add(lblSalle2);
								lblSalle2.setHorizontalAlignment(SwingConstants.CENTER);
								
								JLabel lblSalle3 = new JLabel("Salle 3");
								lblSalle3.setBounds(210, 237, 61, 28);
								getContentPane().add(lblSalle3);
								lblSalle3.setHorizontalAlignment(SwingConstants.CENTER);
								
								JLabel lblSalle4 = new JLabel("Salle 4");
								lblSalle4.setBounds(211, 278, 61, 28);
								getContentPane().add(lblSalle4);
								lblSalle4.setHorizontalAlignment(SwingConstants.CENTER);
								
								JLabel lblSalle5 = new JLabel("Salle 5");
								lblSalle5.setBounds(210, 328, 61, 28);
								getContentPane().add(lblSalle5);
								lblSalle5.setHorizontalAlignment(SwingConstants.CENTER);
								
								JLabel lblhoraires = new JLabel("     9          10          11          12          13          14          15          16          17     ");
								lblhoraires.setBounds(256, 116, 496, 16);
								getContentPane().add(lblhoraires);
								
								
								JLabel logo_afpa = new JLabel("afpa politzer ");
								logo_afpa.setBounds(0, 0, 95, 62);
								getContentPane().add(logo_afpa);
								logo_afpa.setIcon(new ImageIcon("/Users/MOI/Desktop/PROJET_GESTION_SALLES_AFPA/layout_set_logo.jpeg"));
								
								JButton ValiderResa = new JButton("Valider");
								ValiderResa.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										//String valEtage= (String)spinner_1.getValue();
										//String valSalle = (String)this.getValue();
										
									}
								});
								ValiderResa.setBounds(418, 391, 117, 29);
								getContentPane().add(ValiderResa);
								// code du bouton valider qui affiche la valeur du JSpinner dans le JlbConfirmation
								
					

							}


	public String disponible() {
		// TODO Auto-generated method stub
		return null;
	}


}