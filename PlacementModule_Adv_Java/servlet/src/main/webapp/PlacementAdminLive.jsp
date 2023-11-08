<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>StudentHome</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" style="background-color: #2ca3ed;">
        <a class="navbar-brand" href="HomePage.html" style="font-weight:bold;">PlaceO</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                  <a class="nav-link" href="#">My Profile</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#"></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Active Placement Drives</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Past Placement Drives</a>
                  </li>
            </ul> </div>
    </nav>
    <div class="row">
        <div class="card mx-auto text-center" style="
        width: 52rem;
        height: auto;
       
        border: 3px solid rgb(119, 108, 108);
        box-shadow: 0px 0px 15px 5px rgba(173, 216, 230, 0.8);
        position: relative; margin-top: 5rem;">
        <p style="font-weight: bold; font-size: 2rem;">LIVE PLACEMENTS</p>
        <br>
         <table  class="table table-striped table-bordered">
         <thead>
    <tr class="table-success">
      	<th scope="col">Company Name</th>
      	<th scope="col">Job Role</th>
        <th scope="col">Starting Date</th>
        <th scope="col">Ending Date</th>
      	<th scope="col">Job Location</th>
        <th scope="col">CTC (lpa)</th>
        <th scope="col">Contact</th>
         <th scope="col"></th>
    </tr>
    </thead>
    <tbody class="table-group-divider">
     <% try {		
   		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Adv_PlacementModule", "root", "rajaraja");
		Statement st=con.createStatement();
	
		String ps="select * from admindata  ";
		
   		ResultSet rs=st.executeQuery(ps);
   		while(rs.next()) {			
   		
   		%>
   		<tr>
   		<form action="AdminUpdatePost" method="post">
   		 <input  name="cn" type="hidden" value="<%=rs.getString("companyname") %>">
   		  <input  name="jr" type="hidden" value="<%=rs.getString("jobrole") %>">
   		   <input  name="sd" type="hidden" value="<%=rs.getString("startingdate") %>">
   		    <input  name="ed" type="hidden" value="<%=rs.getString("endingdate") %>">
   		     <input  name="jl" type="hidden" value="<%=rs.getString("joblocation") %>">
   		      <input  name="ct" type="hidden" value="<%=rs.getString("ctc") %>">
   		       <input  name="cd" type="hidden" value="<%=rs.getString("contactdetails") %>">
			<td><%=rs.getString("companyname") %></td>
			<td><%=rs.getString("jobrole") %></td>
			<td><%=rs.getString("startingdate") %></td>
			<td><%=rs.getString("endingdate") %></td>
			<td><%=rs.getString("joblocation") %></td>
			<td><%=rs.getString("ctc") %></td>
			<td><%=rs.getString("contactdetails") %></td>
			<td >
			<div style="display:flex;">
			<button style="margin-right: 1rem" type="submit" class="btn btn-outline-warning">Update</button>
			</form>
			<form action="AdminPostDelete" method="get">
            <input  name="id" type="hidden" value="<%=rs.getString("companyname") %>">
            <button type="submit"class="btn btn-outline-danger">Delete</button></td>
            </form>
			
			</div>

</tr>
   		
   		 <%
                }
   		con.close();
   		} catch (Exception e) {
   			e.printStackTrace();
   			}
%>
    </tbody>
         </table>
        
    </div>

        <div class="card mx-auto" style="
        width: 12rem;
        padding: 25px;
        padding-left:30px;
        height: 6.5rem;
        
        border: 3px solid rgb(119, 108, 108);
        box-shadow: 0px 0px 15px 5px rgba(173, 216, 230, 0.8);
         margin-top: 15rem;">
        <a href="PlacementAdminPost.html" style="margin-left:1rem">
        <button type="submit" style="height:50px"class="btn btn-outline-info">Post One</button>
        </a>
        </div>        
         
         
    </div>

</body>
</html>