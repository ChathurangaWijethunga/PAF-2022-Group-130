package com.payment.co;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PaymentGatewayServlet")
public class PaymentGatewayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String currentUID = request.getParameter("uid");
		String paymentID = request.getParameter("pid");
		String name = request.getParameter("name");
		String accNo = request.getParameter("accNo");
		String address = request.getParameter("billAddress");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String totalPayable = request.getParameter("totalPayable");
		String cash = request.getParameter("cash");
		String paidStats = null;
		String expDate = "2022-04-20";
		
		int AccNo = Integer.parseInt(accNo);
		
		// table id
		int PID = CustomerPaymentDBUtil.getLastPaymentID();
		int id = PID+1;
		
		
		// balance calculate
		float totalpayablef = Float.parseFloat(totalPayable);
		float cashf = Float.parseFloat(cash);
		float balancef = cashf-totalpayablef;
		
		if (totalpayablef==cashf) {
			paidStats = "Paid";
		} else if (totalpayablef<cashf) {
			paidStats = "Paid";
		} else if (cashf == 0) {
			paidStats = "unpaid";
		} else {
			paidStats = "HalfPaid";
		}
		
		boolean isTrue;
		isTrue = CustomerPaymentDBUtil.insertPaymentDetails(id, paymentID, currentUID, name, AccNo, address, email, phone, totalpayablef, cashf, balancef, paidStats, expDate);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("pages/paymentSuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("pages/paymentFailed.jsp");
			dis.forward(request, response);
		}
		
	}

}
