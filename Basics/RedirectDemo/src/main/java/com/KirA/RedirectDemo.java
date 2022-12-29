package com.KirA;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RDTry
 */
@WebServlet("/add")
public class RedirectDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		response.sendRedirect("sq?k="+k);
		
//		Request Dispatcher
		
//		request.setAttribute("k", k);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, response);
		
	}

}
