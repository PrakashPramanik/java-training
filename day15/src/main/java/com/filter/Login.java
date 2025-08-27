package com.filter;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "Login", urlPatterns = { "/Login" })
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("Start doPost in Login");
		String username = request.getParameter("username");
		try {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<html><body>");
			writer.println("Thank you, " + username + ". You are now logged into the system.");
			writer.println("</body></html>");
			writer.close();
			System.out.println("content type is " + response.getContentType());
			System.out.println("End doPost in Login");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
