<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>A Web Page</title>
</head>
<body>
	<%
	out.println("Hello there!");
	%>
	<br> Hello! The time is now
	<%=new java.util.Date()%>
	<br>
	<%
	Date dt = new Date();
	out.println(dt);
	%>
	<br>
	<%
	Date d = new Date();
	out.println(d.getDate());
	%>
	<br>

	<%
	for (int fontSize = 1; fontSize <= 3; fontSize++) {
	%>
	<!-- HTML tag for font is < font color= "green" size="4" -->
	<font color="green" size="<%=fontSize%>"> JSP Tutorial </font>
	<br />
	<%
	}
	%>
	<br>


	<%!int day = 3;%>

	<%
	if (day == 1 || day == 7) {
	%>
	<p>Today is weekend</p>
	<%
	} else {
	%>
	<p>Today is not weekend</p>
	<%
	}
	%>

	<br>

	<%
	int day = 1;
	if (day == 1 || day == 7) {
	%>
	<p>Today is weekend</p>
	<%
	} else {
	%>
	<p>Today is not weekend</p>
	<%
	}
	%>

	<br>
	<%
	ArrayList<String> al = new ArrayList<String>();
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	for (int i = 0; i < al.size(); i++) {
	%>
	<%=al.get(i)%>
	<%
	}
	%>


</body>
</html>