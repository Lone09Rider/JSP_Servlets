<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String url = "jdbc:mysql://localhost:3306/mydb";
	String user = "root";
	String password = "123456";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, password);
	Statement st = con.createStatement();
	String qry = "SELECT * FROM student";
	ResultSet rs = st.executeQuery(qry);
	%>

	<h2>

		<%
		while (rs.next()) {
			int roll_num = rs.getInt(1);
			int marks = rs.getInt(2);
			String name = rs.getString(3);

			out.println(roll_num + ", " + marks + ", " + name+"<br>");
		}
		%>

	</h2>

</body>
</html>