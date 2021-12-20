package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;




//Page coeur de notre app
public class ReserverSalle extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panelGeneralResa;
	private JTextField textFieldDispo;
	private JTextField textFieldPrise;
	private JLabel labelConfirmation;
	//private JButton btn1M, btn1A, btn2M, btn2A, btn3M, btn3A, btn4M, btn4A, btn5M, btn5A;
	//ou private ArrayList <JButton> listeBtn= new ArrayList<>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReserverSalle frame = new ReserverSalle();
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

	public  ReserverSalle() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setForeground(Color.BLACK);
		setBackground(new Color(50, 205, 50));
		setVisible(true);
		setBounds(10, 10, 1000, 1000);
		//setBounds(int x, int y, int width, int height)
	
		
		//PANEL GENERAL
		JPanel panelGeneralResa = new JPanel();
		setBounds(10, 10, 950, 950);
		panelGeneralResa.setBackground(new Color(211, 211, 211));
		panelGeneralResa.setLayout(null);

		
		//MES ELEMENST/COMPOSANTS
		SpinnerModel model = new SpinnerNumberModel
				(1, // valeur initiale
				1, // valeur minimum
				5, // valeur maximum
				1 // pas
		);

		JSpinner spinner = new JSpinner(model);
		spinner.setBounds(843, 98, 60, 26);
		getContentPane().add(spinner);
		

		JButton btnLocalisation = new JButton("Afpa Politzer");
		btnLocalisation.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnLocalisation.setBounds(348, 31, 110, 26);
		getContentPane().add(btnLocalisation);

		JLabel lblBienvenu = new JLabel("Bienvenu admin");
		lblBienvenu.setBounds(727, 34, 110, 16);
		getContentPane().add(lblBienvenu);

		JLabel lblNewLabel = new JLabel("Réservation des salles");
		lblNewLabel.setBounds(322, 89, 295, 40);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel disponible = new JLabel("disponible");
		disponible.setBounds(0, 172, 80, 25);
		getContentPane().add(disponible);
		disponible.setBackground(new Color(245, 245, 245));
		disponible.setForeground(new Color(0, 0, 0));
		disponible.setFont(new Font("Tahoma", Font.ITALIC, 12));
		disponible.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel prise = new JLabel("prise");
		prise.setBounds(6, 231, 80, 25);
		getContentPane().add(prise);
		prise.setBackground(new Color(0, 128, 128));
		prise.setForeground(new Color(0, 0, 0));
		prise.setHorizontalAlignment(SwingConstants.CENTER);
		prise.setFont(new Font("Tahoma", Font.ITALIC, 12));
		
		//calendrier
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(152, 89, 133, 26);
		getContentPane().add(dateChooser);
		dateChooser.getCalendarButton().setBounds(67, 0, 28, 26);
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setLayout(null);

		JLabel lblDate = new JLabel("choisir date");
		lblDate.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblDate.setBounds(45, 89, 95, 25);
		getContentPane().add(lblDate);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		

		JLabel lblEtage = new JLabel("Etage");
		lblEtage.setBounds(778, 101, 53, 21);
		getContentPane().add(lblEtage);

		JButton btn5M = new JButton("btn5M");
		btn5M.addActionListener(this);
		btn5M.setBounds(307, 414, 190, 29);
		getContentPane().add(btn5M);

		JButton btn5A = new JButton("btn5A");
		btn5A.addActionListener(this);
		btn5A.setBounds(509, 414, 221, 29);
		getContentPane().add(btn5A);

		JButton btn4M = new JButton("btn4M");
		btn4M.addActionListener(this);
		btn4M.setBounds(307, 370, 190, 29);
		getContentPane().add(btn4M);

		JButton btn3M = new JButton("btn3M");
		btn3M.addActionListener(this);
		btn3M.setBounds(307, 329, 188, 29);
		getContentPane().add(btn3M);

		JButton btn2M = new JButton("btn2M");
		btn2M.addActionListener(this);
		btn2M.setBounds(307, 282, 188, 29);
		getContentPane().add(btn2M);


		JButton btn1M = new JButton("btn1M");
		btn1M.addActionListener(this);
		btn1M.setBounds(307, 230, 190, 29);
		getContentPane().add(btn1M);

		JButton btn4A = new JButton("btn4A");
		btn4A.addActionListener(this);
		btn4A.setBounds(517, 370, 213, 29);
		getContentPane().add(btn4A);

		JButton btn3A = new JButton("btn3A");
		btn3A.addActionListener(this);
		btn3A.setBounds(517, 329, 221, 29);
		getContentPane().add(btn3A);

		JButton btn2A = new JButton("btn2A");
		btn2A.addActionListener(this);
		btn2A.setBounds(509, 282, 221, 29);
		getContentPane().add(btn2A);

		JButton btn1A = new JButton("btn1A");
		btn1A.addActionListener(this);
		btn1A.setBounds(509, 230, 221, 29);
		getContentPane().add(btn1A);

		JTextField textFieldDispo = new JTextField();
		textFieldDispo.setBounds(85, 173, 95, 25);
		getContentPane().add(textFieldDispo);
		textFieldDispo.setColumns(10);

		JTextField textFieldPrise = new JTextField();
		textFieldPrise.setBounds(86, 232, 95, 25);
		getContentPane().add(textFieldPrise);
		textFieldPrise.setBackground(new Color(51, 153, 51));
		textFieldPrise.setColumns(10);

		JLabel labelConfirmation = new JLabel();
		labelConfirmation.setBounds(224, 585, 650, 76);
		getContentPane().add(labelConfirmation);

		JLabel lblSalle1 = new JLabel("Salle 1");
		lblSalle1.setBackground(new Color(51, 153, 51));
		lblSalle1.setBounds(204, 229, 61, 28);
		getContentPane().add(lblSalle1);
		lblSalle1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle2 = new JLabel("Salle 2");
		lblSalle2.setBackground(new Color(51, 153, 51));
		lblSalle2.setBounds(204, 281, 61, 28);
		getContentPane().add(lblSalle2);
		lblSalle2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle3 = new JLabel("Salle 3");
		lblSalle3.setBackground(new Color(51, 153, 51));
		lblSalle3.setBounds(204, 329, 61, 28);
		getContentPane().add(lblSalle3);
		lblSalle3.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle4 = new JLabel("Salle 4");
		lblSalle4.setBackground(new Color(51, 153, 51));
		lblSalle4.setBounds(204, 369, 61, 28);
		getContentPane().add(lblSalle4);
		lblSalle4.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle5 = new JLabel("Salle 5");
		lblSalle5.setBackground(new Color(51, 153, 51));
		lblSalle5.setBounds(204, 413, 61, 28);
		getContentPane().add(lblSalle5);
		lblSalle5.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblhoraires = new JLabel(
				"     9          10          11          12          13          14          15          16          17     ");
		lblhoraires.setBackground(new Color(51, 153, 0));
		lblhoraires.setBounds(256, 176, 496, 16);
		getContentPane().add(lblhoraires);

		JLabel logo_afpa = new JLabel("afpa politzer ");
		logo_afpa.setBounds(35, 11, 218, 62);
		getContentPane().add(logo_afpa);
		logo_afpa.setIcon(new ImageIcon(ReserverSalle.class.getResource("/Images/logo_afpa.jpeg")));
		
		//MES EVENEMENTS
		
		
		//VALIDER RESA
		JButton ValiderResa = new JButton("Valider");
		
		ValiderResa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//((JButton)event.getSource()).setBackground(Color.YELLOW);
				
				//recup etage
				spinner.getValue();
				System.out.println(spinner.getValue());
				// recup date
				java.util.Date dateFromDateChooser = dateChooser.getDate();
				String dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser);
				System.out.println(dateString);
				
				//recup salle (bouton cliqué)
				
						
						//System.out.println(((JButton)event.getSource()).getText());
		
			

				// afficher confirmation in labelConfirmation
				labelConfirmation.setText("réservation : étage n° " + spinner.getValue() + " en date du :  " + dateString
						+ " confirmée pour la Salle n° " + ((JButton)event.getSource()).getText());

			}
		});
		
		ValiderResa.setBounds(419, 468, 150, 46);
		getContentPane().add(ValiderResa);
		
		
		//AFFICHER SALLES DISPO (BOOL = TRUE in Salle ou SalleDao)
		JButton SalleDispo = new JButton("Afficher salles disponibles");
		SalleDispo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//List<Salle> afficher = SalleDao.afficherSallesDispo(); 
			}
		});
		
		SalleDispo.setBounds(6, 596, 205, 29);
		getContentPane().add(SalleDispo);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

				//Color vert = new Color(51, 153, 51);
				((JButton)event.getSource()).setBackground(Color.YELLOW);
				
			
		
		//System.out.println("bouton cliqué");
		
		if( ((JButton)event.getSource()).getText().equals("btn1M")) {
			System.out.println(" Salle1, matin ");
			
			
		}
			else if ( ((JButton)event.getSource()).getText().equals("btn1A")) {
				System.out.println(" Salle1, après-midi ");
				
				
			}	
				else if ( ((JButton)event.getSource()).getText().equals("btn2M")) {
					System.out.println(" Salle 2, matin ");
					
				}
				else if ( ((JButton)event.getSource()).getText().equals("btn2A")) {
					System.out.println(" Salle 2, après-midi ");
				}
				else if ( ((JButton)event.getSource()).getText().equals("btn3M")) {
					System.out.println(" Salle 3, matin ");
				}
				else if ( ((JButton)event.getSource()).getText().equals("btn3A")) {
					System.out.println(" Salle 3, après-midi ");
				}
				else if ( ((JButton)event.getSource()).getText().equals("btn4M")) {
					System.out.println(" Salle 4, matin ");
				}
				else if ( ((JButton)event.getSource()).getText().equals("btn4A")) {
					System.out.println(" Salle 4, après-midi ");
				}
				else if ( ((JButton)event.getSource()).getText().equals("btn5M")) {
					System.out.println(" Salle 5, matin ");
				}
				else if( ((JButton)event.getSource()).getText().equals("btn5A")) {
					System.out.println(" Salle 5, après-midi ");
				};	
		
		}


	}


