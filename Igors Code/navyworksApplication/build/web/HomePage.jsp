<%-- 
    Document   : HomePage
    Created on : 07-Dec-2020, 21:57:25
    Author     : igorh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <h1>Welcome to the Courses Review Application</h1>
    </body>
    
   
    <form action="CourseServlet" method="get">
         <input type="hidden" name="action" value="RequestAllCourses">
         <input type="submit" value="Courses" >
         <br>
         
    </form>
    
    <c:out value="${message}" />
</html>
