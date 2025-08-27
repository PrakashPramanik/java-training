package com.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// MySQL database connection details
	private static final String URL = "jdbc:mysql://localhost:3306/userdatabase";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	Connection conn = null;
	int id = 0;
	String name = null;
	String emailid = null;

	public void init() throws ServletException {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idString = request.getParameter("userid");
		id = Integer.parseInt(idString);
		name = request.getParameter("username");
		emailid = request.getParameter("useremailid");
		addUsers();
		RequestDispatcher dispatcher = request.getRequestDispatcher("SuccessMessage.jsp");
		dispatcher.forward(request, response);
	}

	private void addUsers() {
		try {
			String sql = "INSERT INTO users (id, name, email) VALUES (" + id + ",'" + name + "','" + emailid + "');";
			Statement stmt = conn.createStatement();
			int rowsAffected = stmt.executeUpdate(sql);
			System.out.println("ROWAFFECTED" + rowsAffected);
		} catch (SQLException e) {
			// Handle database errors
		}
	}
}
