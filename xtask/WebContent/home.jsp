<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

</head>
<body bgcolor="yellow">


<nav class="navbar navbar-expand-sm navbar-primary bg-dark">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="signup.jsp">signin</a>
    </li>
  </ul>
        
</nav>
<form action="Sumbit.do">

<div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">UserName</label>
    <input type="text" class="form-control" name="userName" placeholder="enter the userName">
    </div>
    </div>
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Email</label>
    <input type="text" class="form-control" name="email" placeholder="enter the EmailId">
    </div>
    </div>
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Mobile</label>
    <input type="text" class="form-control" name="mobile" placeholder="Enter the Mobile Number">
    </div>
    </div>
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Password</label>
    <input type="text" class="form-control" name="password" placeholder="Enter the Password">
    </div>
    </div>
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Confirm Password</label>
    <input type="text" class="form-control" name="confirmpassword" placeholder="Re enter the Password ">
    </div>
    </div>
         <input type="submit" value="signup">
         
        
    </form>
    

</body>

</html>