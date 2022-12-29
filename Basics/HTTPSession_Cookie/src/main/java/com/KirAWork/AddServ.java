package com.KirAWork;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
//	    1.HttpSession	
//		HttpSession session = request.getSession();
//		session.setAttribute("k", k);
		
//		2.Cookie
		Cookie cookie = new Cookie("k", k+"");
		response.addCookie(cookie);
		
		response.sendRedirect("sq");
		
	}

}
