package com.user.co;

import java.io.IOException;
import java.util.List;

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
		String Phone = request.getParameter("phone");
		String Type = request.getParameter("type");
		String Username = request.getParameter("username");
		String Password = request.getParameter("passU");
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(accountnumber);
		System.out.println(NIC);
		System.out.println(Email);
		System.out.println(Type);
		System.out.println(Username);
		System.out.println(Password);
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.insertcustomer(name, address, accountnumber, NIC, Email, Phone,Type, Username, Password);
		if(isTrue == true){
		      RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
		      dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("pages/SignUp.jsp");
			dis2.forward(request,response);
		}
	}

}
