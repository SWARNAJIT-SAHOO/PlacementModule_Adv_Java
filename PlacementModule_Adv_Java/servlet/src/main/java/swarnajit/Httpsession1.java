package swarnajit;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Httpsession1")
public class Httpsession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String n = request.getParameter("username");
			out.print("<h1>"+"welcome "+n+"<h1>");
			HttpSession s = request.getSession();
			s.setAttribute("name", n);
			out.print("<a href='Httpsession2'>click here</a>");
			out.close();
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}
}
