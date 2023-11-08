package swarnajit;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection con=null;
    static {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_record", "root", "rajaraja");
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    }
        static Connection getCon()
        {
        	return con;
        }
}
