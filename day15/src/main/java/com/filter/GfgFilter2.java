package com.filter;

import java.io.*;
import javax.servlet.*;
public class GfgFilter2 implements Filter {
    public void init(FilterConfig filterConfig) {}
 
    public void destroy() {}
    // This method is called each time a client requests for
    // a web resource
    // which could be a Servlet or a JSP page i.e.
    // preprocessing request
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
        throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        out.println(
            "<b> Filter2 is Filtering the request : </b>");
        out.println("Hello " + request.getParameter("name")
                    + "!");
 
        out.println("<br/>");
        out.println("<br/>");
        out.println("<br/>");
 
        // Calling  doFilter() calls the next filter in the
        // chain will execute or if there is no filter then
        // the requested web resource is executed.
        chain.doFilter(request, response);
 
        out.println("<br/>");
        out.println("<br/>");
        out.println("<br/>");
 
        // post-processing the request and after the
        // requested web resource is called.
        out.println(
            "<b> Filter1 is Filtering the response : </b>");
        out.println("Bye " + request.getParameter("name")
                    + "!");
    }
}
