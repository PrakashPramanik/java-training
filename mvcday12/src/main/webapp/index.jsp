<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Data Retrieval</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 100px;
        }
        .card {
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        .card-header {
            background-color: #007bff;
            color: white;
            font-size: 1.2rem;
            text-align: center;
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
            border-radius: 8px;
            padding: 10px 20px;
            transition: 0.3s;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    Retrieve User Data
                </div>
                <div class="card-body text-center">
                    <h4 class="mb-4">Simple example to Retrieve the data from the User table in Database</h4>
                    <form action="UserController" method="get">
                        <input type="submit" value="Click Here to Get Users Details" class="btn btn-custom">
                    </form>
                </div>
            </div>
            <br>
            <div class="card">
                <div class="card-header">
                    Add User.
                </div>
                <div class="card-body text-center">
                    <h4 class="mb-4">A simple example to add data to the User table in the database</h4>
                    <form action="AddUser.jsp" method="get">
                        <input type="submit" value="Click Here to Add User" class="btn btn-custom">
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
