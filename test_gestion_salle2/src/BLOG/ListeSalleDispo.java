package BLOG;


import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

public class ListeSalleDispo extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListeSalleDispo() {
		setLayout(null);
		setVisible(true);
		setBounds(27, 61, 573, 372);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Bienvenue dans le système de gestion de salles");
		lblNewLabel.setSize(573, 150);
		add(lblNewLabel);

	}

}