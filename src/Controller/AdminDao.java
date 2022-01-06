package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Admin;

public class AdminDao {
	Connection connect = GetConnection.getConnection();
	

	public void creationCompte(Admin admin) {

		try {
			PreparedStatement sql = connect
					.prepareStatement("INSERT INTO admin (nom, prenom,email,mdp)" + " VALUES (?,?,?,PASSWORD(?))");
			sql.setString(1, admin.getNom());
			sql.setString(2, admin.getPrenom());
			sql.setString(3, admin.getEmail());
			sql.setString(4, admin.getMdp());

			sql.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean mailExist(String mail) {
		Boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM admin WHERE email = ?");

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

	public boolean login(String mail, String mdp) {

		Boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM admin WHERE email=? " + "AND mdp=PASSWORD(?)");
			sql.setString(1, mail);
			sql.setString(2, mdp);

			/// System.out.println(sql);
			ResultSet rs = sql.executeQuery();

			if (rs.next()) {
//				Admin admin = new Admin(rs.getString("nom"), rs.getString("prenom"), rs.getString("statut"), rs.getString("email"),
//						rs.getString("mdp"));
				Admin admin = new Admin(rs.getString("nom"), rs.getString("prenom"), rs.getString("email"),rs.getString("mdp"));
				msg = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;

	}
}


