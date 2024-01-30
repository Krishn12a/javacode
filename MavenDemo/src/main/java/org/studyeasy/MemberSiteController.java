package org.studyeasy;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MemberSiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemberSiteController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "destroy" : {
			request.getSession().invalidate();
//			Cookie[] cookies = request.getCookies();
//			for(Cookie cookie: cookies) {
//				cookie.setValue(null);
//			cookie.setMaxAge(0);
//				response.addCookie(cookie);
//			}
			response.sendRedirect(request.getContextPath()+"/SiteControler?action=Login");
			break;

		}
		case "memberArea":{
			request.getRequestDispatcher("member.jsp").forward(request, response);
		}
		
		}
	}
}


