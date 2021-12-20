package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Accueil extends JFrame implements ActionListener{
	
	
		
		private JPanel contentPane;
		private JTable table;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Accueil frame = new Accueil();
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
		public Accueil() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 1000, 1000);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panelNav = new JPanel();
			panelNav.setBackground(Color.WHITE);
			panelNav.setBounds(19, 0, 948, 91);
			contentPane.add(panelNav);
			panelNav.setLayout(null);
			
			JLabel logo_afpa = new JLabel("Afpa Politzer");
			logo_afpa.setIcon(new ImageIcon(Accueil.class.getResource("/Images/logo_afpa.jpeg")));
			logo_afpa.setBounds(24, 0, 212, 85);
			panelNav.add(logo_afpa);
			
			JButton btnNewButton = new JButton("changer centre");
			btnNewButton.setBounds(582, 26, 117, 29);
			panelNav.add(btnNewButton);
			
			JPanel panelGeneral = new JPanel();
			panelGeneral.setBackground(new Color(102, 204, 51));
			panelGeneral.setBounds(19, 91, 948, 584);
			contentPane.add(panelGeneral);
			panelGeneral.setLayout(null);
			
			
			//ACTION LISTENER JButton RESERVATION --> renvoi vers la page 'ReservationSalle'
			JButton reservation = new JButton("Réservation salles");
			reservation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						
						ReserverSalle reserverSalle= new ReserverSalle();
						reservation.setVisible(true);
						
					}
					
			});
			reservation.setBackground(new Color(51, 51, 0));
			reservation.setBounds(147, 198, 188, 75);
			panelGeneral.add(reservation);
			
			
			//ACTION LISTENER JButton AUTHENTIFICATION --> renvoi vers la page 'Authentification'
			JButton authentif = new JButton("Authentification");
			authentif.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Authentification authentification = new Authentification();
					authentification.setVisible(true);
				}
			});
			authentif.setBackground(new Color(51, 51, 0));
			authentif.setBounds(611, 198, 188, 75);
			panelGeneral.add(authentif);
			
			JLabel bienvenu = new JLabel("Bienvenu dans votre centre Afpa  Politzer");
			bienvenu.setFont(new Font("Lucida Grande", Font.BOLD, 18));
			bienvenu.setHorizontalAlignment(SwingConstants.CENTER);
			bienvenu.setBounds(230, 31, 462, 75);
			panelGeneral.add(bienvenu);
			
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Accueil.this.setVisible(false);
			
			// l'écran accueil disparait a l'ouverture d'un autre (via  les JButton)
			//contentPane.setVisible(false);
			
			
		}
}


