<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
form{

border: 1px solid black;
width:40%;
margin-left:auto;
margin-right:auto;
}
div{
padding:30px;
}
</style>

</head>
<body>
<%@ include file="nav.jsp" %>
<form action="LogIn_Page" method="post"> 
<h2 style="color: #2a34c7; text-align:center;">Login Here</h2>
			<hr>
<div>
<b>User Email</b><br> 
<input type="email" name="email" placeholder="Enter email" size="30"><br><br> 
<b>User Password</b><br> 
<input type="password" name="password" placeholder="Enter password" size="30"><br><br> 
<input type="submit" value="LogIn"> 
</div>
</form>
</body>
</html>