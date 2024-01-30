package org.studyeasy;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
       
    }
    protected void success(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String uname = request.getParameter("uname");
		String gender = request.getParameter("gender");
		String language = request.getParameter("language");
		String country = request.getParameter("country");
		
		
		String combinedData = uname + ":" + gender + ":" + language + ":" + country ;

			request.getSession().invalidate();
			Cookie cookie = new Cookie("regData",combinedData);
			response.addCookie(cookie);
			response.sendRedirect("Succes.jsp");
	}
	protected void reset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Signup.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "submit" : {
			success(request,response);
			break;
		}case "reset" : {
			reset(request,response);
			break;
		}
		
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		
		}
	}

	}

