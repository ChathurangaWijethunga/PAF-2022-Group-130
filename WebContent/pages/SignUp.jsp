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
 
   <form action="insert" method="post" align="center">
  
		
  <label for="fname">Name:</label>
  <input type="text" id="fname" name="name"><br><br>
  <label for="lname">Address:</label>
  <input type="text" id="lname" name="address" form="form1"><br><br>
  <label for="lname">AccountNumber:</label>
  <input type="text" id="lname" name="accountnumber" form="form1"><br><br>
  <label for="lname">NIC:</label>
  <input type="text" id="lname" name="nic" form="form1"><br><br>
  <label for="lname">Email:</label>
  <input type="text" id="lname" name="email" form="form1"><br><br>
  <label for="lname">Type:</label>
  <input type="text" id="lname" name="type" form="form1"><br><br>
  <label for="lname">UserName:</label>
  <input type="text" id="lname" name="username" form="form1"><br><br>
  <label for="lname">Password:</label>
  <input type="text" id="lname" name="passU" form="form1"><br><br>
  <input type="submit" name="save" value="insert">
</form>
 

</body>
</html>