package com.eventListener;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

@WebServlet("/MyListenerGfg")
@WebListener()
public class MyListenerGfg implements ServletContextListener {
	ServletContext ctx;
	Connection con;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;
	String ball;

	// Method 1
	public void contextInitialized(ServletContextEvent sce) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testingexample", "root", "root");
			ctx = sce.getServletContext();
			ctx.setAttribute("conn", con);
			s = con.createStatement();
			rs = s.executeQuery("select ball from item");
			while (rs.next()) {
				ball = rs.getString(1);
				System.out.println(ball);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method 2
	public void contextDestroyed(ServletContextEvent sce) {
		try {
			System.out.println("*************Finally Inside Destroy Method*******");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
