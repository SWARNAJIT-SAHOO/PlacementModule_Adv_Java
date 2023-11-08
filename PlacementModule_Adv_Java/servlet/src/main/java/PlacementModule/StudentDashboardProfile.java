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

/**
 * Servlet implementation class StudentDashboardProfile
 */
@WebServlet("/StudentDashboardProfile")
public class StudentDashboardProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			PrintWriter out = response.getWriter();
//			int id=(int)Integer.parseInt(request.getParameter("t1"));
			String e = request.getParameter("email");
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
			    PreparedStatement ps=con.prepareStatement("select * from studentdetail where email=?");
			    
			    ps.setString(1, e);
			   
			    ResultSet rs=ps.executeQuery();
    
			  if(rs.next()) {
				  
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
			    	
			    	RequestDispatcher rd = request.getRequestDispatcher("PlacementStudentProfile.jsp");
			    	rd.forward(request, response);
			  }
	   
			    
			}catch (Exception e) {
				e.printStackTrace();
			}
	}


}
