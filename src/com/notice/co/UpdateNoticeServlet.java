package com.notice.co;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateNoticeServlet")
public class UpdateNoticeServlet extends HttpServlet {
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
		
		isTrue = NoticeDBUtil.updateNotice(id, userid, name, date, time, type, notice);
		
		if(isTrue == true) {
			
			List<Notice> noticeDetails = NoticeDBUtil.getNoiceDetails(id);
			request.setAttribute("userNotices",noticeDetails );
			
			RequestDispatcher dis = request.getRequestDispatcher("pages/userNotice.jsp");
			dis.forward(request, response);
			
		} else {
			List<Notice> noticeDetails = NoticeDBUtil.getNoiceDetails(id);
			request.setAttribute("userNotices",noticeDetails );
			
			RequestDispatcher dis2 = request.getRequestDispatcher("pages/userNotice.jsp");
			dis2.forward(request, response);
		}
	}

}
