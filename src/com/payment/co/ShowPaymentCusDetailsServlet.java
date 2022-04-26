package com.payment.co;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/ShowPaymentCusDetailsServlet")
public class ShowPaymentCusDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get user id using parameters
		String currentUID = request.getParameter("uid");
		
		try {
			List<PaymentCustomer> pcusDetails =  CustomerPaymentDBUtil.getCustomerDetails(currentUID);
			request.setAttribute("customerDetails", pcusDetails);
			
			List<CustomerBill> pbillDetails =  CustomerPaymentDBUtil.getCustomerBillDetails(currentUID);
			request.setAttribute("customerBillDetails", pbillDetails);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher("pages/paymentHome.jsp");
		dispatch.forward(request, response);
		
	}

}
