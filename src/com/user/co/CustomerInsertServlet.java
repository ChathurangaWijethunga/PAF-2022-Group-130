package com.user.co;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomerInsertServlet")
public class CustomerInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String accountnumber= request.getParameter("accountnumber");
		String NIC = request.getParameter("nic");
		String Email = request.getParameter("email");
		String Type = request.getParameter("type");
		String Username = request.getParameter("username");
		String Password = request.getParameter("passU");
		
		boolean isTrue;
		
	isTrue = CustomerDBUtil.insertcustomer(name, address, accountnumber, NIC, Email,Type, Username, Password);
		if(isTrue == true){
		      RequestDispatcher dis = request.getRequestDispatcher("pages/userDetails.jsp");
		      dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("pages/SignUp");
			dis2.forward(request,response);
		}
	}

}
