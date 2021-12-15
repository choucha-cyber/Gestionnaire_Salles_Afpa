package Test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JInternalFrame;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;

public class TestCalendar extends JFrame{
	public TestCalendar() {
		addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				
				
			}
		});
		
		JPanel zoneClient = (JPanel) this.getContentPane();
	      getContentPane().setLayout(null);
	      GridBagLayout gridBagLayout = new GridBagLayout();
	      gridBagLayout.columnWidths = new int[]{450, 0};
	      gridBagLayout.rowHeights = new int[]{34, 212, 0, 0};
	      gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
	      gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
	      getContentPane().setLayout(gridBagLayout);
	      
	      JLabel lblNewLabel = new JLabel("Afpa Politzer");
	      lblNewLabel.setIcon(new ImageIcon("/Users/MOI/Desktop/PROJET_GESTION_SALLES_AFPA/layout_set_logo.jpeg"));
	      lblNewLabel.setSize(50, 50);
	      GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	      gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
	      gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
	      gbc_lblNewLabel.gridx = 0;
	      gbc_lblNewLabel.gridy = 0;
	      getContentPane().add(lblNewLabel, gbc_lblNewLabel);
	      
	      JPanel panel = new JPanel();
	      panel.setLayout(null);
	      GridBagConstraints gbc_panel = new GridBagConstraints();
	      gbc_panel.insets = new Insets(0, 0, 5, 0);
	      gbc_panel.fill = GridBagConstraints.BOTH;
	      gbc_panel.gridx = 0;
	      gbc_panel.gridy = 1;
	      getContentPane().add(panel, gbc_panel);
	      
	      JLabel lblNewLabel_2 = new JLabel("Date");
	      lblNewLabel_2.setBounds(114, 71, 66, 26);
	      panel.add(lblNewLabel_2);
	      
	      JDateChooser dateChooser = new JDateChooser();
	      dateChooser.setBounds(192, 71, 95, 26);
	      panel.add(dateChooser);
	      
	     
		
		/*JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		}); */
		//getContentPane().add(btnNewButton);
	}
}
