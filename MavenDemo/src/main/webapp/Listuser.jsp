<%@page import="org.studyeasy.entity.User"%>

<%@page import="java.util.*" %>



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>User List</title>

</head>

<body>

    <table border="1">

        <tr>

          

            <th>User Name</th>

            <th>User Email</th>

        </tr>

        <% 
        	
            List<User> userlist = (List<User>) request.getAttribute("listusers");

            if (userlist != null) {

                for (User _user : userlist) {

        %>

                    <tr>

                        
						
						
                        <td><%= _user.getUname() %></td>

                        <td><%= _user.getGmail() %></td>

                    </tr>

        <% 

                }

            }

        %>

    </table>

</body>

</html>