package com.day11;

import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
 
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet { 
 
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response){ 
       try{ 
          response.setContentType("text/html"); 
          PrintWriter out = response.getWriter(); 
        
          String userName = request.getParameter("userName"); 
          out.print("Welcome " + userName + "<br>"); 
 
          //appending the username in the query string
          //username can be get in the next servlet by 
           //using its key uname 
          out.print("<a href='ServletThree?uname=" + userName +"'>Click Here</a>"); 
                
          out.close(); 
 
       }catch(Exception e){System.out.println(e);} 
  }
}
