package swarnajit;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Url1")
public class Url1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name =request.getParameter("username");
		out.print("<html>");
		out.print("<body>");
		out.print("Welcome Mr."+ name);
		out.print("<br><a href='Url2?user="+name+"'>Visit</a>");
		out.print("</body>");
		out.print("</html>");
	}
}
