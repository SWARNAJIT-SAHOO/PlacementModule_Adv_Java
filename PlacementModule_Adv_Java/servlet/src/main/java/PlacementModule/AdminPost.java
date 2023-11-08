package PlacementModule;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminPost
 */
@WebServlet("/AdminPost")
public class AdminPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminPost() {
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				try {
					PrintWriter out=response.getWriter();
//					out.print("email - "+request.getParameter("email"));
					Class.forName("com.mysql.jdbc.Driver");  
		    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
		    	
		    		PreparedStatement st = con.prepareStatement("insert into admindata values(?,?,?,?,?,?,?)"); 
		    		st.setString(1,request.getParameter("companyName")); 
		    		st.setString(2,request.getParameter("jobRole")); 
		    		st.setString(3,request.getParameter("startDate"));
		    		st.setString(4,request.getParameter("EndingDate"));
		    		st.setString(5,request.getParameter("joblocation"));
		    		st.setString(6,request.getParameter("ctc"));
		    		st.setString(7,request.getParameter("Contact"));
//		    		HttpSession s = request.getSession();
//			    	s.setAttribute("email", request.getAttribute("email"));
//			    	s.setAttribute("pass", request.getAttribute("pass"));
		    		st.executeUpdate(); 
		            st.close(); 
		            con.close();
		            RequestDispatcher rd = request.getRequestDispatcher("PlacementAdminLive.jsp");
				    rd.forward(request, response);
//		         
				}catch (Exception e) {
		    		e.printStackTrace();
		    	}
	}

}
