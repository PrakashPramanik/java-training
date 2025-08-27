package com.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.bean.*;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
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

	public void init() throws ServletException {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<User> users = getUsers();
		request.setAttribute("users", users);
		RequestDispatcher dispatcher = request.getRequestDispatcher("users.jsp");
		dispatcher.forward(request, response);

	}

	private List<User> getUsers() {
		List<User> users = new ArrayList<>();
		try {
			String sql = "SELECT * FROM users";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				User user = new User(id, name, email);
				users.add(user);
			}
		} catch (SQLException e) {
			// Handle database errors
		}
		return users;
	}
}
