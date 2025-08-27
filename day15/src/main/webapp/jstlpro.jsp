<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
   <title>JSTL forEach Example</title>
</head>
<body>
   <h1>Numbers from 1 to 5:</h1>
   <ul>
       <c:forEach var="i" begin="1" end="5">
           <li>Value: <c:out value="${i}" /></li>
       </c:forEach>
   </ul>
   
   
  <!--  <form method="POST" action="second.jsp">
   Name <input type="text" name="name" >
   <input type="submit" value="Submit">
</form> -->


 <form method="POST" action="third.jsp">
   Name <input type="text" name="name" >
   <input type="submit" value="Submit">
</form>


<c:catch var ="catchException">
       <% int x = 5/0;%>
    </c:catch>
 
    <c:if test = "${catchException != null}">
       <p>The exception is : ${catchException} <br />
       There is an exception: ${catchException.message}</p>
     </c:if>
</body>
</html>