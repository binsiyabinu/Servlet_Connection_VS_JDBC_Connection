<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
    	<div class="jumbotron text-center" style="background-color:black; color:white">
       		<!--welcome page  -->
       		<h2>Welcome</h2>
       	<br><br>
       	
       	<a href="login.jsp"><input type="button" value="Sign In"></a>
       		<a href="register.jsp"><input type="button" value="Sign Up"></a>
       		
       	<br><br>	
       	
       	<!-- code for successful login --> 
       	 <% Iterator itr;%>
    			<% List mydata = (List)request.getAttribute("data1");%>
    			<% itr=mydata.iterator(); %>
       	<% boolean status = (boolean)request.getAttribute("data");
       	    if(status)
       	    {
       	    	out.print("Successful Login");
       	    %>	
       	    	
           	    
           	   <div class="jumbotron text-center" style="background-color:#11e08a; color:white">
       
    			<% out.println("Welcome"+" "+mydata.get(0)+" "+" "+mydata.get(1)+"\n"); %>
    			<br><br>
    			<% out.println("Your email: "+mydata.get(2)+"\n");%>
    			<br><br>
    			<% out.println("Your number: "+mydata.get(3)+"\n");%>
    			<br><br>
    			<% out.println("Your password: "+mydata.get(4)+"\n");%>
           	    </div>
          
       	    	
       	  	
       	   <% }
       	    else
       	    {
       	    	
       	    	out.print("Invalid username or password!");
       	    }%>
       	    
       	    
       	    
       	    <br><br>
       	    
       	  </div>  
   
</body>
</html>