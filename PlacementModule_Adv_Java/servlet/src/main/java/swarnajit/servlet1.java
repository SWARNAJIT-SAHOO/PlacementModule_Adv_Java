package swarnajit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {		
		Connection con=DBConnection.getCon();
		PrintWriter out = response.getWriter();
//		int id=Integer.parseInt(request.getParameter("t1"));
//		String name=request.getParameter("t2");
		
		PreparedStatement ps=con.prepareStatement("select * from std ");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {			
		out.println("id :"+rs.getInt(1)+"....Name:"+rs.getString(2));
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}