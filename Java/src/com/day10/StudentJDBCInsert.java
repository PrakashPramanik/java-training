package com.day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentJDBCInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Student object and set values
        Student student = new Student();
        System.out.print("Enter name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter salary: ");
        student.setSalary(sc.nextInt());

        sc.close();

        // JDBC variables
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "root"; // change if different
        String password = "root"; // change to your MySQL password

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to Database
            conn = DriverManager.getConnection(url, user, password);

            // 3. Prepare SQL statement
            String sql = "INSERT INTO students (name, salary) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getSalary());

            // 4. Execute Update
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
