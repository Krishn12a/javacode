package org.studyeasy.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.studyeasy.config1.DatabseConfig;
import org.studyeasy.entity.User;

import com.mysql.cj.xdevapi.PreparableStatement;


public class UserModel {
	public List<User> listuser(){
		List<User> listusers=new ArrayList<User>();
		Connection connect=DatabseConfig.getConnection();
		Statement st=null;
		ResultSet rs=null;
		String query= "select * from customer";
		try {
			st=connect.createStatement();
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs=st.executeQuery(query);
			while(rs.next()) {
				String uname=rs.getString("Name");
				String gmail=rs.getString("gmail");
				listusers.add(new User(uname,gmail));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listusers;
	}
	
	public void adduser(User newuser) {
		Connection connect=null;
		PreparedStatement statement=null;
		connect=DatabseConfig.getConnection();
		String uname=newuser.getUname();
		String gmail=newuser.getGmail();
		String querry="Insert into customer(name,gmail) values(?,?)";
		try {
			statement=connect.prepareStatement(querry);
			statement.setString(1, uname);
			statement.setString(2, gmail);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateuser(User newuser) {
		Connection connect=null;
		PreparedStatement st=null;
		String uname=newuser.getUname();
		String gmail=newuser.getUname();
		String query="update customer set name=?,gmail=? where id=?";
		try {
			st=connect.prepareStatement(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
