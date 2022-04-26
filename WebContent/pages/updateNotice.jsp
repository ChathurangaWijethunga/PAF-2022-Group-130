<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String userid = request.getParameter("userid");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String type = request.getParameter("type");
		String notice = request.getParameter("notice");
	%>
	
<form action="../updatenotice" method="post">
	ID<input type="text" name="id" value="<%= id %>" readonly> <br>
	User Id<input type="text" name="userid" value="<%= userid %>" readonly> <br>
	Name <input type ="text" name="name" value="<%= name %>"> <br>
	Date<input type="date" name="date" value="<%= date %>"> <br>
	Time<input type="time" name="time" value="<%= time %>"> <br>
	<label> Type <select name="type" value="<%= type %>">
			  <option value="Bill Details">Bill Details</option>
			  <option value="Payment Details">Payment Details</option>
			  <option value="Red bills">Red bills</option>
			</select> </label> <br>
	Notice<input type="text" name="notice" value="<%= notice %>"> <br>
<input type="submit" name="submit" value="Update Data"> <br>
</form>
</body>
</html>