package com.user.co;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			  List<Customer>cusDetails=CustomerDBUtil.validate(username, password);
			  request.setAttribute("cusDetails", cusDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("pages/userDetails.jsp");
		dis.forward(request, response);
	} 
}
