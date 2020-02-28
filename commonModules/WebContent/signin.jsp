<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title> <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

</head>
<body bgcolor="yellow">


<nav class="navbar navbar-expand-sm navbar-primary bg-dark">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="signin.jsp">X-workz</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="signup.jsp">signup</a>
    </li>
  </ul>
        
</nav>
<form action="signin.do" method="post">
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Email</label>
    <input type="email" class="form-control" name="email" placeholder="enter the EmailId">
    </div>
    </div>
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Password</label>
    <input type="password" class="form-control" name="password" placeholder="Enter the Passsword">
    </div>
    </div>
     <button type="submit" value="login">login</button>
         </form> 
         <div align="center">

<span style="color:red">${failureMessage}</span>

</div>
    

</body>
</html>