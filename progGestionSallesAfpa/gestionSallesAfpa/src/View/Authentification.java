package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Controller.GetConnection;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Authentification extends JFrame {

	
	// Launch the application.;
	
//		public static void main(String[] args) {
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						Authentification frame = new Authentification();
//						frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}
//		
		
	private JTextField txtMail;
	private JPasswordField passwordField;
	private JTextField txtNetInfo;
	public Authentification() {
		setForeground(Color.BLACK);
		setBackground(new Color(50, 205, 50));
		setBounds(new Rectangle(0, 0, 700, 500));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(49, 94, 77, 14);
		panel.add(lblEmail);
		
		JLabel lblTitle = new JLabel("Connexion \u00E0 la base de donn\u00E9es");
		lblTitle.setBounds(28, 5, 378, 24);
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 24));
		panel.add(lblTitle);
		
		JLabel lblPwd = new JLabel("Mot de passe");
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPwd.setBounds(42, 140, 104, 14);
		panel.add(lblPwd);
		
		txtMail = new JTextField();
		txtMail.setBounds(156, 93, 179, 20);
		panel.add(txtMail);
		txtMail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 139, 179, 20);
		panel.add(passwordField);
		
		JLabel lblNetInfo = new JLabel("@IP");
		lblNetInfo.setBackground(new Color(0, 0, 0));
		lblNetInfo.setForeground(new Color(0, 0, 0));
		lblNetInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNetInfo.setBounds(51, 256, 402, 14);
		panel.add(lblNetInfo);
		
		txtNetInfo = new JTextField();
		txtNetInfo.setText("@IP");
		txtNetInfo.setForeground(Color.WHITE);
		txtNetInfo.setBackground(Color.BLACK);
		txtNetInfo.setBounds(49, 300, 533, 20);
		panel.add(txtNetInfo);
		txtNetInfo.setColumns(10);
		
		
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
		cmdConnex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmdConnex.setBounds(166, 200, 169, 23);
		panel.add(cmdConnex);
		
	
		
	
	}
}

