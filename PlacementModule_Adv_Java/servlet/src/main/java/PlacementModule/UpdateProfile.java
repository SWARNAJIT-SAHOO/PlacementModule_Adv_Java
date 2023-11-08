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


@WebServlet("/UpdateProfile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateProfile() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
    		String e = request.getParameter("email");
    		String query = "update studentdetail set name=?,registration =?, branch =?,AdmissionYear =?, phonenumber=?,Address=?,skill=?,appiledplacement=?, completedplacement=? where email=? ";
    		PreparedStatement st = con.prepareStatement(query);
			
//    		st.setString(1,request.getParameter("email")); 
//    		st.setString(2,p); 
    		st.setString(1,request.getParameter("name"));
    		st.setString(2,request.getParameter("regno"));
    		st.setString(3,request.getParameter("branch"));
    		st.setString(4,request.getParameter("year"));
    		st.setString(5,request.getParameter("phone"));
    		st.setString(6,request.getParameter("address"));
    		st.setString(7,request.getParameter("skills"));
    		st.setString(8,request.getParameter("placements"));
    		st.setString(9,request.getParameter("internships"));
    		st.setString(10,request.getParameter("email")); 
    		st.executeUpdate();  
    		st.close(); 
    		con.close();
    		
    		request.setAttribute("email",request.getParameter("email") );
	    	request.setAttribute("name", request.getParameter("name"));
	    	request.setAttribute("registration", request.getParameter("regno"));
	    	request.setAttribute("branch", request.getParameter("branch"));
	    	request.setAttribute("AdmissionYear",request.getParameter("year") );
	    	request.setAttribute("phonenumber",request.getParameter("phone") );
	    	request.setAttribute("Address",request.getParameter("address"));
	    	request.setAttribute("skill", request.getParameter("placements"));
	    	request.setAttribute("appiledplacement",request.getParameter("placements"));
	    	request.setAttribute("completedplacement", request.getParameter("internships"));
    		RequestDispatcher rd = request.getRequestDispatcher("PlacementStudentProfile.jsp");
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
