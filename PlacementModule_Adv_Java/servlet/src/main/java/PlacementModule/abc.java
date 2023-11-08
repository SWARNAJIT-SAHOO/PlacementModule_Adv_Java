package PlacementModule;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class abc
 */
@WebServlet("/abc")
public class abc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession s = request.getSession();
	         
	        PrintWriter writer = response.getWriter();
	        writer.println("Session ID: " + s.getId());
	        String n = (String)s.getAttribute("email");
			writer.print("<h1>"+"Hello "+n+"<h1>");
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}

}
