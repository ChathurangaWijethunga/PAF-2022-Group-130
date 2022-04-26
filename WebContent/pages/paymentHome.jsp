<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="layout/css/payment.css" rel="stylesheet" type="text/css" />
<title>Payment</title>
</head>
<body>
	
<!-- Bill details form servlet -->
	<c:forEach var="cd" items="${customerBillDetails}">
		<c:set var="totalPayable" value="${cd.billAmount}" />
	</c:forEach>

<!-- Customer details from servlet -->
	<h1 class="psys" align="center">Payment System</h1>
	<c:forEach var="cusD" items="${customerDetails}">
		<form class="firstpform">
			<div class="fcon">
				<label class="flabel">Name&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&ensp;:
					<input class="fin" type="text" value="${cusD.name}" disabled />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">NIC &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;:
					<input class="fin" type="text" value="${cusD.NIC}" disabled />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Account Number&emsp;&emsp;&emsp;&nbsp;:
					<input class="fin" type="text" value="${cusD.accountNumber}" disabled />	
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Address&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;:
					<input class="fin" type="text" value="${cusD.address}" disabled />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Phone&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp; :
					<input class="fin" type="text" value="${cusD.phone}" disabled />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Email&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp; :
					<input class="fin" type="text" value="${cusD.email}" disabled />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Total Payable&emsp;&emsp;&emsp;&emsp;&emsp;:
					<input class="fin" type="text" value="${totalPayable}0" disabled />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Amount&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;:
					<input class="fin" type="text" placeholder="${totalPayable}0" />
				</label>
			</div>
			<div class="btnctrl">
				<input class="btn ok" type="button" value="PROCEED" onclick="window.location.href='paymentSuccess.jsp'" />
				<input class="btn cancel" type="button" value="CANCEL" onclick="window.location.href='../index.jsp'" />
			</div>
		</form>
	</c:forEach>
</body>
</html>