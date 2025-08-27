package com.eventListener;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet("/CounterGfg")
public class CounterGfg extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String firstBall = null;
		ArrayList<String> al = new ArrayList<String>();
		PrintWriter out = response.getWriter();
		ServletContext ctx = getServletContext();
		Connection con1 = (Connection) ctx.getAttribute("conn");
		try {
			Statement s = (Statement) con1.createStatement();
			ResultSet rs1 = s.executeQuery("select type from item");
			while (rs1.next()) {
				System.out.println(rs1.getString(1));
				String type = rs1.getString(1);
				al.add(rs1.getString(1));
			}
			firstBall = al.get(0).toString();
			ctx.setAttribute("ball1", firstBall);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.println(firstBall + "This is my First Player");
	}
}
