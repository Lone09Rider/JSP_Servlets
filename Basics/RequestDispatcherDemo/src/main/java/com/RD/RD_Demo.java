package com.RD;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class RD_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		int k = i + j;

		
		request.setAttribute("k", k);

		RequestDispatcher rd = request.getRequestDispatcher("sq");
		rd.forward(request, response);
		
	}

}
