<%-- 
    Document   : UpdateCourse
    Created on : 08-Dec-2020, 21:33:36
    Author     : igorh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Course</title>
    </head>
    <body>
        <h1>Update Course</h1>
        <form action="CourseServlet" method="GET">    
            <input type="hidden" name="action" value="saveCourse">

            <input type="hidden" name="courseCardsID" value="<c:out value='${Course.courseCardsID}' />">
            
            <label for="code">Code</label><br>
            <input type="text" name="code" id="code" value="<c:out value='${Course.code}' />"><br>	

            <label for="level">level</label><br>
            <input type="text" name="level" id="level" value="<c:out value='${Course.level}' />"><br>

            <label for="duration">Duration</label><br>
            <input type="text" name="duration" id="duration" value="<c:out value='${Course.duration}' />"><br>				

            <label for="points">Points</label><br>
            <input type="text" name="points" id="points" value="<c:out value='${Course.points}' />"><br>

            <label for="courseName">Course Name</label><br>
            <input type="text" name="courseName" id="address" value="<c:out value='${Course.courseName}' />"><br>				

            <label for="courseType">Course Type</label><br>
            <input type="text" name="courseType" id="image" value="<c:out value='${Course.courseType}'/>"><br>

            <label for="location">Location</label><br>
            <input type="text" name="location" id="location" value="<c:out value='${Course.location}' />"><br>

            <label for="contactEmail">Contact Email</label><br>
            <input type="text" name="contactEmail" id="contactEmail" value="<c:out value='${Course.contactEmail}' />"><br>

            <label for="telephone">Telephone</label><br>
            <input type="text" name="telephone" id="telephone" value="<c:out value='${Course.telephone}' />"><br>

            <label for="courseURL">Course URL</label><br>
            <input type="text" name="courseURL" id="courseURL" value="<c:out value='${Course.courseURL}' />"><br>

            <label for="department">Department</label><br>
            <input type="text" name="department" id="department" value="<c:out value='${Course.department}' />"><br>

            <label for="leavingCert">Leaving Cert</label><br>
            <input type="text" name="leavingCert" id="leavingCert" value="<c:out value='${Course.leavingCert}' />"><br>

            <label for="matureApplicants">Mature Applicants</label><br>
            <input type="text" name="matureApplicants" id="matureApplicants" value="<c:out value='${Course.matureApplicants}' />"><br>
            
            <label for="internationalApplicants">International Applicants</label><br>
            <input type="text" name="internationalApplicants" id="internationalApplicants" value="<c:out value='${Course.internationalApplicants}' />"><br>

            <label for="modules">Modules</label><br>
            <input type="text" name="modules" id="modules" value="<c:out value='${Course.modules}' />"><br>

            <label for="furtherStudies">Further Studies</label><br>
            <input type="text" name="furtherStudies" id="furtherStudies" value="<c:out value='${Course.furtherStudies}' />"><br>

            <label for="potentialJobs">Potential Jobs</label><br>
            <input type="text" name="potentialJobs" id="potentialJobs" value="<c:out value='${Course.potentialJobs}' />"><br>

            <label for="lcContact">Leaving Cert Contact</label><br>
            <input type="text" name="lcContact" id="lcContact" value="<c:out value='${Course.lcContact}' />"><br>

            <label for="matureContact">Mature Contact</label><br>
            <input type="text" name="matureContact" id="matureContact" value="<c:out value='${Course.matureContact}' />"><br>

            <label for="internationalContact">International Contact</label><br>
            <input type="text" name="internationalContact" id="internationalContact" value="<c:out value='${Course.internationalContact}' />"><br>
            
            <input type="submit" value="Submit">

        </form>
    </body>
</html>
