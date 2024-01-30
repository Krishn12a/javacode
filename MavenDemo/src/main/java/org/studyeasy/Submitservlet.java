package org.studyeasy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Submitservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		
		pw.println("Welcome to servlet learning....");
		String name=req.getParameter("uname");
		String gender=req.getParameter("gender");
		String[] languages = req.getParameterValues("language"); 
		String country=req.getParameter("country");
		pw.println("Name: "+name);
		pw.println("Gender: "+gender);
		pw.println("Languges: "+Arrays.toString(languages));
		pw.println("Country: "+country);
	}

}
