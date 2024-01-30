package org.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.register.entity.User;
import org.register.model.UserModel;



@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public home() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String form=request.getParameter("form");
		switch(form) {
		case "submit":{
			String uname=request.getParameter("uname");
			String email=request.getParameter("gmail");
			String pwd=request.getParameter("password");
			String gender=request.getParameter("gender");
			String country=request.getParameter("country");
			User user=new User(uname,email,pwd,gender,country);
			request.setAttribute("users", user);
			new UserModel().adduser(user);
		}
		}
	}

}
