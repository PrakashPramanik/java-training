<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>
		${applicationScope.author}<br> ${applicationScope.Site}
	</h1>
	
	<h1>Username is ${ sessionScope.user }</h1>
	
	<h1>Welcome, ${cookie.name.value}  </h1>
	
	
	
</body>
</html>