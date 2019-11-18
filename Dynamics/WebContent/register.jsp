<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Dynamics/RegisterServlet" method="post">
<table>
	<tr>
		<th  colspan="2">Registration</th>
	</tr>
	<tr>
		<th>First Name:</th>
		<td><input type="text" name="fname"></td>
	</tr>
	<tr>
		<th>Last Name:</th>
		<td><input type="text" name="lname"></td>
	</tr>
	<tr>
		<th>Email:</th>
		<td><input type="email" name="email"></td>
	</tr>
	<tr>
		<th>Phone number:</th>
		<td><input type="text" name="num"></td>
	</tr>
	<tr>
		<th>Password:</th>
		<td><input type="password" name="password"></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Register"></td>
	</tr>
</table>
</form>

</body>
</html>