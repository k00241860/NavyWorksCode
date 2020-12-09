/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author igorh
 */
public class Course implements Serializable {

    private int courseCardsID;
    private String code;
    private int level;
    private String duration;
    private int points;
    private String courseName;
    private String courseType;
    private String location;
    private String contactEmail;
    private int telephone;
    private String courseURL;
    private String department;
    private String leavingCert;
    private String matureApplicants;
    private String internationalApplicants;
    private String modules;
    private String furtherStudies;
    private String potentialJobs;
    private String lcContact;
    private String matureContact;
    private String internationalContact;

    public Course(String code, int level, String duration, int points, String courseName, String courseType, String location, String contactEmail, int telephone, String courseURL, String department, String leavingCert, String matureApplicants, String internationalApplicants, String modules, String furtherStudies, String potentialJobs, String lcContact, String matureContact, String internationalContact) {
        this.code = code;
        this.level = level;
        this.duration = duration;
        this.points = points;
        this.courseName = courseName;
        this.courseType = courseType;
        this.location = location;
        this.contactEmail = contactEmail;
        this.telephone = telephone;
        this.courseURL = courseURL;
        this.department = department;
        this.leavingCert = leavingCert;
        this.matureApplicants = matureApplicants;
        this.internationalApplicants = internationalApplicants;
        this.modules = modules;
        this.furtherStudies = furtherStudies;
        this.potentialJobs = potentialJobs;
        this.lcContact = lcContact;
        this.matureContact = matureContact;
        this.internationalContact = internationalContact;
    }

    public Course(int courseCardsID, String code, int level, String duration, int points, String courseName, String courseType, String location, String contactEmail, int telephone, String courseURL, String department, String leavingCert, String matureApplicants, String internationalApplicants, String modules, String furtherStudies, String potentialJobs, String lcContact, String matureContact, String internationalContact) {
        this.courseCardsID = courseCardsID;
        this.code = code;
        this.level = level;
        this.duration = duration;
        this.points = points;
        this.courseName = courseName;
        this.courseType = courseType;
        this.location = location;
        this.contactEmail = contactEmail;
        this.telephone = telephone;
        this.courseURL = courseURL;
        this.department = department;
        this.leavingCert = leavingCert;
        this.matureApplicants = matureApplicants;
        this.internationalApplicants = internationalApplicants;
        this.modules = modules;
        this.furtherStudies = furtherStudies;
        this.potentialJobs = potentialJobs;
        this.lcContact = lcContact;
        this.matureContact = matureContact;
        this.internationalContact = internationalContact;
    }

    public Course() {

    }

    public String getInternationalApplicants() {
        return internationalApplicants;
    }

    public void setInternationalApplicants(String internationalApplicants) {
        this.internationalApplicants = internationalApplicants;
    }

    public int getCourseCardsID() {
        return courseCardsID;
    }

    public void setCourseCardsID(int courseCardsID) {
        this.courseCardsID = courseCardsID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getCourseURL() {
        return courseURL;
    }

    public void setCourseURL(String courseURL) {
        this.courseURL = courseURL;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLeavingCert() {
        return leavingCert;
    }

    public void setLeavingCert(String leavingCert) {
        this.leavingCert = leavingCert;
    }

    public String getMatureApplicants() {
        return matureApplicants;
    }

    public void setMatureApplicants(String matureApplicants) {
        this.matureApplicants = matureApplicants;
    }

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }

    public String getFurtherStudies() {
        return furtherStudies;
    }

    public void setFurtherStudies(String furtherStudies) {
        this.furtherStudies = furtherStudies;
    }

    public String getPotentialJobs() {
        return potentialJobs;
    }

    public void setPotentialJobs(String potentialJobs) {
        this.potentialJobs = potentialJobs;
    }

    public String getLcContact() {
        return lcContact;
    }

    public void setLcContact(String lcContact) {
        this.lcContact = lcContact;
    }

    public String getMatureContact() {
        return matureContact;
    }

    public void setMatureContact(String matureContact) {
        this.matureContact = matureContact;
    }

    public String getInternationalContact() {
        return internationalContact;
    }

    public void setInternationalContact(String internationalContact) {
        this.internationalContact = internationalContact;
    }

    public Course findCourseByCourseID(int courseID) {

        CourseDB coursedb = new CourseDB();
        return coursedb.findCourseByCourseID(courseID);
    }

    public boolean updateCourse() {

        CourseDB coursedb = new CourseDB(courseCardsID, code, level, duration, points, courseName, courseType, location, contactEmail, telephone, courseURL, department, leavingCert, matureApplicants, internationalApplicants, modules, furtherStudies, potentialJobs, lcContact, matureContact, internationalContact);
        return coursedb.updateCourse();
    }

    public boolean addCourse() {

        CourseDB coursedb = new CourseDB(code, level, duration, points, courseName, courseType, location, contactEmail, telephone, courseURL, department, leavingCert, matureApplicants, internationalApplicants, modules, furtherStudies, potentialJobs, lcContact, matureContact, internationalContact);
        return coursedb.addCourse();
    }

    public ArrayList<Course> findAllCourses() {

        CourseDB coursedb = new CourseDB();
        return coursedb.findAllCourses();

    }

    public boolean deleteCourseByCourseID(String courseCardsID) {

        CourseDB courseDB = new CourseDB();
        return courseDB.deleteCourseByCourseID(courseCardsID);
    }

    public void print() {

        System.out.println("Code " + code);
        System.out.println("Level " + level);
        System.out.println("Duration " + duration);
        System.out.println("Points " + points);
        System.out.println("Course Name " + courseName);
        System.out.println("Course Type " + courseType);
        System.out.println("Location " + location);
        System.out.println("Contact Email " + contactEmail);
        System.out.println("Telephone " + telephone);
        System.out.println("Course URL " + courseURL);
        System.out.println("Department " + department);
        System.out.println("LeavingCert " + leavingCert);
        System.out.println("Mature Applicants " + matureApplicants);
        System.out.println("International Applicants " + internationalApplicants);
        System.out.println("Modules " + modules);
        System.out.println("Further Studies " + furtherStudies);
        System.out.println("Potential Jobs " + potentialJobs);
        System.out.println("Leaving Certificate Contact " + lcContact);
        System.out.println("Mature Contact " + matureContact);
        System.out.println("International Contact " + internationalContact);
        System.out.println("****************************");

}

}
