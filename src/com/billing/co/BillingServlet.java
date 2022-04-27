package com.billing.co;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BillingServlet
 */
@WebServlet("/BillingServlet")
public class BillingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// get user id using parameters bid
				String currentUID = request.getParameter("bid");
				
				try {
					List<Billing> billDetails = BillingDBUtil.validate(currentUID);
					request.setAttribute("billDetails", billDetails);
				System.out.println(billDetails);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				RequestDispatcher dispatch = request.getRequestDispatcher("pages/billingHome.jsp");
				dispatch.forward(request, response); 
	}

}
