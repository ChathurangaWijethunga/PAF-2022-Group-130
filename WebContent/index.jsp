<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="paynow">
		<input type="hidden" name="uid" value="002" />
		<input type="submit" value="Pay now"/>
	</form>
	
	
	
	<form method="post" action="billing">
		<input type="hidden" name="bid" value="20012" />
		<input type="submit" value="Billing List"/>
	</form>
	
	
 

</body>
</html>