<html>
<head>
    <title>Add User</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 80px;
        }
        .card {
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        .card-header {
            background-color: #007bff;
            color: white;
            font-size: 1.3rem;
            text-align: center;
            border-radius: 12px 12px 0 0;
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
                    Add User
                </div>
                <div class="card-body">
                    <form action="AddController" method="post">
                        <div class="mb-3">
                            <label for="userid" class="form-label">Enter the Id of the User</label>
                            <input type="text" class="form-control" id="userid" name="userid" required>
                        </div>

                        <div class="mb-3">
                            <label for="username" class="form-label">Enter the Name of the User</label>
                            <input type="text" class="form-control" id="username" name="username" required>
                        </div>

                        <div class="mb-3">
                            <label for="useremailid" class="form-label">Enter the Email ID of the User</label>
                            <input type="email" class="form-control" id="useremailid" name="useremailid" required>
                        </div>

                        <div class="text-center">
                            <input type="submit" value="Click Here to Add User" class="btn btn-custom">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
