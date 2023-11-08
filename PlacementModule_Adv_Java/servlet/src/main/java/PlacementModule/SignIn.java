package PlacementModule;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			PrintWriter out=response.getWriter();
//			out.print("email - "+request.getParameter("email"));
			Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
    	
    		PreparedStatement st = con.prepareStatement("insert into studentdetail values(?,?,?,?,?,?,?,?,?,?,?)"); 
    		st.setString(1,request.getParameter("email")); 
    		st.setString(2,request.getParameter("pass")); 
    		st.setString(3,request.getParameter(null));
    		st.setString(4,request.getParameter(null));
    		st.setString(5,request.getParameter(null));
    		st.setString(6,request.getParameter(null));
    		st.setString(7,request.getParameter(null));
    		st.setString(8,request.getParameter(null));
    		st.setString(9,request.getParameter(null));
    		st.setString(10,request.getParameter(null));
    		st.setString(11,request.getParameter(null));
    		
    		st.executeUpdate(); 
            st.close(); 
           
        	request.setAttribute("email",request.getParameter("email") );
	    	request.setAttribute("name", null);
	    	request.setAttribute("registration", null);
	    	request.setAttribute("branch", null);
	    	request.setAttribute("AdmissionYear",null );
	    	request.setAttribute("phonenumber",null );
	    	request.setAttribute("Address", null);
	    	request.setAttribute("skill", null);
	    	request.setAttribute("appiledplacement", null);
	    	request.setAttribute("completedplacement", null);
            RequestDispatcher rd = request.getRequestDispatcher("PlacementStudentHomePage.jsp");
		    rd.forward(request, response);
//         
		}catch (Exception e) {
    		e.printStackTrace();
    	}
	}

}
