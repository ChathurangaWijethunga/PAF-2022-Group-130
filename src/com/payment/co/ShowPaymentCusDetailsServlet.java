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
		String afterProceed = request.getParameter("page");
		
		String newPID;
		String gpid1;
		
		try {
			List<PaymentCustomer> pcusDetails =  CustomerPaymentDBUtil.getCustomerDetails(currentUID);
			request.setAttribute("customerDetails", pcusDetails);
			
			PaymentCustomer pcdetails = pcusDetails.get(0);
			request.setAttribute("userid", pcdetails.getUserID());
			request.setAttribute("name", pcdetails.getName());
			request.setAttribute("nic", pcdetails.getNIC());
			request.setAttribute("accountNumber", pcdetails.getAccountNumber());
			request.setAttribute("address", pcdetails.getAddress());
			request.setAttribute("phone", pcdetails.getPhone());
			request.setAttribute("email", pcdetails.getEmail());
			
			List<CustomerBill> pbillDetails =  CustomerPaymentDBUtil.getCustomerBillDetails(currentUID);
			request.setAttribute("customerBillDetails", pbillDetails);
			
			// payment id for generate pid
			int PID = CustomerPaymentDBUtil.getLastPaymentID();
			
			// next payment id generation
			if (PID == 0) {
				newPID = "001";
			} else {
				int gpid = PID+1;
				gpid1 = String.valueOf(gpid);
				if (gpid >= 10) {
					newPID = "P0"+gpid1;
				} else {
					newPID = "P00"+gpid1;
				}
			}
			
			
			
			request.setAttribute("newPID", newPID);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(afterProceed!=null) {
			RequestDispatcher dispatch = request.getRequestDispatcher("pages/paymentUserInput.jsp");
			dispatch.forward(request, response);
		} else {
			RequestDispatcher dispatch = request.getRequestDispatcher("pages/paymentHome.jsp");
			dispatch.forward(request, response);
		}
		
		
	}

}
