<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
<h1>Login</h1>
<hr color="blue"/>
<form name="loginfrm" action="<%=request.getContextPath()%>/SiteControler" method="post">
<div>
<div>
Username: <input type="text" name="username"/>
</div>
<div style="margin-top:5px">
Password: <input type="password" name="userpass"/>
</div>
<div style="margin-top:5px">
<input type="hidden" name="action" value="authenticate"/>
<input type="submit" value="Login"/>
</div>
</div>
</form>
</body>
</html>