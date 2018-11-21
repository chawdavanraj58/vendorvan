package database;

import java.sql.*;

public class Connect {
	// create a static method to ret DB connection
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	}
}
