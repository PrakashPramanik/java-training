package com.day11;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.*;

@WebServlet("/PageRefresh")
public class PageRefresh extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set refresh time as 1 seconds
		response.setIntHeader("Refresh", 50);
		// Set response content type
		response.setContentType("text/html");

		// Get current time
		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.AM_PM) == 0) {
			am_pm = "AM";
		} else {
			am_pm = "PM";
		}
		String CT = hour + ":" + minute + ":" + second + " " + am_pm;

		PrintWriter out = response.getWriter();
		out.println("<h1 align='center'>Auto Refresh Page</h1>");
		out.println("<h2 align='center'>Current time: " + CT + "</h2>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
