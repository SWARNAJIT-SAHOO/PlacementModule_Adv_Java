<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="jakarta.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        .custom-large-font {
            font-size: 4rem;
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #2ca3ed">
        <div class="container-fluid">
            <a class="navbar-brand" style="font-weight: bold; color: black" href="#">PlaceO</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" style="color: black" href="#">My Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" style="color: black" href="#">Active Placements</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" style="color: black" href="#">My Applications</a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" style="color: black" href="#">
                            Notifications
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" style="color: black" href="#">My Accounts</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="text-center my-5">
        <h1 class="custom-large-font">WORK HARD, HAVE FAITH</h1>
    </div>
    
   
    <div class="card mx-auto" style="
    width: 50rem;
    height: 28rem;
    border-radius: 2rem;
    border: 3px solid rgb(119, 108, 108);
    box-shadow: 0px 0px 15px 5px rgba(173, 216, 230, 0.8);
    position: relative;">
    <div class="card-body">
        <h3 class="card-title">Student Profile</h3>
        <div class="card-holder" style="display: flex; justify-content: space-between;">
            <div class="card" style="
        width: 10rem;
        height: 10rem;
        border-radius: 0.5rem;
        border: 1px solid rgb(119, 108, 108);">
               <div class="profile_img" style="flex: 12;">
                <img src="https://cdn-icons-png.flaticon.com/512/3106/3106807.png" alt="profile_animated" style="height: 10rem;">
            </div>
            </div>
            <div class="edit-profile" style="
      position: absolute;
      top: 1rem;
      right: 1.2rem;">
      <a href="PlacementUpdateProfile.html">		  
                <button class="btn btn-primary" type="submit" action="#" style="background-color: #2ca3ed;">
                    Edit Profile
                </button>
	  </a>
            </div>
 <div class="card" style="
      width: 35rem;
      height: 23rem;
      border-radius: 0.5rem;
      border: 1px solid rgb(119, 108, 108);font-weight: 700;font-size:0.9rem;">
       <% try {		
   		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
		Statement st=con.createStatement();
		HttpSession s = request.getSession(false);
		
		String e = (String) session.getAttribute("email");
		String ps=String.format("select * from studentdetail where email=%s", e) ;
		
   		ResultSet rs=st.executeQuery(ps);
   		while(rs.next()) {			
   		
   		%>
                <p style="margin-left: 1rem;">Name:<%= rs.getString("name")%></p>
                <p style="margin-left: 1rem;">Reg.No.:<%= rs.getString("registration")%></p>
                <p style="margin-left: 1rem;">Branch:<%= rs.getString("AdmissionYear")%></p>
                <p style="margin-left: 1rem;">Admission Year:</p>
                <p style="margin-left: 1rem;">Email: <%= rs.getString("email")%></p>
                <p style="margin-left: 1rem;">Contact No.: <%= rs.getString("phonenumber")%></p>
                <p style="margin-left: 1rem;">Address: <%= rs.getString("Address")%></p>
                <p style="margin-left: 1rem;">Skills:<%= rs.getString("skill")%></p>
                <p style="margin-left: 1rem;">No. of Applied Placements:  <%= rs.getString("appiledplacement")%></p>
                <p style="margin-left: 1rem;">No. of Completed Internships:<%= rs.getString("completedplacement")%></p>
                <%
                }
   		con.close();
   		} catch (Exception e) {
   			e.printStackTrace();
   			}
%>
            </div>
        </div>
    </div>
</div>
    </div>
</body>
</html>