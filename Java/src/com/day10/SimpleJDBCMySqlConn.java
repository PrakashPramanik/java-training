package com.day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

import java.util.Set;

public class SimpleJDBCMySqlConn {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root",
					"root");
			Statement stmt = con.createStatement();
			Set<String> st = new HashSet<String>();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
			while (rs.next()) {
				// st.add(rs.getInt(1));
				st.add(rs.getString(1));
//System.out.println(rs.getInt(1));
			}
			st.forEach(games -> System.out.println(games));
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
