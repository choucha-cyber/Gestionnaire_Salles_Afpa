package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

import Controller.SalleDao;
import Model.Salle;
import java.awt.Rectangle;




//Page coeur de notre app
public class ReserverSalle extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panelGeneralResa;
	private JTextField textFieldDispo;
	private JTextField textFieldPrise;
	private JLabel lblConfirmation;
//	private JLabel lblSallesResa;
	private JButton btn1M, btn1A, btn2M, btn2A, btn3M, btn3A, btn4M, btn4A, btn5M, btn5A;
	private JTextField txtRetrieveRoomNumber;
	private JTextField txtDisplayRoomNumber;
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
		setBounds(new Rectangle(0, 0, 950, 750));
		getContentPane().setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setForeground(Color.BLACK);
		setBackground(new Color(50, 205, 50));
		setVisible(true);
		setBounds(10, 10, 950, 750);
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
		

		JButton cmdLocalisation = new JButton("Afpa Politzer");
		cmdLocalisation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cmdLocalisation.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		cmdLocalisation.setBounds(348, 31, 110, 26);
		getContentPane().add(cmdLocalisation);

		JLabel lblBienvenu = new JLabel("Bienvenu admin");
		lblBienvenu.setBounds(727, 34, 110, 16);
		getContentPane().add(lblBienvenu);

		JLabel lblNewLabel = new JLabel("R\u00E9servation des salles");
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
		dateChooser.getCalendarButton().setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		dateChooser.setBounds(141, 71, 124, 53);
		getContentPane().add(dateChooser);
		dateChooser.getCalendarButton().setBounds(67, 0, 50, 50);
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
		btn5M.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn5M.addActionListener(this);
		btn5M.setBounds(304, 356, 190, 29);
		btn5M.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn5M);

		JButton btn5A = new JButton("btn5A");
		btn5A.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn5A.addActionListener(this);
		btn5A.setBounds(506, 356, 221, 29);
		btn5A.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn5A);

		JButton btn4M = new JButton("btn4M");
		btn4M.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn4M.addActionListener(this);
		btn4M.setBounds(304, 312, 190, 29);
		btn4M.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn4M);

		JButton btn3M = new JButton("btn3M");
		btn3M.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn3M.addActionListener(this);
		btn3M.setBounds(304, 271, 188, 29);
		btn3M.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn3M);

		JButton btn2M = new JButton("btn2M");
		btn2M.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn2M.addActionListener(this);
		btn2M.setBounds(304, 224, 188, 29);
		btn2M.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn2M);


		JButton btn1M = new JButton("btn1M");
		btn1M.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn1M.addActionListener(this);
		btn1M.setBounds(304, 172, 190, 29);
		btn1M.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn1M);

		JButton btn4A = new JButton("btn4A");
		btn4A.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn4A.addActionListener(this);
		btn4A.setBounds(513, 312, 213, 29);
		btn4A.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn4A);

		JButton btn3A = new JButton("btn3A");
		btn3A.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn3A.addActionListener(this);
		btn3A.setBounds(511, 271, 221, 29);
		btn3A.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn3A);

		JButton btn2A = new JButton("btn2A");
		btn2A.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn2A.addActionListener(this);
		btn2A.setBounds(506, 224, 221, 29);
		btn2A.setBackground(new Color(0, 153, 0));
		getContentPane().add(btn2A);

		JButton btn1A = new JButton("btn1A");
		btn1A.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn1A.addActionListener(this);
		btn1A.setBounds(506, 172, 221, 29);
		btn1A.setBackground(new Color(0, 153, 0));
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

		JLabel lblConfirmation = new JLabel();
		lblConfirmation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConfirmation.setBounds(224, 530, 720, 76);
		getContentPane().add(lblConfirmation);

		JLabel lblSalle1 = new JLabel("Salle 1");
		lblSalle1.setBackground(new Color(51, 153, 51));
		lblSalle1.setBounds(201, 172, 61, 28);
		getContentPane().add(lblSalle1);
		lblSalle1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle2 = new JLabel("Salle 2");
		lblSalle2.setBackground(new Color(51, 153, 51));
		lblSalle2.setBounds(201, 224, 61, 28);
		getContentPane().add(lblSalle2);
		lblSalle2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle3 = new JLabel("Salle 3");
		lblSalle3.setBackground(new Color(51, 153, 51));
		lblSalle3.setBounds(201, 272, 61, 28);
		getContentPane().add(lblSalle3);
		lblSalle3.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle4 = new JLabel("Salle 4");
		lblSalle4.setBackground(new Color(51, 153, 51));
		lblSalle4.setBounds(201, 312, 61, 28);
		getContentPane().add(lblSalle4);
		lblSalle4.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSalle5 = new JLabel("Salle 5");
		lblSalle5.setBackground(new Color(51, 153, 51));
		lblSalle5.setBounds(201, 356, 61, 28);
		getContentPane().add(lblSalle5);
		lblSalle5.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblhoraires = new JLabel(
				"     9          10          11          12          13          14          15          16          17     ");
		lblhoraires.setBackground(new Color(51, 153, 0));
		lblhoraires.setBounds(256, 140, 496, 16);
		getContentPane().add(lblhoraires);

		JLabel logo_afpa = new JLabel("afpa politzer ");
		logo_afpa.setBounds(35, 11, 218, 62);
		getContentPane().add(logo_afpa);
		logo_afpa.setIcon(new ImageIcon(ReserverSalle.class.getResource("/Images/logo_afpa.jpeg")));
		
		//MES EVENEMENTS
	
		JButton cmdValiderReservation = new JButton("Valider");
		cmdValiderReservation.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		cmdValiderReservation.addActionListener(new ActionListener() {
			//Jamel 2021_12_21 11:00 Ajout r√©servation de salle
				public void actionPerformed(ActionEvent event) {
					//((JButton)event.getSource()).setBackground(Color.YELLOW);
				
					//recup etage
					//Jamel 2021_12_23 18:20
					int intRetFloor =   (int) spinner.getValue();
					System.out.println(intRetFloor);
					// recup date
					java.util.Date dateFromDateChooser = dateChooser.getDate();
					String dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser);
					System.out.println(dateString);
					
					//Jamel 2021_12_23 21:30  Si la salle est r√©serv√©e sa disponibilit√© <==> false
//					Salle room = new Salle(intRetFloor,retrieveRoomNumber(event),false);
					Salle room = new Salle(intRetFloor, Integer.parseInt(txtRetrieveRoomNumber.getText()));
					//this.txtRetrieveRoomNumber.getText();
					
					JOptionPane.showMessageDialog(null, "Ètage: " + intRetFloor + "num salle:  " + Integer.parseInt(txtRetrieveRoomNumber.getText()));
				
					
				
					//Jamel 2021_12_21 11:30 Ajout de la fonctionnalit√© de sauvegarde de la r√©servation dans la BDD
					SalleDao bookRoom = new SalleDao();
					bookRoom.addReservation(room);
//					bookRoom.reserver(room);
					
					
				//System.out.println(((JButton)event.getSource()).getText());
					// afficher confirmation in lblConfirmation
//					lblConfirmation.setText("rÈservation : Ètage N∞ " + spinner.getValue() + " en date du :  " + dateString
//							+ " confirmÈe pour la Salle N∞ " + ((JButton)event.getSource()).getText());
					//Jamel
					lblConfirmation.setText("RÈservation : Ètage N∞ " + spinner.getValue() + " en date du :  " + dateString
							+ " confirmÈe pour la Salle N∞ " + Integer.parseInt(txtRetrieveRoomNumber.getText()));

				}
			});;
		
		cmdValiderReservation.setBounds(417, 404, 150, 46);
		getContentPane().add(cmdValiderReservation);
		
		//Jamel
		//AFFICHER SALLES DISPO (BOOL = TRUE in Salle ou SalleDao)
		JButton cmdAvailableRoom = new JButton("Afficher salles disponibles");
		cmdAvailableRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				SalleDao.afficherSallesDispo();
//				SalleDao salleDao = new SalleDao();
				List<Salle> salle = SalleDao.afficherSallesDispo();
				System.out.println("LISTE DES SALLES");
//				for(int elem: myArray){
				for (Salle room : salle) {
//					System.out.println(room.getId() + " " +  room.getEtage() + " " + room.getNumSalle() + " " + room.getDisponible());
					System.out.println(room.getId() + " " +  room.getEtage() + " " + room.getNumSalle());
				}
				
				//Jamel
		JOptionPane.showMessageDialog(null,"afficherSallesDispo()", "Debug" ,1);
			}
		});
		
		cmdAvailableRoom.setBounds(0, 577, 205, 29);
		getContentPane().add(cmdAvailableRoom);
		
		JLabel lblNewLabel_1 = new JLabel("Salle(s) d\u00E9j\u00E0 r\u00E9serv\u00E9es");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(68, 476, 150, 53);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblSallesResa = new JLabel("");
		lblSallesResa.setBounds(307, 531, 213, 40);
		getContentPane().add(lblSallesResa);
		
		txtRetrieveRoomNumber = new JTextField();
		txtRetrieveRoomNumber.setVisible(false);
		txtRetrieveRoomNumber.setText("0");
		txtRetrieveRoomNumber.setForeground(Color.RED);
		txtRetrieveRoomNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtRetrieveRoomNumber.setBounds(230, 509, 86, 20);
		getContentPane().add(txtRetrieveRoomNumber);
		txtRetrieveRoomNumber.setColumns(10);
		
		txtDisplayRoomNumber = new JTextField();
		txtDisplayRoomNumber.setVisible(false);
		txtDisplayRoomNumber.setBackground(Color.YELLOW);
		txtDisplayRoomNumber.setText("0");
		txtDisplayRoomNumber.setForeground(Color.RED);
		txtDisplayRoomNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDisplayRoomNumber.setColumns(10);
		txtDisplayRoomNumber.setBounds(339, 511, 86, 20);
		getContentPane().add(txtDisplayRoomNumber);
		

	}
	//Jamel 2021_12_22_19:00
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

				//Color vert = new Color(51, 153, 51);
				((JButton)event.getSource()).setBackground(Color.RED);
				((JButton)event.getSource()).setForeground(Color.RED);
				
		
		//System.out.println("bouton cliqu√É¬©");
				//Jamel 2021_12_23_08:05
				if( ((JButton)event.getSource()).getText().equals("btn1M")) {
					System.out.println(" Salle 1, matin ");
					this.txtRetrieveRoomNumber.setText("1");
					//Jamel 2021_12_23_10
					String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
					int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
					System.out.println(intRoomNbrBooked);
					//Jamel 2021_12_23_12:05
					this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
					
				}
					else if ( ((JButton)event.getSource()).getText().equals("btn2M")) {
							System.out.println(" Salle 2, matin ");
							this.txtRetrieveRoomNumber.setText("2");
							//Jamel 2021_12_23_10
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
							
						}
					
						else if ( ((JButton)event.getSource()).getText().equals("btn3M")) {
							System.out.println(" Salle 3, matin ");
							this.txtRetrieveRoomNumber.setText("3");
							//Jamel 2021_12_23_10
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
							
						}
					
						else if ( ((JButton)event.getSource()).getText().equals("btn4M")) {
							System.out.println(" Salle 4, matin ");
							this.txtRetrieveRoomNumber.setText("4");
							//Jamel 2021_12_23_10:
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
						}
					
						else if ( ((JButton)event.getSource()).getText().equals("btn5M")) {
							System.out.println(" Salle 5, matin ");
							this.txtRetrieveRoomNumber.setText("5");
							//Jamel 2021_12_23_10
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
						}
						else if ( ((JButton)event.getSource()).getText().equals("btn1A")) {
						System.out.println(" Salle 1, apr√É¬®s-midi ");
						this.txtRetrieveRoomNumber.setText("1");
						//Jamel 2021_12_23_10
						String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
						int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
						System.out.println(intRoomNbrBooked);
						this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
						
						}	
						else if ( ((JButton)event.getSource()).getText().equals("btn2A")) {
							System.out.println(" Salle 2, apr√É¬®s-midi ");
							this.txtRetrieveRoomNumber.setText("2");
							//Jamel 2021_12_23_10
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
						}
							else if ( ((JButton)event.getSource()).getText().equals("btn3A")) {
							System.out.println(" Salle 3, apr√É¬®s-midi ");
							this.txtRetrieveRoomNumber.setText("3");
							//Jamel 2021_12_23_10
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
						}
							else if ( ((JButton)event.getSource()).getText().equals("btn4A")) {
							System.out.println(" Salle 4, apr√É¬®s-midi ");
							this.txtRetrieveRoomNumber.setText("4");
							//Jamel 2021_12_23_10
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
						}
							else if( ((JButton)event.getSource()).getText().equals("btn5A")) {
							System.out.println(" Salle 5, apr√É¬®s-midi ");
							this.txtRetrieveRoomNumber.setText("5");
							//Jamel 2021_12_23_10
							String strRetrieveRoomNbr = this.txtRetrieveRoomNumber.getText();
							int intRoomNbrBooked = Integer.parseInt(strRetrieveRoomNbr);
							System.out.println(intRoomNbrBooked);
							this.txtDisplayRoomNumber.setText(strRetrieveRoomNbr);
						};	
		}
	}//‚óÑ


