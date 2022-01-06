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
import java.awt.Rectangle;






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
	private JTextField txtEmailLog;
	private JPasswordField txtPwdLog;
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
		setBackground(new Color(204, 255, 204));
		setResizable(false);
		setBounds(new Rectangle(5, 5, 900, 700));
		//Jamel ihm
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 120, 930, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 51));
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
		
		JButton cmdExit = new JButton("");
		cmdExit.setToolTipText("Se d\u00E9connecter");
		cmdExit.setHorizontalTextPosition(SwingConstants.CENTER);
		cmdExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cmdExit.setIcon(new ImageIcon(Authentification.class.getResource("/Images/exit.png")));
		cmdExit.setBounds(815, 8, 62, 66);
		panel.add(cmdExit);
		
		JPanel panelCreation = new JPanel();
		panelCreation.setBackground(new Color(153, 255, 51));
		panelCreation.setLayout(null);
		panelCreation.setBounds(16, 101, 427, 430);
		getContentPane().add(panelCreation);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setBounds(20, 81, 126, 31);
		panelCreation.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom");
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setBounds(20, 141, 126, 31);
		panelCreation.add(lblPrenom);
		
		JLabel lblEmailAccount = new JLabel("Email");
		lblEmailAccount.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmailAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailAccount.setBounds(20, 220, 115, 26);
		panelCreation.add(lblEmailAccount);
		
		JLabel lblPwd = new JLabel("Mot de passe");
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setBounds(30, 275, 126, 38);
		panelCreation.add(lblPwd);
		
		JLabel lblCreationCompte = new JLabel("CREER COMPTE ADMIN");
		lblCreationCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreationCompte.setFont(new Font("Arial", Font.BOLD, 15));
		lblCreationCompte.setBounds(119, 28, 206, 26);
		panelCreation.add(lblCreationCompte);
		
		nomValue = new JTextField();
		nomValue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nomValue.setColumns(10);
		nomValue.setBounds(171, 83, 217, 26);
		panelCreation.add(nomValue);
		
		prenomValue = new JTextField();
		prenomValue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		prenomValue.setColumns(10);
		prenomValue.setBounds(171, 143, 217, 26);
		panelCreation.add(prenomValue);
		
		emailValue = new JTextField();
		emailValue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emailValue.setColumns(10);
		emailValue.setBounds(171, 220, 217, 26);
		panelCreation.add(emailValue);
		
		JButton cmdCreateAccount = new JButton("Cr\u00E9er mon compte");
		cmdCreateAccount.setToolTipText("Cr\u00E9er un compte");
		cmdCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AdminDao.creationCompte(Admin admin);
				
				//JOptionPane.showMessageDialog(null, "Inscription OK");
				String nom_saisie = nomValue.getText();
				String prenom_saisie = prenomValue.getText();
				String email_saisie = emailValue.getText();
				String mdp_saisie = String.valueOf(txtPwdLog.getPassword());
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
		cmdCreateAccount.setFont(new Font("Arial", Font.BOLD, 13));
		cmdCreateAccount.setBackground(Color.GREEN);
		cmdCreateAccount.setBounds(171, 356, 223, 38);
		panelCreation.add(cmdCreateAccount);
		
		mdpValue = new JPasswordField();
		mdpValue.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mdpValue.setBounds(171, 282, 217, 31);
		panelCreation.add(mdpValue);
		
		JPanel panelConnexion = new JPanel();
		panelConnexion.setLayout(null);
		panelConnexion.setBackground(new Color(153, 255, 51));
		panelConnexion.setBounds(469, 101, 427, 430);
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
		
		txtEmailLog = new JTextField();
		txtEmailLog.setColumns(10);
		txtEmailLog.setBounds(197, 133, 130, 26);
		panelConnexion.add(txtEmailLog);
		
		txtPwdLog = new JPasswordField();
		txtPwdLog.setBounds(197, 184, 130, 26);
		panelConnexion.add(txtPwdLog);
		
		JLabel lblNetInfo = new JLabel("@IP");
		lblNetInfo.setForeground(Color.BLACK);
		lblNetInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNetInfo.setBackground(Color.BLACK);
		lblNetInfo.setBounds(48, 330, 332, 17);
		panelConnexion.add(lblNetInfo);
		
		JTextField txtNetInfo = new JTextField();
		txtNetInfo.setVisible(false);
		txtNetInfo.setText("@IP");
		txtNetInfo.setForeground(Color.WHITE);
		txtNetInfo.setColumns(10);
		txtNetInfo.setBackground(Color.BLACK);
		txtNetInfo.setBounds(10, 358, 407, 26);
		panelConnexion.add(txtNetInfo);
		
		JButton cmdConnex = new JButton("Connexion");
		cmdConnex.setToolTipText("Se connecter");
		cmdConnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Jamel
				
				if(txtEmailLog.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Veuillez saisir une adresse Mail","OUPS ! Mail non valide",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtPwdLog.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Veuillez saisir un mot de passe","OUPS ! Mot de passe non valide",JOptionPane.ERROR_MESSAGE);
					return;
				}
				//Jamel
//				GetConnection.getConnection();
				
				AdminDao agent = new AdminDao();
				
				if(agent.login(txtEmailLog.getText(),txtPwdLog.getText())) {
					JOptionPane.showMessageDialog(null, "Authentification","Connexion authentifiée",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Veuillez saisir un mot de passe ou une adresse mail valides !","OUPS ! Mot de passe ou adresse mail invalides",JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				GetConnection.getConnection();
				
				
				  String nomHote ="" ;
			      String adresseIPLocale ="";
			      try{
			           InetAddress inetadr = InetAddress.getLocalHost();
			           //nom de machine
			           nomHote = inetadr.getHostName();
			           System.out.println("Nom de la machine :  "+nomHote );
			           //adresse ip sur le rÃ©seau
			           adresseIPLocale = inetadr.getHostAddress();
			           System.out.println("Adresse IP locale :  "+adresseIPLocale );
			           
			           
			   
			        } catch (UnknownHostException e1) {
			               e1.printStackTrace();
			        }
				
				lblNetInfo.setText("Nom de la machine = "+nomHote + "->" + "Adresse IP locale = "+adresseIPLocale  );
				txtNetInfo.setText("Nom de la machine = "+nomHote + "->" + "Adresse IP locale = "+adresseIPLocale  );
			
			}

		

			
			
			
			
			
			
		});
		cmdConnex.setFont(new Font("Arial", Font.BOLD, 13));
		cmdConnex.setBackground(Color.GREEN);
		cmdConnex.setBounds(199, 247, 139, 33);
		panelConnexion.add(cmdConnex);
		
		JLabel lblInfoConnection = new JLabel("Informations de connexion");
		lblInfoConnection.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoConnection.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblInfoConnection.setBounds(46, 290, 168, 28);
		panelConnexion.add(lblInfoConnection);
		
		


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


