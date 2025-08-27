package com.day11;

import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/ServletThree")
public class ServletThree extends HttpServlet {
 
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) { 
       try{ 
 
          response.setContentType("text/html"); 
          PrintWriter out = response.getWriter(); 
        
          //getting value from the query string 
          String userName = request.getParameter("uname"); 
          out.print("Hello " + userName); 
 
          out.close(); 
 
       }
       catch(Exception e){
          System.out.println(e);
      } 
   }
}
