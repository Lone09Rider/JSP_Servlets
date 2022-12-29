package com.Kira;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
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
		
		PrintWriter out = response.getWriter();
		out.println("Hi");
		
//		Servlet Context -> Evecrything is shared to server
		
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		String str1 = ctx.getInitParameter("phone");
//		
//		out.println(str);
//		out.println(str1);
		
		ServletConfig ctx = getServletConfig();
		String str = ctx.getInitParameter("phone");
		
		out.println(str);
		
	}

}
