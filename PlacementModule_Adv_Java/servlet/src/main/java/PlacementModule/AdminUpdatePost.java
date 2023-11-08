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
 * Servlet implementation class AdminUpdatePost
 */
@WebServlet("/AdminUpdatePost")
public class AdminUpdatePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter out=response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
    		String e = request.getParameter("email");
    		String query = "update admindata set jobrole =?,startingdate =?,endingdate=?,joblocation=?,ctc=?, contactdetails=? where companyname=? ";
    		PreparedStatement st = con.prepareStatement(query);
			
//    		st.setString(1,request.getParameter("email")); 
//    		st.setString(2,p); 
    		/*st.setString(1,request.getParameter("jr"));
    		st.setString(2,request.getParameter("sd"));
    		st.setString(3,request.getParameter("ed"));
    		st.setString(4,request.getParameter("jl"));
    		st.setString(5,request.getParameter("ctc"));
    		st.setString(6,request.getParameter("cd"));
    		st.setString(7,request.getParameter("cn"));
    		st.executeUpdate();  
    		st.close(); 
    		
    		con.close();
    		*/
    		request.setAttribute("cn", request.getParameter("cn"));
    		request.setAttribute("jr", request.getParameter("jr"));
    		request.setAttribute("sd", request.getParameter("sd"));
    		request.setAttribute("ed", request.getParameter("ed"));
    		request.setAttribute("jl", request.getParameter("jl"));
    		request.setAttribute("ct", request.getParameter("ct"));
    		request.setAttribute("cd", request.getParameter("cd"));
    		
    		RequestDispatcher rd = request.getRequestDispatcher("PlacementAdminPostUpdate.jsp");
    		rd.forward(request, response);
//    		if(e.equals(request.getParameter("email"))) {
//    		}
//    		else {
//    			 RequestDispatcher rd = request.getRequestDispatcher("PlacementSignIn.html");
//    			 rd.forward(request, response);
//    		}
           
//         
		}catch (Exception e) {
    		e.printStackTrace();
    	}
	}

}
