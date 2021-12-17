package View;


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
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Salles disponibles");
		lblNewLabel.setLocation(0, 0);
		lblNewLabel.setSize(573, 372);
		add(lblNewLabel);

	}

}