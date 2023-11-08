<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>StudentHome</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
    #one:hover{
   	 transform: scale(1.1);
        transition: 120ms;
    }
     #two:hover{
   	 transform: scale(1.1);
        transition: 120ms;
    }
    </style>
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
                <form action="StudentDashboardProfile" method="get">
             <input  name="email" type="hidden" value="<%=request.getAttribute("email") %>">
                  <button class="nav-link" type="submit" >My Profile</button>
                  </form>
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
    <div style="display: flex; justify-content: space-around;">
      <div id="one" class="card" style="width: 28rem; margin-top: 7rem; box-shadow: 0 0 10px 5px rgba(70, 130, 180, 0.5);
      ">
        <img class="card-img-top" src="https://www.shutterstock.com/shutterstock/videos/1061637682/thumb/10.jpg?ip=x480" alt="Card image cap">
        <div class="card-body" style="background: linear-gradient(to bottom, rgb(93, 154, 203), rgb(187, 238, 187));">
            <h5 class="card-title">Grab a Placement</h5>
            <p class="card-text">A good profile is like salt in a recipe, manage your profile so that you don't miss any opportunity.</p>
            <form action="StudentDashboardProfile" method="get">
             <input  name="email" type="hidden" value="<%=request.getAttribute("email") %>">
            <Button href="#" type="submit" class="btn btn-success">Open Profile</Button>
            </form>
        </div>
    </div>
    
    
      <div class="card" id="two" style="width: 28rem; margin-top: 7rem;box-shadow: 0 0 10px 5px rgba(70, 130, 180, 0.5)">
          <img class="card-img-top" src="https://akm-img-a-in.tosshub.com/businesstoday/images/story/202001/fellowship_660_020120061344_290120110648.jpg?size=1200:675" alt="Card image cap">
          <div class="card-body" style="background: linear-gradient(to bottom, rgb(93, 154, 203), rgb(187, 238, 187));">
              <h5 class="card-title">Looking for Placements?</h5>
              <p class="card-text">Explore the pool of placement and choose one that suits you.</p>
         
              <a href="PlacementStudentLive.jsp" class="btn btn-success" >See Ongoing Placements</a>
             
          </div>
      </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>