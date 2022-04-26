package database.co;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		//variables for get details on database connection
		String url = "jdbc:mysql://localhost:3307/electro";
		String uname = "root";
		String pass = "root";
		
		//get connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		return con;
	}
}
