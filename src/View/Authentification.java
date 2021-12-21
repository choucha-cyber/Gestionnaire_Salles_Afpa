package View;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import javax.swing.JTextField;
import java.sql.Connection;
import java.util.regex.Pattern;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import Model.Admin;
import Controller.AdminDao;
import Controller.GetConnection;






//Page coeur de notre app
public class Authentification extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panelGeneralResa;
	private JTextField textFieldDispo;
	private JTextField textFieldPrise;
	private JLabel labelConfirmation;
	private JTextField nomValue;
	private JTextField prenomValue;
	private JTextField emailValue;
	private JPasswordField mdpValue;
	private JTextField email_login;
	private JPasswordField mdp_login;
	private JTextField textField_4;
	
	//private JButton btn1M, btn1A, btn2M, btn2A, btn3M, btn3A, btn4M, btn4A, btn5M, btn5A;
	//ou private ArrayList <JButton> listeBtn= new ArrayList<>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification frame = new Authentification();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the panel.
	 * 
	 */

	public  Authentification() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 1000, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 1112, 83);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel logo_afpa = new JLabel("Afpa Politzer");
		logo_afpa.setIcon(new ImageIcon(Authentification.class.getResource("/Images/logo_afpa.jpeg")));
		logo_afpa.setBounds(6, 6, 108, 71);
		panel.add(logo_afpa);
		
		JLabel lblNewLabel_3 = new JLabel("BIENVENU DANS VOTRE ESPACE ADMIN");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel_3.setBounds(265, 17, 401, 36);
		panel.add(lblNewLabel_3);
		
		JPanel panelCreation = new JPanel();
		panelCreation.setLayout(null);
		panelCreation.setBounds(16, 101, 445, 430);
		getContentPane().add(panelCreation);
		
		JLabel nomLabel = new JLabel("Nom");
		nomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nomLabel.setBounds(20, 81, 126, 31);
		panelCreation.add(nomLabel);
		
		JLabel prenomLabel = new JLabel("Prénom");
		prenomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prenomLabel.setBounds(20, 141, 126, 31);
		panelCreation.add(prenomLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(20, 220, 115, 26);
		panelCreation.add(emailLabel);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotDePasse.setBounds(30, 275, 126, 38);
		panelCreation.add(lblMotDePasse);
		
		JLabel lblCreationCompte = new JLabel("CREER COMPTE ADMIN");
		lblCreationCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreationCompte.setFont(new Font("Arial", Font.BOLD, 15));
		lblCreationCompte.setBounds(119, 28, 206, 26);
		panelCreation.add(lblCreationCompte);
		
		nomValue = new JTextField();
		nomValue.setColumns(10);
		nomValue.setBounds(171, 83, 217, 26);
		panelCreation.add(nomValue);
		
		prenomValue = new JTextField();
		prenomValue.setColumns(10);
		prenomValue.setBounds(171, 143, 217, 26);
		panelCreation.add(prenomValue);
		
		emailValue = new JTextField();
		emailValue.setColumns(10);
		emailValue.setBounds(171, 220, 217, 26);
		panelCreation.add(emailValue);
		
		JButton creerCompte = new JButton("Créer mon compte");
		creerCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminDao.creationCompte(Admin admin);
				
				//JOptionPane.showMessageDialog(null, "Inscription OK");
				String nom_saisie = nomValue.getText();
				String prenom_saisie = prenomValue.getText();
				String email_saisie = emailValue.getText();
				String mdp_saisie = String.valueOf(mdp_login.getPassword());
				Admin nouvel = new Admin(nom_saisie, prenom_saisie, email_saisie, mdp_saisie);
				
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
		creerCompte.setFont(new Font("Arial", Font.BOLD, 13));
		creerCompte.setBackground(new Color(46, 139, 87));
		creerCompte.setBounds(108, 355, 217, 38);
		panelCreation.add(creerCompte);
		
		mdpValue = new JPasswordField();
		mdpValue.setBounds(171, 282, 217, 31);
		panelCreation.add(mdpValue);
		
		JPanel panelConnexion = new JPanel();
		panelConnexion.setLayout(null);
		panelConnexion.setBackground(new Color(154, 205, 50));
		panelConnexion.setBounds(517, 101, 445, 430);
		getContentPane().add(panelConnexion);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(53, 135, 76, 20);
		panelConnexion.add(lblEmail);
		
		JLabel lblTitle = new JLabel("VOUS CONNECTER");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 15));
		lblTitle.setBounds(95, 27, 226, 28);
		panelConnexion.add(lblTitle);
		
		JLabel lblMdp = new JLabel("Mot de passe");
		lblMdp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMdp.setBounds(48, 188, 81, 17);
		panelConnexion.add(lblMdp);
		
		email_login = new JTextField();
		email_login.setColumns(10);
		email_login.setBounds(197, 133, 130, 26);
		panelConnexion.add(email_login);
		
		mdp_login = new JPasswordField();
		mdp_login.setBounds(197, 184, 130, 26);
		panelConnexion.add(mdp_login);
		
		JLabel lblNetInfo = new JLabel("@IP");
		lblNetInfo.setForeground(Color.BLACK);
		lblNetInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNetInfo.setBackground(Color.BLACK);
		lblNetInfo.setBounds(48, 330, 332, 17);
		panelConnexion.add(lblNetInfo);
		
		JTextField txtNetInfo = new JTextField();
		txtNetInfo.setText("@IP");
		txtNetInfo.setForeground(Color.WHITE);
		txtNetInfo.setColumns(10);
		txtNetInfo.setBackground(Color.BLACK);
		txtNetInfo.setBounds(53, 359, 327, 26);
		panelConnexion.add(txtNetInfo);
		
		JButton cmdConnex = new JButton("Connexion");
		cmdConnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GetConnection.getConnection();
				
				  String nomHote ="" ;
			      String adresseIPLocale ="";
			      try{
			           InetAddress inetadr = InetAddress.getLocalHost();
			           //nom de machine
			           nomHote = inetadr.getHostName();
			           System.out.println("Nom de la machine :  "+nomHote );
			           //adresse ip sur le réseau
			           adresseIPLocale = inetadr.getHostAddress();
			           System.out.println("Adresse IP locale :  "+adresseIPLocale );
			           
			           
			   
			        } catch (UnknownHostException e1) {
			               e1.printStackTrace();
			        }
				
				lblNetInfo.setText("Nom de la machine = "+nomHote + "►" + "Adresse IP locale = "+adresseIPLocale  );
				txtNetInfo.setText("Nom de la machine = "+nomHote + "►" + "Adresse IP locale = "+adresseIPLocale  );
			
			}
		});
		cmdConnex.setFont(new Font("Arial", Font.BOLD, 13));
		cmdConnex.setBackground(new Color(46, 139, 87));
		cmdConnex.setBounds(199, 247, 163, 33);
		panelConnexion.add(cmdConnex);
		
		JLabel lblNewLabel = new JLabel("info connexion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNewLabel.setBounds(46, 290, 145, 28);
		panelConnexion.add(lblNewLabel);
		
		


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


