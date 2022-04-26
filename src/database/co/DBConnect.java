package database.co;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

		//variables for get details on database connection
		private static String url = "jdbc:mysql://localhost:3306/electro";
		private static String uname = "root";
		private static String pass = "root";
		private static Connection con;
		//get connection
		public static  Connection getConnection() {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			    con = DriverManager.getConnection(url, uname, pass);
			}
			catch(Exception e) {
		
		        System.out.println("Database connection is not success!!!");
			}
		

		return con;
	}

}
