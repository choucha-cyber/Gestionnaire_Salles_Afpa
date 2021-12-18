package View;

import Model.Identification;
import java.awt.EventQueue;

import javax.swing.JPanel;
import Controller.IdentificationDao;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Rectangle;

public class Inscription extends JFrame {

	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtEmail;
	private JPasswordField txtMotDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription frame = new Inscription();
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
	public Inscription() {
		setBounds(new Rectangle(0, 0, 300, 500));
		getContentPane().setBounds(new Rectangle(0, 0, 300, 500));
		setBackground(new Color(50, 205, 50));
		setVisible(true);
		setBounds(27, 61, 473, 482);
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 329, 487);
		panel.setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel panel_2= new JPanel();
		panel_2.setBounds(0, 0, 462, 487);
		panel_2.setBackground(new Color(50, 205, 50));
		//contentPane.add(panel_2);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cr\u00E9ation de compte");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(52, 21, 360, 44);
		panel_2.add(lblNewLabel);
		
		JLabel nomLabel = new JLabel("Nom");
		nomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomLabel.setBounds(20, 67, 160, 44);
		panel_2.add(nomLabel);
		
		JLabel prenomLabel = new JLabel("Pr\u00E9nom");
		prenomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prenomLabel.setBounds(30, 122, 160, 44);
		panel_2.add(prenomLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(56, 189, 98, 44);
		panel_2.add(emailLabel);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotDePasse.setBounds(31, 244, 160, 44);
		panel_2.add(lblMotDePasse);
		
		txtNom = new JTextField();
		txtNom.setBounds(171, 76, 236, 26);
		panel_2.add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(171, 131, 236, 26);
		panel_2.add(txtPrenom);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(176, 189, 236, 26);
		panel_2.add(txtEmail);
		
		JButton cmdCreationCompte = new JButton("Envoyer");
		cmdCreationCompte.setFont(new Font("Arial", Font.BOLD, 16));
		cmdCreationCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, "Inscription OK");admin
				String nom_saisie = txtNom.getText();
				String prenom_saisie = txtPrenom.getText();
				String email_saisie = txtEmail.getText();
				String pwd_saisie = String.valueOf(txtMotDePasse.getPassword());
				Identification nouvelIndividu = new Identification(nom_saisie, prenom_saisie, email_saisie, pwd_saisie, "admin");
				
				//Appel la classe IdentificationDao afin de pouvoir utiliser la methode inscription
				
				if(!(Pattern.matches("^[a-zA-Z0-9_.-]+[@][a-zA-Z0-9-]+[.]+[a-zA-Z0-9]+$", email_saisie) )) {
					JOptionPane.showMessageDialog(null, "Mail pas valide","Error",JOptionPane.ERROR_MESSAGE);
				}else {					
					IdentificationDao qui = new IdentificationDao();
					
					if(qui.mailExist(email_saisie)) {
						qui.inscription(nouvelIndividu);						
					}else {
						JOptionPane.showMessageDialog(null, "Ce mail existe deja !","Error",JOptionPane.ERROR_MESSAGE);
					}
				}	
			}
		});
		cmdCreationCompte.setBounds(135, 356, 292, 52);
		panel_2.add(cmdCreationCompte);
		
		txtMotDePasse = new JPasswordField();
		txtMotDePasse.setBounds(171, 244, 241, 31);
		panel_2.add(txtMotDePasse);
		
//		panel.add(panel_1);
//		panel.add(panel_2);
		
	}
}

