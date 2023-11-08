package PlacementModule;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Loginp")
public class Loginp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			PrintWriter out = response.getWriter();
//			int id=(int)Integer.parseInt(request.getParameter("t1"));
			String e = request.getParameter("email");
			String p=request.getParameter("pass");
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
			    PreparedStatement ps=con.prepareStatement("select * from studentdetail where email=? and password=?");
			    
			    ps.setString(1, e);
			    ps.setString(2, p);
			    ResultSet rs=ps.executeQuery();
    
			    if(rs.next()==true)
			 
			    {
//			    	 ArrayList<String> std = new ArrayList<>();
//			    	 std.add(e);
//			    	 std.add(p);
			    	request.setAttribute("email", e);
			    	request.setAttribute("name", rs.getString("name"));
			    	request.setAttribute("registration", rs.getString("registration"));
			    	request.setAttribute("branch", rs.getString("branch"));
			    	request.setAttribute("AdmissionYear", rs.getString("AdmissionYear"));
			    	request.setAttribute("phonenumber", rs.getString("phonenumber"));
			    	request.setAttribute("Address", rs.getString("Address"));
			    	request.setAttribute("skill", rs.getString("skill"));
			    	request.setAttribute("appiledplacement", rs.getString("appiledplacement"));
			    	request.setAttribute("completedplacement", rs.getString("completedplacement"));
			    	
			    	RequestDispatcher rd = request.getRequestDispatcher("PlacementStudentHomePage.jsp");
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
