<%-- 
    Document   : DisplayAllCourses
    Created on : 07-Dec-2020, 22:05:42
    Author     : igorh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script>
  function del_confirm(msg,url)
        {
            if(confirm(msg))
            {
                window.location.href=url;
            }
            else
            {
                false;
            }

        }  
    
</script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display all Courses</title>
        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
                text-align: left;
            }
        </style>
    </head>
    <body>
        <h1>Display All Courses</h1>
        <c:out value="${message}" />
        <a href="/navyworksApplication/CourseServlet?action=home">Home Page</a>
        <form action="CourseServlet" method="get">
            <input type="hidden" name="action" value="RequestAddCourse">
            <input type="submit" value="Add Course" >
            <br>

        </form>
        <table>
            <tr>
                <th>Code</th>                                 
                <th>Level</th>
                <th>Duration</th>
                <th>Points</th>
                <th>Course Name</th>
                <th>Course Type</th>
                <th>Location</th>
                <th>Contact Email</th>
                <th>Telephone</th>
                <th>Course URL</th>
                <th>Department</th>
                <th>Leaving Cert</th>
                <th>Mature Applicants</th>
                <th>International Applicants</th>
                <th>Modules</th>
                <th>Further Studies</th>
                <th>Potential Jobs</th>
                <th>Leaving Cert Contact</th>
                <th>Mature Contact</th>
                <th>International Contact</th>
                <th>Action</th>

            </tr>
            <tr>
                <c:forEach var="Course" items="${AllCourses}">
                <tr>
                    <td><c:out value="${Course.code}" /></td>
                    <td><c:out value="${Course.level}" /></td>
                    <td><c:out value="${Course.duration}" /></td>
                    <td><c:out value="${Course.points}" /></td>
                    <td><c:out value="${Course.courseName}" /></td>
                    <td><c:out value="${Course.courseType}" /></td>
                    <td><c:out value="${Course.location}" /></td>
                    <td><c:out value="${Course.contactEmail}" /></td>
                    <td><c:out value="${Course.telephone}" /></td>
                    <td><c:out value="${Course.courseURL}" /></td>
                    <td><c:out value="${Course.department}" /></td>
                    <td><c:out value="${Course.leavingCert}" /></td>
                    <td><c:out value="${Course.matureApplicants}" /></td>
                    <td><c:out value="${Course.internationalApplicants}" /></td>
                    <td><c:out value="${Course.modules}" /></td>
                    <td><c:out value="${Course.furtherStudies}" /></td>
                    <td><c:out value="${Course.potentialJobs}" /></td>
                    <td><c:out value="${Course.lcContact}" /></td>
                    <td><c:out value="${Course.matureContact}" /></td>
                    <td><c:out value="${Course.internationalContact}" /></td>

                    <td>
                        <a href="/navyworksApplication/CourseServlet?action=EditCourse&courseCardsID=<c:out value='${Course.courseCardsID}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a onclick="del_confirm('Are you Sure want to delete the Course, named <c:out value="${Course.courseName}" />?','/navyworksApplication/CourseServlet?action=deleteCourse&courseCardsID=<c:out value='${Course.courseCardsID}' />')" href="#">Delete</a> 
                        
                    </td>
                </tr>
            </c:forEach>   
        </tr>
    </table>
</body>
</html>
