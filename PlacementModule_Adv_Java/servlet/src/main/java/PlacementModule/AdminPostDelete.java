package PlacementModule;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminPostDelete
 */
@WebServlet("/AdminPostDelete")
public class AdminPostDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
//			PrintWriter out = response.getWriter();
//			int id=(int)Integer.parseInt(request.getParameter("t1"));
			String e = request.getParameter("id");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
			PreparedStatement ps=con.prepareStatement("delete from admindata where companyname = ?");
		    
		     
		      ps.setString(1, e);

		      // execute the preparedstatement
		      ps.execute();
		      
		      con.close();
		      RequestDispatcher rd = request.getRequestDispatcher("PlacementAdminLive.jsp");
		    	rd.forward(request, response);
			    
			}catch (Exception e) {
				e.printStackTrace();
			}
	}



}
