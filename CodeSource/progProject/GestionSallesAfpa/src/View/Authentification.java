package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.sun.jdi.event.EventQueue;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Authentification extends JFrame {
	
	// Launch the application.
	
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
		
		
	private JTextField txtMail;
	private JPasswordField passwordField;
	public Authentification() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
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
		
		JButton cmdConnex = new JButton("Connexion");
		cmdConnex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmdConnex.setBounds(166, 200, 169, 23);
		panel.add(cmdConnex);
	}

}