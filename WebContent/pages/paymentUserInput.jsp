<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="layout/css/payment.css" rel="stylesheet" type="text/css" />
<meta charset="ISO-8859-1">
<title>payment</title>
</head>
<body>
	<!-- Bill details form servlet -->
	<c:forEach var="cd" items="${customerBillDetails}">
		<c:set var="totalPayable" value="${cd.billAmount}" />
	</c:forEach>
		

<!-- Customer details from servlet -->
	<h1 class="psys" align="center">Payment System (After Proceed)</h1>
	
		<form method="post" action="paymentGateway" class="firstpform">
			<div class="fcon">
				<label class="flabel">Payment ID;&emsp;&emsp;&emsp;&emsp;&emsp;:
					<input class="fin" type="text" name="pid" value="${newPID}" readonly="readonly" />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Name&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&ensp;:
					<input class="fin" type="text" name="name" value="${name}" readonly="readonly" />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">NIC &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;:
					<input class="fin" type="text" name="nic" value="${nic}" readonly="readonly" />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Account Number&emsp;&emsp;&emsp;&nbsp;:
					<input class="fin" type="text" name="accNo" value="${accountNumber}" readonly="readonly" />	
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Address&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;:
					<input class="fin" type="text" name="billAddress" value="${address}" readonly="readonly" />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Phone&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp; :
					<input class="fin" type="text" name="phone" value="${phone}" readonly="readonly" />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Email&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp; :
					<input class="fin" type="text" name="email" value="${email}" readonly="readonly" />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Total Payable&emsp;&emsp;&emsp;&emsp;&emsp;:
					<input class="fin" type="text" name="totalPayable" value="${totalPayable}0" readonly="readonly" />
				</label>
			</div>
			<div class="fcon">
				<label class="flabel">Amount &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;:
					<input class="fin" type="text"  name="cash" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" placeholder="${totalPayable}0" required />
				</label>
			</div>
			<div class="btnctrl">
				<input type="hidden" name="uid" value="${userid}"/>
				<input class="btn ok" type="submit" value="CONFIRM" />
				<input class="btn cancel" type="button" value="CANCEL" onclick="window.location.href='../index.jsp'" />
			</div>
		</form>
	
</body>
</html>