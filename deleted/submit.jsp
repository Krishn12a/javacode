<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>submit</title>
</head>
<body>
<table border=1 bgcolor="aqua">
<Tr>
<th colspan="2"> Registration Details </th>
</Tr>
<Tr>
<td> Name: </td>
<td><%= request.getParameter("uname") %> </td>
</Tr>
<Tr>
<td> Gender: </td>
<td><%= request.getParameter("gender") %> </td>
</Tr>
<Tr>
<td> Languages: </td>
<td><%

String[] languages = request.getParameterValues("language"); 

if(languages!=null){
	for(int i =0;i<languages.length;i++){
		
		out.print((i+1) + "." + languages[i]);
		out.print("<br/>");
	}
}

%> </td>
</Tr>
<Tr>
<td> Country: </td>
<td><%= request.getParameter("country") %> </td>
</Tr>
</table>
</body>
</html>