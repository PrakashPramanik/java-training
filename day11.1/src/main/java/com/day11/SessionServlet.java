package com.day11;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/SessionServlet")
public class SessionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		String title = "Welcome to Session Management";
		Integer visitCount = 0;
		String visitCountKey = visitCount.toString();
		String userIDKey = new String("userID");
		String userID = new String("GFG");
		// Check if this is new comer on your web page.
		if (session.isNew()) {
			title = "Welcome to Session Management";
			session.setAttribute("UserIdName", "SessionServlet");
		} else {
			visitCount = (Integer) session.getAttribute(visitCountKey);
			visitCount = visitCount + 1;
			userID = (String) session.getAttribute(userIDKey);
		}
		session.setAttribute(visitCountKey, visitCount);
		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor = \"#f0f0f0\">\n"
				+ "<h1 align = \"center\">" + title + "</h1>\n"
				+ "<h2 align = \"center\">Session Servlet Information</h2>\n"
				+ "<table border = \"1\" align = \"center\">\n" + "<tr bgcolor = \"#949494\">\n"
				+ "  <th>Session info</th><th>value</th>" + "</tr>\n" + "<tr>\n" + "  <td>id</td>\n" + "  <td>"
				+ session.getId() + "</td>" + "</tr>\n" + "<tr>\n" + "  <td>Creation Time</td>\n" + "  <td>"
				+ createTime + "  </td>" + "</tr>\n" + "<tr>\n" + "  <td>Time of Last Access</td>\n" + "  <td>"
				+ lastAccessTime + "</td>" + "</tr>\n" + "<tr>\n" + "  <td>User ID</td>\n" + "  <td>"
				+ session.getAttribute("UserIdName") + "</td>" + "</tr>\n" + "<tr>\n" + "  <td>Number of visits</td>\n"
				+ "  <td>" + visitCount + "</td>" + "</tr>\n" + "</table>\n" + "</body>" + "</html>");
	}
}