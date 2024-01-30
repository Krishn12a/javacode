<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
FirstName: <form:input path="firstName"/>
<br><br>
LastName: <form:input path="lastName"/>
<br><br>
Country: 
<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select> 
<br><br>
Favorite Language:
Java<form:radiobutton path="favoriteLanguage" value="Java"/>
Microservices<form:radiobutton path="favoriteLanguage" value="Microservices"/>
Python<form:radiobutton path="favoriteLanguage" value="Python"/>
<br><br>
Operating Systems:
Mac OS<form:checkbox path="operatingSystems" value="Mac"/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>
Linux<form:checkbox path="operatingSystems" value="Linux"/>
<br><br>
<input type="submit" value="SUBMIT">
</form:form>
</body>
</html>