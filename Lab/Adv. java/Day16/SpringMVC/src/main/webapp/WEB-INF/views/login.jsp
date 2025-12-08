<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
     <h3>${message}</h3>
     
   <form action="/SpringMVC/login/validateUser" method="post">
     User name: <input type="text" name="username" id="un"><br/>
     password: <input type="password" name="pass" id="ps"><br/>
     <button type="submit" name="login" id="login" value="login">Login</button>
   
   </form>
   <a href="registerme">Register me? </a> / <a href="#">Forgot password?</a>
</body>
</html>