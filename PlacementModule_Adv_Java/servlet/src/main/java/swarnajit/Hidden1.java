package swarnajit;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Hidden1")
public class Hidden1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		out.println("<html>");
		out.println("<body>");
		out.println("Welcome : "+name);
		out.println(""
				+ "<form  action='Hidden2' method='get'>"
				+ "           <input type='hidden' placeholder='enter name' name=\"user\" value='"+name+"'/>\r\n"
				+ "            \r\n"
				+ "                <button type=\"submit\"  >Go to 2nd</button>"
				+ "           "
				+ "        </form>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
