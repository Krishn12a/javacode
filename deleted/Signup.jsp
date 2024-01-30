<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page</title>
</head>
<body>
<h1>signup page</h1>
<form action="confirm.jsp" method="post">
Name :
<input type="text" name="uname">
<br/>
Gender : 
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="female">female
<br/>
Languages : 
<input type="checkbox" name="language" value="English">English
<input type="checkbox" name="language" value="Tamil">Tamil
<input type="checkbox" name="language" value="Malayalam">Malayalam
<input type="checkbox" name="language" value="Japanese">Japanese
<br/>
Country : 
<select name="country">
<option value="India">India</option>
<option value="England">England</option>
<option value="Japan">Japan</option>
<option value="Malaysia">Malaysia</option>
</select>
<br/>
<button type="submit" class="btn btn-primary">Register me</button>
</form>
</body>
</html>