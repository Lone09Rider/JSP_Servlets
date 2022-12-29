package com.KirA;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sqServlet
 */
@WebServlet("/sq")
public class sqServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int k = Integer.parseInt(request.getParameter("k"));

		response.getWriter().println("Your Sum is : " + k);

		k = k * k;

		response.getWriter().println("Square is : " + k);
		
		System.out.println("Sq Called");
	}

}
