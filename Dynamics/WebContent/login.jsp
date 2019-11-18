<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
</head>
<body>


<div class="jumbotron text-center" style="background-color:black; color:white">

<form action="/Dynamics/LoginServlet"  method="post">
<h5>Username:</h5><input type="text" name="uname" >
<br><br>
<h5>Password:</h5><input type="password" name="pass">
<br><br>
<input type="submit" value="Login">
 <br>
 
 </form>
 <a href="#">forgot password?</a>
</div>


</body>
</html>