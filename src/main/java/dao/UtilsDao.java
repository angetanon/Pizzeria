package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UtilsDao {

	public static  java.sql.Connection myConnection;
	
	public static void connectionJDBC() throws ClassNotFoundException {

		try {
			String url = "jdbc:mysql://localhost:3306/pizzeria";
			String username = "root"; 
			String password = "";
			
			Class.forName("org.mariadb.jdbc.Driver");
			myConnection = DriverManager.getConnection(url,username, password);			
			ResourceBundle file = ResourceBundle.getBundle("application");
					String valeur = file.getString("jdbc.database");					
		
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
