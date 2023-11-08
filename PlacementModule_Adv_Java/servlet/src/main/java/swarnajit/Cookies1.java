package swarnajit;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Cookies1")
public class Cookies1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String n = request.getParameter("username");
			String m = request.getParameter("msg");
			out.print("<h1>"+n+"<h1>"
					+ "<h3>"+m
					+ "<h3>");
			Cookie ck1 = new Cookie("num",n);
			response.addCookie(ck1);
			Cookie ck2 = new Cookie("mss",m);
			response.addCookie(ck2);
			out.print("<form action='Cookies2'>"
					+ "<input type=submit value='go'/>"
					+ "</form>");
			out.close();
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}
}
