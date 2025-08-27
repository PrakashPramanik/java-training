package com.day11;

import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletFour")
public class ServletFour extends HttpServlet {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String userName = request.getParameter("userName");
			out.print("Welcome " + userName);
			String uName = "JavaTrainning";
			out.print("<form action='ServletFive'>");
			out.print("<input type='hidden' name='uname' value='" + uName + "'><br>");
			out.print("<input type='submit' value='Get Value from Hidden Field'>");
			out.print("</form>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
