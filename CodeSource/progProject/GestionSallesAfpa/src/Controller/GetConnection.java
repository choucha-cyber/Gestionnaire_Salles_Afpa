package Controller;

import java.sql.Connection;
import java.sql.SQLException;

//import javax.swing.JOptionPane;

public class GetConnection {
	
	public static Connection getConnection() {
		 
		String url = "jdbc:mysql://localhost/";
		String dbName = "sallesafpa";
		//Windows
		String user="root";
		String pwd="";
		
		
		Connection connect = null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");

		     try {
		    	 connect = DriverManager.getConnection(url+dbName,user,pwd);
//		    	 JOptionPane.showMessageDialog(null, "Connexion � la base de donn�es r�ussie" );
				System.out.println("OK for connect");
				
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
//			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
		return connect;
		}

}
