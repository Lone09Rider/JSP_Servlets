package com.KirAWork;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		1.HttpSession
//		HttpSession session = request.getSession();
//
//		int k = (int)session.getAttribute("k");

//		2.Cookie : For Multiple Elements
		int k = 0;
		
		Cookie[] cookies = request.getCookies();
		
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		
		k = k * k;

		response.getWriter().println("Square is : " + k);

	}

}
