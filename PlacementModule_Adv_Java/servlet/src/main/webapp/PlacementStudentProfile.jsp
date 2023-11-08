<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
            <a class="navbar-brand" style="font-weight: bold; color: black" href="PlacementStudentHomePage.jsp">PlaceO</a>
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
                        <a class="nav-link" style="color: black" href="PlacementStudentLive.jsp" >Active Placements</a>
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
    height: auto;
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
      height: auto;
      border-radius: 0.5rem;
      border: 1px solid rgb(119, 108, 108);font-weight: 700;font-size:0.9rem;">
	
     
						<table>
						<tr>
						<td> <p style="margin-left: 1rem;">Name:</p></td>
						<td><input  name="id" style="border:none;" value="<%=request.getAttribute("name") %>"></td>
						</tr>
						<tr>
						<td><p style="margin-left: 1rem;">Reg.No.:</p></td>
						<td><input  name="id" style="border:none;width:100%" value="<%=request.getAttribute("registration") %>"></td>
						</tr>
						<tr>
						<td><p style="margin-left: 1rem;">Branch:</p></td>
						<td><input  name="id" style="border:none" value="<%=request.getAttribute("branch") %>"></td>
						</tr>
						<tr>
						<td> <p style="margin-left: 1rem;">Admission Year:</p></td>
						<td><input  name="id" style="border:none" value="<%=request.getAttribute("AdmissionYear") %>"></td>
						</tr>
						<tr>
						<td><p style="margin-left: 1rem;">Email:</p></td>
						<td><input  name="id" style="border:none;width:100%" value="<%=request.getAttribute("email") %>"></td>
						</tr>
						<tr>
						<td><p style="margin-left: 1rem;">Contact No.:</p></td>
						<td><input  name="id" style="border:none" value="<%=request.getAttribute("phonenumber") %>"></td>
						</tr>
						<tr>
						<td><p style="margin-left: 1rem;">Address:</p></td>
						<td><input  name="id" style="border:none" value="<%=request.getAttribute("Address") %>"></td>
						</tr>
						<tr>
						<td><p style="margin-left: 1rem;">Skills:</p></td>
						<td><input  name="id" style="border:none" value="<%=request.getAttribute("skill") %>"></td>
						</tr>
						<tr>
						<td><p style="margin-left: 1rem;">No. of Applied Placements:</p></td>
						<td><input  name="id" style="border:none" value="<%=request.getAttribute("appiledplacement") %>"></td>
						</tr>
						<tr>
						<td> <p style="margin-left: 1rem;">No. of Completed Internships:</p></td>
						<td><input  name="id" style="border:none" value="<%=request.getAttribute("completedplacement") %>"></td>
						</tr>
						</table>      
                     
               
            </div>
        </div>
    </div>
</div>
    </div>
</body>
</html>