package com.filter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GfgServlet")
public class GfgServlet extends GenericServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request,
                        ServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Now the Main Servlet is Executing");
    }
}