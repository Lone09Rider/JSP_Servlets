

<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hey Guys!</h1>
        <sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/mydb" user="root" password="123456" var="ds"></sql:setDataSource>
        <sql:query dataSource="${ds}" var="res">SELECT * FROM student;</sql:query>
        <table>
            <tr>
                <td>Roll</td>
                <td>Marks</td>
                <td>Name</td>
            </tr>
        <c:forEach items="${res.rows}" var="row">
            <tr>
                <td><c:out value="${row.id}"></c:out></td>
                <td><c:out value="${row.name}"></c:out></td>
                <td><c:out value="${row.email}"></c:out></td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
