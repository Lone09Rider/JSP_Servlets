<%-- 
    Document   : home
    Created on : 29-Dec-2022, 1:18:33 am
    Author     : KirA
--%>
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
        
        <h1>Hello World!</h1>
        <c:set var="name" value="KirA"></c:set>
        <h1><c:out value="${name}"></c:out></h1>
        <h3>Length of name is : <c:out value="${fn:length(name)}"></c:out></h3>
        <c:out value="${fn:toLowerCase(name)}"></c:out><br>
        <c:out value="${fn:contains(name, 'jj')}"></c:out>
        
    </body>
</html>
