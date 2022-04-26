<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>
<h1>User details</h1>
<table style="width:80%">


	
  <tr>
    <th>UserID</th>
    <th>Name</th>
    <th>Address</th>
    <th>Account Number</th>
    <th>NIC</th>
    <th>Email</th>
    <th>Type</th>
    <th>UserName</th>
    <th>Password</th>
  </tr>
  <c:forEach var="cus" items="${cusDetails}">
	
  <tr>
  
    <td>${cus.id}</td>
    <td>${cus.name}</td>
    <td>${cus.address}</td>
    <td>${cus.accountnumber}</td>
    <td>${cus.NIC}</td>
    <td>${cus.email}</td>
    <td>${cus.type}</td>
    <td>${cus.username}</td>
    <td>${cus.password}</td>

   <td> <form method="post" action = "#" style="margin-bottom: 2px;">
        <input type="hidden" name="UserId" value="${cus.id}"/>
        <input class=button type= "submit" value = "update"/>
          </form>

    <form method="post" action = "#" style="margin-bottom:2px;">
        <input type="hidden" name="test" value="ok"/>
        <input type="hidden" name="UserID" value="${cus.id}"/>
        <input class=button type= "submit" value = "delete"/>    
   </form></td>
   
   <c:url value="updateCustomer.jsp"  var="cusupdate>">
       
       <c:param name="userId" value= "${cus.id }"/>
       <c:param name="name" value= "${cus.name}"/>
       <c:param name="address" value= "${cus.address}"/>
       <c:param name="accountnumber" value= "${cus.accountnumber}"/>       
       <c:param name="nic" value= "${cus.NIC}"/>      
       <c:param name="email" value= "${cus.email}"/>
       <c:param name="type" value= "${cus.type}"/>
       <c:param name="username" value= "${cus.username}"/>
       <c:param name="password" value= "${cus.password}"/>
   
   </c:url> 
  </tr>
 
</c:forEach>

	
</table>

</body>
</html>