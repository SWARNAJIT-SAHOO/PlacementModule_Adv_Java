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
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
//			PrintWriter out = response.getWriter();
//			int id=(int)Integer.parseInt(request.getParameter("t1"));
			String e = request.getParameter("email");
			String p=request.getParameter("pass");
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
			    PreparedStatement ps=con.prepareStatement("select * from adminlogin where email=? and password=?");
			    
			    ps.setString(1, e);
			    ps.setString(2, p);
			    ResultSet rs=ps.executeQuery();
    
			    if(rs.next()==true)
			 
			    {
//			    	 ArrayList<String> std = new ArrayList<>();
//			    	 std.add(e);
//			    	 std.add(p);
			    	HttpSession s = request.getSession();
			    	
			    	s.setAttribute("email", e);
			    	
			    	RequestDispatcher rd = request.getRequestDispatcher("PlacementAdminHomepage.html");
			    	rd.forward(request, response);
			    }
			    else {
			    	RequestDispatcher rd = request.getRequestDispatcher("Error.html");
			    	rd.forward(request, response);	
			    }
			    
			}catch (Exception e) {
				e.printStackTrace();
			}
	}


}
