package swarnajit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Cookies2")
public class Cookies2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			Cookie ck[] = request.getCookies();
			
			out.print("<h1>"+
			ck[1].getValue()+"  "+ck[0].getValue()+ "</h1>");
			
			out.close();
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}
}
