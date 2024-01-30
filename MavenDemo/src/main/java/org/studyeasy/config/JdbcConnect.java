package org.studyeasy.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JdbcConnect extends HttpServlet  {
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		Connection connection;
		try {
			connection = JdbcConnect.getconnection();
			Statement statement = connection.createStatement();
			 String query = "SELECT * FROM your_table";
			 ResultSet resultSet = statement.executeQuery(query);
			 
			 while (resultSet.next()) {
				 
				 	int id = resultSet.getInt("columnName1");

				    String name = resultSet.getString("columnName2");
				    String gmail = resultSet.getString("columnName3");
				    pw.println(id+" "+name+" "+gmail);
				    
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Connection getconnection() throws SQLException {
		
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		 String url = "jdbc:mysql://localhost:3306/user";
		 String username = "root";
		 String password = "Database@123";
		 
		Connection connection = DriverManager.getConnection(url, username, password);
		
			    
			    
         
         
     } catch (Exception e) {
         e.printStackTrace();
     }
		
		return getconnection();
		
	}
	
}