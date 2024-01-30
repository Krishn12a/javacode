package org.register.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
		public static Connection getConnection() {
			String dbURL = "jdbc:mysql://localhost:3306/user?useSSL=false";
			String dbUsername = "root";
			String dbUserpassword = "Database@123";
			Connection con = null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				try {
					con = DriverManager.getConnection(dbURL, dbUsername, dbUserpassword);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return con;

		}

		


}
