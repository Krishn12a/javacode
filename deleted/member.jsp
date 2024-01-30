<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
</head>
<body>
<%
String username = null, sessionId = null;
/* Cookie[] cookies = request.getCookies();
if (cookies !=null){
	for(Cookie cookie:cookies){
		if(cookie.getName().equals("username")){
			username = cookie.getValue();
		}
		if(cookie.getName().equals("JSESSIONID")){
			sessionId = cookie.getValue();
		}
	}
}*/

if(request.getSession().getAttribute("username") == null){
	response.sendRedirect("Login.jsp");
}
else{
	username = request.getSession().getAttribute("username").toString();
	sessionId = request.getSession().getId();
}

/* if(sessionId == null || username== null ){
	response.sendRedirect("Login.jsp");
}*/
%>
Welcome <%=username %>,
Your Session is created and your Session Id is <%=sessionId %>
<hr/>
<form action="<%=request.getContextPath() %>/MemberSiteController" method="Get">
<input type="hidden" name="action" value="destroy"/>
<input type="Submit" value="Logout"/>
</form>
</body>
</html>