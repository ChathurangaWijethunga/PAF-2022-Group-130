<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../layout/css/payment.css" rel="stylesheet" type="text/css" />
<title>Notices</title>
</head>
<body>
	<h1 align="center">Add New Notices</h1><br/><br/>
	<form action="../insertnotice" method="post"  align="center">
		<label class="flabel" style="font-size:1w">User ID&emsp;&emsp;&emsp;:&emsp;&emsp;&nbsp;
			<input type="text" name="userid" required/>
		</label>
		<br/><br/>
		<label class="flabel" style="font-size:1w">User Name&emsp;&emsp;:&emsp;&emsp;&ensp;
			<input type="text" name="name" required />
		</label>
		<br/><br/>
		<label class="flabel" style="font-size:1w">Date&emsp;&emsp;&emsp;&emsp;&emsp;:&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;
			<input type="date" name="date" required/>	
		</label>
		<br/><br/>
		<label class="flabel" style="font-size:1w">Time&emsp;&emsp;&emsp;:&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;
			<input type="time" name="time" required/>
		</label>
		<br/><br/>
		<label class="flabel" style="font-size:1w">Type&emsp;&emsp;&emsp;&emsp;:&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			<select name="type" >
			  <option value="Bill Details">Bill Details</option>
			  <option value="Payment Details">Payment Details</option>
			  <option value="Red bills">Red bills</option>
			</select>
		</label><br/><br/>
		<label class="flabel" style="font-size:1w">Notice&emsp;&emsp;&emsp;&emsp;:&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		<textarea  name="notice" rows="4" cols="50" required>  </textarea>
		</label>
		<br/><br/>
		<input type="submit" name="submit" value="Send"> 
	</form>
	
</body>
</html>