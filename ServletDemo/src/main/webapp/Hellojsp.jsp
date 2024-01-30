<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp server demo</title>
</head>
<body>
<h1>hello Muthu</h1>

<%! int n=12;
int n2=14;
%>
<%=n*n2 %>

<%int n1=2;
int sum=n1+n+n2;
%>
<%=sum %>
<%
int x=100;
out.print("The value of x : "+x);%>
<%--
int x=20;
out.print("The value of x : "+x);
response.sendRedirect("https://www.javascripttutorial.net/javascript-function/");--%> 

</body>
</html>