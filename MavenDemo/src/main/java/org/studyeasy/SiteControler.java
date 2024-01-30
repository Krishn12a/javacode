package org.studyeasy;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpSession;

public class SiteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void authenticate(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String username = request.getParameter("username");
		String userpass = request.getParameter("userpass");
		if(username.equals("Muthu") && userpass.equals("12345")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			newSession.setAttribute("username", username);
			//Cookie	cookie = new Cookie("username",username);
			//response.addCookie(cookie);
			response.sendRedirect(request.getContextPath()+"/MemberSiteController?action=memberArea");			
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/SiteController?action=Login");
		}
		
	}
	
	protected void doGet
	(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "Login" : {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			break;
		}
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		
		}
	}

		
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "authenticate" : {
			authenticate(request,response);
			break;
		}
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		
		}
	}
}