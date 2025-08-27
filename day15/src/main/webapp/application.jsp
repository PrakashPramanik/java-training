<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*"%>

<html>
<head>

<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME</h3>
	<%
	application.setAttribute("author", "Manisha");
	application.setAttribute("Site", "https://dotnettutorials.net");
	%>

	<%
	session.setAttribute("user", "Manisha");
	%>


	<%
	Cookie ck = new Cookie("name", "Manisha");
	response.addCookie(ck);
	%>
	<a href="first.jsp">Click Here</a>

</body>
</html>