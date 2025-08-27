package com.day11;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/CookieController")
public class CookieController extends HttpServlet {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String un = request.getParameter("uname");
    String pw = request.getParameter("pass");
    Cookie ck = new Cookie("mycookie", un);
    response.addCookie(ck);
    response.sendRedirect("home.jsp");
 }
}