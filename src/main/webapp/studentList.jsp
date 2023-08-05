<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.Statement"%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="servlet.jdbc.ConnectionClass.ConnectionProvider"%>
<%-- <%@page import="servlet.jdbc.input.ShowStudentData"%>--%>
<%@page import="servlet.jdbc.StudentDAO.StudentDAO"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}

th, td {
	padding: 8px;
}

th {
	background-color: #191f42;
}

table {
	width: 90%;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>

	<%@ include file="adminnav.jsp"%>
	<form action="ShowStudentData" method="post">
		<h1 style="text-align: center;">Students List</h1>
		<!-- <p>Double tap on show data to refresh page</p>  -->
		<table>
			<tr style="color: white;">
				<th>S ID</th>
				<th>Name</th>
				<th>Contact</th>
				<th>Email</th>
				<th>Course</th>
				<th>Batch Type</th>
				<th>Update</th>
			</tr>
			<%
			try {
				String ShowData = "select * from students";
				Connection conn = ConnectionProvider.CreateConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(ShowData);
				while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<td><%=rs.getString(6)%></td>
				<!-- <td><a href="UpdateStudent.jsp">Edit</a></td> -->
				<!-- <td>Edit</td> -->
				<td><a href="UpdateStudent.jsp"><input type="button"
						value="Edit"></a>&nbsp;<a><input type="button"
						value="Delete"></a></td>
			</tr>
			<%
			}
			} catch (Exception e) {
			out.print(e);
			}
			%>
		</table>
	</form>

</body>
</html>