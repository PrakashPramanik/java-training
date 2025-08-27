package com.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/servlet2")
public class WelcomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		response.setContentType("text/html");
		String n = request.getParameter("userName");
		PrintWriter out = response.getWriter();
		out.print("Welcome " + n);
	}
}
