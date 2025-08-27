package com.servlet;



import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = "/HelloWorldServlet1", initParams = {
//@WebInitParam(name = "welcomeMessage", value = "Hello from MySpecificServlet!")
//)
public class MySpecificServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
 
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.message = config.getInitParameter("welcomeMessage");
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}
