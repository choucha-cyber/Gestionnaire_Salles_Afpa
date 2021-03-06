package View;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.AdminDao;
import Model.Admin;
import Model.Statut;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CreationCompte extends JPanel {

	private JPanel contentPane;
	private JTextField nomValue;
	private JTextField prenomValue;
	private JTextField emailValue;
	private JPasswordField pwdValue;
	private JTextField email_login;
	private JPasswordField pwd_login;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public CreationCompte() {
		
		setLayout(null);
		setVisible(true);
		setBounds(27, 61, 799, 487);
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 329, 487);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(10, 0, 329, 487);
		//contentPane.add(panel_1);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel email = new JLabel("Email");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setBounds(10, 128, 63, 34);
		panel_1.add(email);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mot de passe");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 209, 104, 34);
		panel_1.add(lblNewLabel_1_1);
		
		email_login = new JTextField();
		email_login.setBounds(135, 132, 184, 27);
		panel_1.add(email_login);
		email_login.setColumns(10);
		
		pwd_login = new JPasswordField();
		pwd_login.setColumns(10);
		pwd_login.setBounds(135, 199, 184, 27);
		panel_1.add(pwd_login);
		
		JButton btnNewButton_1 = new JButton("Je me connecte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mail_saisie = email_login.getText();
				//String pwd_saisie = login_pwd.getText();
				String pwd_saisie = String.valueOf(pwd_login.getPassword());
				AdminDao adminDao = new AdminDao();
				
				adminDao.login(mail_saisie, pwd_saisie);
				
				
				if(adminDao.login(mail_saisie, pwd_saisie)) {
					
					JOptionPane.showMessageDialog(null, "connexion r??ussie");
					
					panel.removeAll();
						
					ReserverSalle ajoutArticle = new ReserverSalle(AdminDao.currentAdmin);
					panel.add(ajoutArticle);
					panel.repaint();
					panel.revalidate();
				}
				
			}
		});
		
		btnNewButton_1.setBounds(63, 315, 189, 64);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("me connecter");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 23, 244, 50);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2= new JPanel();
		panel_2.setBounds(337, 0, 462, 487);
		//contentPane.add(panel_2);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cr??er compte");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(52, 21, 360, 44);
		panel_2.add(lblNewLabel);
		
		JLabel nomLabel = new JLabel("Nom");
		nomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomLabel.setBounds(20, 67, 160, 44);
		panel_2.add(nomLabel);
		
		JLabel prenomLabel = new JLabel("Pr??nom");
		prenomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prenomLabel.setBounds(20, 134, 160, 44);
		panel_2.add(prenomLabel);
		
		JLabel statutLabel = new JLabel("Statut");
		prenomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prenomLabel.setBounds(20, 150, 150, 44);
		panel_2.add(prenomLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(20, 220, 160, 44);
		panel_2.add(emailLabel);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotDePasse.setBounds(30, 275, 160, 44);
		panel_2.add(lblMotDePasse);
		
		nomValue = new JTextField();
		nomValue.setBounds(171, 76, 236, 26);
		panel_2.add(nomValue);
		nomValue.setColumns(10);
		
		prenomValue = new JTextField();
		prenomValue.setColumns(10);
		prenomValue.setBounds(171, 143, 236, 26);
		panel_2.add(prenomValue);
		
		emailValue = new JTextField();
		emailValue.setColumns(10);
		emailValue.setBounds(171, 220, 236, 26);
		panel_2.add(emailValue);
		
		JButton btnNewButton = new JButton("Cr??er mon compte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(null, "Inscription OK");
				String nom_saisie = nomValue.getText();
				String prenom_saisie = prenomValue.getText();
				Statut statut_saisie = statutValue.getText();
				String email_saisie = emailValue.getText();
				String mdp_saisie = String.valueOf(pwd_login.getPassword());
				Admin nouvel = new Admin(nom_saisie, prenom_saisie, statut_saisie, email_saisie, mdp_saisie);
				
				//Appel la classe UserDao afin de pouvoir utiliser la methode inscription
				
				if(!(Pattern.matches("^[a-zA-Z0-9_.-]+[@][a-zA-Z0-9-]+[.]+[a-zA-Z0-9]+$", email_saisie) )) {
					JOptionPane.showMessageDialog(null, "Mail pas valide","Error",JOptionPane.ERROR_MESSAGE);
				}else {					
					AdminDao adminDao = new AdminDao();
					
					if(adminDao.mailExist(email_saisie)) {
						adminDao.creationCompte(nouvel);						
					}else {
						JOptionPane.showMessageDialog(null, "Ce mail existe deja !","Error",JOptionPane.ERROR_MESSAGE);
					}
				}	
			}
		});
		btnNewButton.setBounds(112, 362, 292, 52);
		panel_2.add(btnNewButton);
		
		pwdValue = new JPasswordField();
		pwdValue.setBounds(171, 282, 241, 31);
		panel_2.add(pwdValue);
		
		panel.add(panel_1);
		panel.add(panel_2);
		
	}
}