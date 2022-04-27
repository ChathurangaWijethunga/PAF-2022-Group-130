<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="logcenter" align="center">
	   <h1 >LOGIN</h1>
	   <form  action="login" method="post">
	       User Name: <input type="text" name="username" placeholder=" Enter Your username"><br></br>
	       Password: <input type="password" name="password" placeholder=" Enter Your password"><br><br>
	       <input type="submit" name="submit" value="Login">
	   </form>
	 </div>
   
 <button onclick="window.location.href='pages/SignUp.jsp'">
  		Sign Up
	</button>
 
</body>
</html>