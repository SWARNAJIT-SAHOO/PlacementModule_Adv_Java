package swarnajit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/Servletconff")
public class Servletconff extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    ServletConfig config = getServletConfig();
	    
	    String servletName = config.getServletName();
	    String driverClass = config.getInitParameter("DriverClass"); // Use the correct parameter name
	    String URL = config.getInitParameter("URL"); 
	    String userName = config.getInitParameter("userName");
	    String password = config.getInitParameter("password");
	    
	    Enumeration<String> paramNames = config.getInitParameterNames(); 
	    
	    while (paramNames.hasMoreElements()) {
	        String paramName = paramNames.nextElement();
	        out.println(paramName + "<br>");
	    }
	    
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h2>");
	    out.println("Servlet Name: " + servletName + "<br>");
	    out.println("Driver Class: " + driverClass + "<br>");
	    out.println("Driver URL: " + URL + "<br>");
	    out.println("User Name: " + userName + "<br>");
	    out.println("Password: " + password + "<br>");
	    out.println("Initialization Parameter Names:<br>");
	       
	    out.println("</h2></body></html>");
	}

}