<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Notice Details</title>
</head>
<body>

	<table>
	<c:forEach var="user" items="${userNotices}">
	
	<c:set var="id" value="${user.id}"/>
	<c:set var="userid" value="${user.userid}"/>
	<c:set var="name" value="${user.name}"/>
	<c:set var="date" value="${user.date}"/>
	<c:set var="time" value="${user.time}"/>
	<c:set var="type" value="${user.type}"/>
	<c:set var="notice" value="${user.notice}"/>
		<tr>
			<td>  ID </td>
			<td>${user.id}</td>
		</tr>
		<tr>
			<td> User ID </td>
			<td>${user.userid}</td>
		</tr>
		<tr> 
			<td> User Name</td>
			<td>${user.name}</td>
		</tr>
		<tr> 
			<td> Date </td>
			<td>${user.date}</td>
		</tr>
		<tr> 
			<td> Time</td>
			<td>${user.time}</td>
		</tr>
		<tr> 
			<td>Type </td>
			<td>${user.type}</td>
		</tr>
		<tr> 
			<td> Notice</td>
			<td>${user.notice}</td>
		</tr>
		</c:forEach>
	</table>
	
	<c:url value="updateNotice.jsp" var="noticeupdate">
		
		<c:param name="id" value="${id}"/>
		<c:param name="userid" value="${userid}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="date" value="${date}"/>
		<c:param name="time" value="${time}"/>
		<c:param name="type" value="${type}"/>
		<c:param name="notice" value="${notice}"/>
		
	</c:url>
	<a href="${noticeupdate}">
	<input type="button" name="update" value="Update Data">
	</a>
</body>
</html>