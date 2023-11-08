<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        .nav-link {
            color: black !important;
        }

        label {
            font-weight: bold;
        }
        </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" style="background-color: #2ca3ed;">

        <div class="container">
            <a class="navbar-brand" href="HomePage.html" style="font-weight:bold;">PlaceO</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                      <a class="nav-link" href="#">List a Placement</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">Active Placement Drives</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Past Placement Drives</a>
                      </li>
                </ul>            

                <form class="form-inline ms-auto me-1">
                    <input class="btn btn-success" type="submit" name ="login_logout" value ="Logout" action ="Reg.html">
                    <a href="PlacementHomePage.html">						
                    <button class="btn btn-danger" type="submit"  >&rarr;</button>
					</a>
                  
                </form>            
            </div>
        </div>
    </nav> 
    
    <div class="container mt-25 " >
        <div class="card" style=" margin-top: 10rem;margin-left: 10rem;
            border-radius: 2rem;
            border: 3px solid rgb(119, 108, 108);
            box-shadow: 0px 0px 15px 5px rgba(173, 216, 230, 0.8); width: 50rem;height: 27rem;">
        <form action="AdminRealUpdatePost" method="POST" class="mx-3">
        <div class="row  mb-3 mt-3">
            <div class="col">
                <h3>List a Placement</h3>
            </div>
            <div class="form-group col-12 col-md-6" style="text-align: end;">
                <button type="submit" class="btn btn-lg" style="border:.01cm solid black; font-weight: bold;background-color: rgb(97, 241, 97)">Upload</button>
            </div>
        </div>
            <div class="row">
                <div class="form-group col-12 col-md-6">
                    <label for="companyName">Name of the company</label>
                    <input type="text" value="<%=request.getAttribute("cn") %>" class="form-control" id="companyName" name ="companyName">
                </div>
                <div class="form-group col-12 col-md-6">
                    <label for="jobRole">Job role</label>
                    <input type="text" value="<%=request.getAttribute("jr") %>"class="form-control" id ="jobRole" name ="jobRole">
                </div>
            </div><br>
            <div class="row">
                <div class="form-group col-12 col-md-6">
                    <label for="startDate">Starting Date</label>
                    <input type="date" value="<%=request.getAttribute("sd") %>" class="form-control" id ="startDate" name ="startDate">
                </div>
                <div class="form-group col-12 col-md-6">
                    <label for="endDate">Ending Date</label>
                    <input type="date" value="<%=request.getAttribute("ed") %>" class="form-control" id ="Ending Date" name ="EndingDate">
                </div>
            </div><br>
            <div class="row">
                <div class="form-group col-12 col-md-6">
                    <label for="jobLocation">Job location</label>
                    <input type="text" class="form-control" value="<%=request.getAttribute("jl") %>" id ="joblocation" name ="joblocation">
                </div>
                <div class="form-group col-12 col-md-6">
                    <label for="ctc">CTC</label>
                    <input type="text" class="form-control" value="<%=request.getAttribute("ct") %>" id ="ctc" name ="ctc">
                </div>
            </div><br>
            <div class="row">
                <div class="form-group col-12 col-md-6">
                    <label for="Contact">Contact details</label>
                    <input type="text" class="form-control" value="<%=request.getAttribute("cd") %>"id ="Contact" name ="Contact">
                </div>
            </div><br>
                

        </form>

        <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.2/js/bootstrap.min.js"></script>
        </div>
    </div> 