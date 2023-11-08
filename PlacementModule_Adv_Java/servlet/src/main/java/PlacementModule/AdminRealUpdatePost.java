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

/**
 * Servlet implementation class AdminRealUpdatePost
 */
@WebServlet("/AdminRealUpdatePost")
public class AdminRealUpdatePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
	
			Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
    		
    		String query = "update admindata set jobrole =?,startingdate =?,endingdate=?,joblocation=?,ctc=?, contactdetails=? where companyname=? ";
    		PreparedStatement st = con.prepareStatement(query);
			
//    		st.setString(1,request.getParameter("email")); 
//    		st.setString(2,p); 
    		st.setString(1,request.getParameter("jobRole"));
    		st.setString(2,request.getParameter("startDate"));
    		st.setString(3,request.getParameter("EndingDate"));
    		st.setString(4,request.getParameter("joblocation"));
    		st.setString(5,request.getParameter("ctc"));
    		st.setString(6,request.getParameter("Contact"));
    		st.setString(7,request.getParameter("companyName"));
   		st.executeUpdate();  
   		st.close(); 
    	con.close();	
    			
    			RequestDispatcher rd = request.getRequestDispatcher("PlacementAdminLive.jsp");
    			rd.forward(request, response);
    		
    		
    		
    	
    		
//    	
           
//         
		}catch (Exception e) {
    		e.printStackTrace();
    	}
	}

}
