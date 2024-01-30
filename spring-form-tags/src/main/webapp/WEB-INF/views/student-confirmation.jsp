<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student Confirmed: ${student.firstName} ${student.lastName}
<br><br>
Student Country: ${student.country}
<br><br>
Favorite Language: ${student.favoriteLanguage }
<br><br>
Operating Systems:
<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
<li>
${temp}
</li>
</c:forEach>
</ul>
</body>
</html>