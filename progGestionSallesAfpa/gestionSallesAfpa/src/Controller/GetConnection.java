package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import Application.GlobalApp;

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
				System.out.println("OK for connect");
				 JOptionPane.showMessageDialog(null, "Connexion à la base de données réussie" );
				
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
		return connect;
		}

}

