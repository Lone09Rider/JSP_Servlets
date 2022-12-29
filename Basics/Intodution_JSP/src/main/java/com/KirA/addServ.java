package com.KirA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addServ
 */
@WebServlet("/add")
public class addServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		int k = i + j;
		
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		
		out.println("Sum is : "+k);
		
		out.println("</body></html>");
		
	}

}
