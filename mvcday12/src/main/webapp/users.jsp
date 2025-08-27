<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.example.bean.User"%>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        h1 {
            text-align: center;
            margin: 20px 0;
            color: #343a40;
        }
        table {
            background: white;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        th {
            background-color: #007bff;
            color: white;
            text-align: center;
        }
        td {
            text-align: center;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        .container {
            margin-top: 30px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>User List</h1>
        <table class="table table-bordered table-hover">
            <thead>
                <tr class="table-primary">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <%
                
                List<User> users = (List<User>) request.getAttribute("users");
                if (users != null && !users.isEmpty()) {
                    for (User user : users) {
                %>
                <tr>
                    <td><%=user.getId()%></td>
                    <td><%=user.getName()%></td>
                    <td><%=user.getEmail()%></td>
                </tr>
                <%
                    }
                } else {
                %>
                <tr>
                    <td colspan="3" class="text-center text-muted">No users found</td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
