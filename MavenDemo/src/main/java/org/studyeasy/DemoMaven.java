package org.studyeasy;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoMaven
 */
public class DemoMaven extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoMaven() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String param=request.getParameter("page");
		if(param.equals("login")) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);		}
		
		else if(param.equals("signup")) {
		getServletContext().getRequestDispatcher("/Signup.jsp").forward(request, response);		}
		
		else if(param.equals("about")) {
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);		}
		
		else  {
			getServletContext().getRequestDispatcher("/pnf.jsp").forward(request, response);		}
	}

	

}
