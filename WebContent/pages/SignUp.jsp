<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
 <h1 align="center">Registration Form</h1>
 
   <form action="../insertp" method="post" align="center">	
	  <label for="name">Name:</label>
	  <input type="text" name="name"><br><br>
	  <label for="address">Address:</label>
	  <input type="text" name="address"><br><br>
	  <label for="accountnumber">AccountNumber:</label>
	  <input type="text" name="accountnumber"><br><br>
	  <label for="nic">NIC:</label>
	  <input type="text" name="nic"><br><br>
	  <label for="email">Email:</label>
	  <input type="text" name="email"><br><br>
	  <label for="phone">Phone:</label>
	  <input type="text" name="phone"><br><br>
	  <label for="type">Type:</label>
	  <input type="text" name="type"><br><br>
	  <label for="username">UserName:</label>
	  <input type="text" name="username"><br><br>
	  <label for="passU">Password:</label>
	  <input type="text" name="passU"><br><br>
	  <input type="submit" value="Insert">
	</form>
 

</body>
</html>