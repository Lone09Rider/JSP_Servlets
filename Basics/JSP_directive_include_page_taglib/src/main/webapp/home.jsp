<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file = "head.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("username");
	
	%>
	<h2 style="color: red;">
		<%
			out.println("Welcome " + name);
		%>
	</h2>
	<%
	int i = 10;
	%>
	Your Roll Number is :
	<%
	out.println(i);
	%>
</body>
</html>