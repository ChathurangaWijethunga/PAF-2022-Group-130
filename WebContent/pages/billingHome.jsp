<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Management</title>


<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
</head>


<body>

  <table>
  <h1 class="psys" align="center">Billing List</h1>
	<c:forEach var="cus" items="${billDetails}">
		
		${cus.userID}
		${cus.name}      
		${cus.startDate}
		${cus.endDate}
		${cus.accountNumber}
		${cus.billNumber}
		${cus.noofUnit}
		${cus.billAmount}


	<tr>
		<td>Customer ID :</td>
		<td>${cus.userID}</td>
	</tr>
	<tr>
		<td>Customer Name :</td>
		<td>${cus.name}</td>
	</tr>
	<tr>
		<td> Start Date :</td>
		<td>${cus.startDate}</td>
	</tr>
	<tr>
		<td>End Date :</td>
		<td>${cus.endDate}</td>
	</tr>
	<tr>
		<td>Account Number :</td>
		<td>${cus.accountNumber}</td>
	</tr>
		
		<tr>
		<td>Bill Number :</td>
		<td>${cus.billNumber}</td>
	</tr>
	<tr>
		<td>Number Of Units :</td>
		<td>${cus.noofUnit}</td>
	</tr>
	<tr>
		<td>Bill Amount :</td>
		<td>${cus.billAmount}</td>
	</tr>
	
	</c:forEach>
</table>

	


</body>
</html>