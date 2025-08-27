<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Expression Language</title>
</head>

<body>
	<%
	request.setAttribute("request_name", " Training Request");
	%>
	<h3>${requestScope.request_name}</h3>



	${1<2} ${10+90}
</body>

</html>