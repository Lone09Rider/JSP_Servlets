package com.RD;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class sqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int k = (int) req.getAttribute("k");

		resp.getWriter().println("Hello");
		resp.getWriter().println("Sum is  : " + k);

		k = k * k;

		resp.getWriter().println("Square is : " + k);
	}

}
