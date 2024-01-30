package org.register.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.register.config.DatabaseConfig;
import org.register.entity.User;


public class UserModel {
	
		public void adduser(User newuser) {
			Connection connect=null;
			PreparedStatement statement=null;
			connect=DatabaseConfig.getConnection();
			String name=newuser.getName();
			String email=newuser.getEmail();
			String pwd=newuser.getPwd();
			String gender=newuser.getGender();
			String country=newuser.getCountry();
			String querry="Insert into users(name,password,gender,email,country) values(?,?,?,?,?)";
			try {
				statement=connect.prepareStatement(querry);
				statement.setString(1, name);
				statement.setString(2, pwd);
				statement.setString(3, gender);
				statement.setString(4, email);
				statement.setString(5, country);
				statement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
