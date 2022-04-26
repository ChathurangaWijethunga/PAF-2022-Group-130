package com.notice.co;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NoticeServlet")
public class NoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String userid = request.getParameter("userid");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		String type = request.getParameter("type");
		String notice = request.getParameter("notice");
		
		boolean isTrue;
		
		isTrue = NoticeDBUtil.insertNotice(id,userid, name, date, time, type, notice);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("pages/userNotice.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("pages/unsuccess.jsp");
			dis2.forward(request, response);
		}
			
		}

}
