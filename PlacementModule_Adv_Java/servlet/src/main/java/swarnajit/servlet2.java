package swarnajit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int id=(int)Integer.parseInt(request.getParameter("t1"));
		String Name=request.getParameter("t2");

		
			Connection con=DBConnection.getCon();
		    System.out.println("database connected");
		    PreparedStatement ps=con.prepareStatement("select * from std where id=? and Name=?");
		    ps.setInt(1, id);
		    ps.setString(2, Name);
		    ResultSet rs=ps.executeQuery();
		    if(rs.next()==true)
		    {
		    	RequestDispatcher rd = request.getRequestDispatcher("Sucess.html");
//		    	out.println("login successfully");
		    	//RequestDispatcher
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
