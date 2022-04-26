<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<button onclick="window.location.href='pages/notice.jsp'">
  		Notice Details
</button>
	<form method="post" action="paynow">
		<input type="hidden" name="uid" value="002" />
		<input type="submit" value="Pay now"/>
	</form>
	
	<button onclick="window.location.href='pages/billingHome.jsp'" >
  		Billing Manage
	</button>

 

</body>
</html>