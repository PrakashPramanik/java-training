<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Retrieving Cookie from browser</h1>
<br>
<%
 Cookie[] cks=request.getCookies();
  for(Cookie ck:cks)
  {
    String cn=ck.getName();
    String cv=ck.getValue();
    
    %>
    Cookie name : <b><%=cn %> </b><br>
    Cookie Value : <b><%=cv %> </b><br>
    <%
  }
%>
</body>
</html>