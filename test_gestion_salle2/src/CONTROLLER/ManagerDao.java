
package CONTROLLER;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import MODEL.Manager;

public class ManagerDao {
	// Appel de la connection
	Connection connect = GetConnection.getConnection();
	public static Manager currentManager;

	public void inscription(Manager manager) {

		try {
			PreparedStatement sql = connect
					.prepareStatement("INSERT INTO manager (nom, prenom,email,pwd)" + " VALUES (?,?,?,PASSWORD(?))	");
			sql.setString(1, manager.getNom());
			sql.setString(2, manager.getPrenom());
			sql.setString(3, manager.getEmail());
			sql.setString(4, manager.getPwd());

			sql.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean mailExist(String mail) {
		Boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM manager WHERE email = ?");

			sql.setString(1, mail);

			ResultSet rs = sql.executeQuery();

			if (!rs.next()) {
				msg = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;
	}

	public boolean login(String mail, String password) {

		Boolean msg = false;
		try {
			PreparedStatement sql = connect
					.prepareStatement("SELECT * FROM manager WHERE email=? " + "AND pwd=PASSWORD(?)");
			sql.setString(1, mail);
			sql.setString(2, password);

			/// System.out.println(sql);
			ResultSet rs = sql.executeQuery();

			if (rs.next()) {
				currentManager = new Manager(rs.getString("nom"), rs.getString("prenom"), rs.getString("email"),
						rs.getString("pwd"));
				msg = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;

	}
}