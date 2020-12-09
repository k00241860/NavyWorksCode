/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Course;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author igorh
 */
public class CourseServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //coding here 
        String action = request.getParameter("action");
        System.out.println("action = " + action);
        HttpSession session = request.getSession();

        String nextPage = "";
        switch (action) {
            case "RequestAddCourse":
                nextPage = "/AddCourse.html";
                break;
            case "addCourse":
                nextPage = processAddCourse(request, session, nextPage);
                break;
            case "home":
                nextPage = "/HomePage.jsp";
                break;
            case "RequestAllCourses":
                nextPage = processRequestAllCourses(session);
                break;
            case "EditCourse":
                nextPage = processGetCourseDetailsByCourseID(request, session);
                break;
            case "deleteCourse":
                nextPage = processDeleteCourse(request, session);
                break;
            case "saveCourse":
                nextPage = processSaveCourse(request, session);
                break;
            default:

        }

        gotoPage(nextPage, request, response);
    }

    private String processRequestAllCourses(HttpSession session) {
        String nextPage;
        System.out.println("in display all courses");
        ArrayList<Course> allCoursesList = new ArrayList<>();
        Course c1 = new Course();
        allCoursesList = c1.findAllCourses();
        session.setAttribute("AllCourses", allCoursesList);
        nextPage = "/DisplayAllCourses.jsp";
        return nextPage;
    }

    private String processAddCourse(HttpServletRequest request, HttpSession session, String nextPage) throws NumberFormatException {
        //debud info
        System.out.println("In processAddCourse");

        String code = request.getParameter("code");
        String levelString = request.getParameter("level");
        String duration = request.getParameter("duration");
        String pointsString = request.getParameter("points");
        String courseName = request.getParameter("courseName");
        String courseType = request.getParameter("courseType");
        String location = request.getParameter("location");
        String contactEmail = request.getParameter("contactEmail");
        String telephoneString = request.getParameter("telephone");
        String courseURL = request.getParameter("courseURL");
        String department = request.getParameter("department");
        String leavingCert = request.getParameter("leavingCert");
        String matureApplicants = request.getParameter("matureApplicants");
        String internationalApplicants = request.getParameter("internationalApplicants");
        String modules = request.getParameter("modules");
        String furtherStudies = request.getParameter("furtherStudies");
        String potentialJobs = request.getParameter("potentialJobs");
        String lcContact = request.getParameter("lcContact");
        String matureContact = request.getParameter("matureContact");
        String internationalContact = request.getParameter("internationalContact");

        //make values double
        int level = Integer.parseInt(levelString);
        int points = Integer.parseInt(pointsString);
        int telephone = Integer.parseInt(telephoneString);

        Course c = new Course(code, level, duration, points, courseName, courseType, location, contactEmail, telephone, courseURL, department, leavingCert, matureApplicants, internationalApplicants, modules, furtherStudies, potentialJobs, lcContact, matureContact, internationalContact);

        if (c.addCourse()) {
            //send the user a message to say it was added-> view
            String message = "Course " + c.getCourseName() + " was added to the system.";
            request.setAttribute("message", message);
            //display the page again - need a new list to reflect deleted book
            return this.processRequestAllCourses(session);

        }
        return nextPage;
    }

    private String processDeleteCourse(HttpServletRequest request, HttpSession session) {
        String nextPage;
        System.out.println("Delete Course");
        //get course details
        Course CourseDetails = new Course();
        //get courseCardsid from request
        String courseCardsIDString = (String) request.getParameter("courseCardsID");
        System.out.println("delete course for courseCardsID =" + courseCardsIDString);
        CourseDetails.deleteCourseByCourseID(courseCardsIDString);
        //display the page again - need a new list to reflect deleted book
        return this.processRequestAllCourses(session);
    }

    private String processGetCourseDetailsByCourseID(HttpServletRequest request, HttpSession session) {
        String nextPage;
        System.out.println("Edit Course");
        //get course details
        Course CourseDetails = new Course();
        //get coursecardsid from request
        String courseCardsIDString = (String) request.getParameter("courseCardsID");
        int courseCardsID = Integer.parseInt(courseCardsIDString);
        System.out.println("Edit course for courseCardsID =" + courseCardsID);
        CourseDetails = CourseDetails.findCourseByCourseID(courseCardsID);
        CourseDetails.print();
        session.setAttribute("Course", CourseDetails);
        nextPage = "/UpdateCourse.jsp";
        return nextPage;
    }

    private String processSaveCourse(HttpServletRequest request, HttpSession session) {
        String nextPage;
        System.out.println("Save Course");
        //get course details 
        //get new course details from request
        //get information from the course
        String courseCardsIDString = request.getParameter("courseCardsID");
        String code = request.getParameter("code");
        String levelString = request.getParameter("level");
        String duration = request.getParameter("duration");
        String pointsString = request.getParameter("points");
        String courseName = request.getParameter("courseName");
        String courseType = request.getParameter("courseType");
        String location = request.getParameter("location");
        String contactEmail = request.getParameter("contactEmail");
        String telephoneString = request.getParameter("telephone");
        String courseURL = request.getParameter("courseURL");
        String department = request.getParameter("department");
        String leavingCert = request.getParameter("leavingCert");
        String matureApplicants = request.getParameter("matureApplicants");
        String internationalApplicants = request.getParameter("internationalApplicants");
        String modules = request.getParameter("modules");
        String furtherStudies = request.getParameter("furtherStudies");
        String potentialJobs = request.getParameter("potentialJobs");
        String lcContact = request.getParameter("lcContact");
        String matureContact = request.getParameter("matureContact");
        String internationalContact = request.getParameter("internationalContact");

        int level = Integer.parseInt(levelString);
        int points = Integer.parseInt(pointsString);
        int telephone = Integer.parseInt(telephoneString);
        int courseCardsID = Integer.parseInt(courseCardsIDString);

        Course CourseDetails = new Course(courseCardsID, code, level, duration, points, courseName, courseType, location, contactEmail, telephone, courseURL, department, leavingCert, matureApplicants, internationalApplicants, modules, furtherStudies, potentialJobs, lcContact, matureContact, internationalContact);
        String message = null;
        if (CourseDetails.updateCourse()) {
            message = "Course updated";
        } else {
            message = "Error on course updated";
        }
        request.setAttribute("message", message);
        //display the page again - need a new list to reflect deleted member
        return this.processRequestAllCourses(session);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void gotoPage(String url, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
