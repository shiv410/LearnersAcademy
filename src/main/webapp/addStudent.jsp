<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>addStudent</title>
<style>
form{
justify-content: center;
border: 1px solid black;
width:50%;
}
div{
padding-left:40px;
}
</style>
</head>
<body>
	
	<%@ include file="adminnav.jsp"%>
	
	<form action="StudentRegistration" method="post">
			<h3 style="color: #2a34c7; text-align:center;">Add new Student</h3>
			<hr>
		<div>
			<!-- <img alt="add image" src="image.jpg" height="300" width="450" align="right">  -->
			<b>Student Name</b><br> <input type="text" name="name" size="40"><br>
			<b>Student Contact Number</b><br> <input type="text"
				name="contact" size="40"><br> <b>Student Email</b><br>
			<input type="email" name="email" size="40"><br> <b>Select
				Course</b><br> <select name="course">
				<option>Java</option>
				<option>Python</option>
				<option>Php</option>
				<option>JavaScript</option>
				<option>C</option>
			</select><br> <b>Select Batch Type</b><br> <select name="batch" >
				<option>Regular</option>
				<option>WeekEnd</option>
			</select><br> <br> <input type="submit" value="Register"> <input
				type="reset" value=" Reset "> <br> <br>
		</div>
	</form>
</body>
</html>