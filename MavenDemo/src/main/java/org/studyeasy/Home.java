package org.studyeasy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.studyeasy.entity.User;
import org.studyeasy.model.UserModel;

@WebServlet("/home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String page = request.getParameter("page");
        switch (page) {
            case "home": {
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            }
            case "listusers": {
                List<User> users =new ArrayList<>();
                users= new UserModel().listuser();
                
                // Set the user list as an attribute in the request
                request.setAttribute("listusers", users);
                
                // Forward the request to the Listuser.jsp
                request.getRequestDispatcher("Listuser.jsp").forward(request, response);
                break;
            }
            case "adduser": {
    			request.getRequestDispatcher("adduser.jsp").forward(request, response);
    			break;
    		}
            default: {
                request.getRequestDispatcher("error.jsp").forward(request, response);
                break;
            }
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String form = request.getParameter("form").toLowerCase();
		switch (form) {
		case "adduseroperation": {
			//System.out.println(form);
			String uname = request.getParameter("username");
			String gmail = request.getParameter("email");
			User user = new User(uname, gmail);
			request.setAttribute("users", user);
			new UserModel().adduser(user);
			List<User> users = new ArrayList<>();
			users = new UserModel().listuser();
			request.setAttribute("listusers", users);
			request.getRequestDispatcher("Listuser.jsp").forward(request, response);
			break;
		}
    }
    
    }
}
