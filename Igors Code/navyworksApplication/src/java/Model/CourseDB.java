/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author igorh
 */
public class CourseDB {

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

    public CourseDB(int courseCardsID, String code, int level, String duration, int points, String courseName, String courseType, String location, String contactEmail, int telephone, String courseURL, String department, String leavingCert, String matureApplicants, String internationalApplicants, String modules, String furtherStudies, String potentialJobs, String lcContact, String matureContact, String internationalContact) {
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

    public CourseDB(String code, int level, String duration, int points, String courseName, String courseType, String location, String contactEmail, int telephone, String courseURL, String department, String leavingCert, String matureApplicants, String modules, String furtherStudies, String potentialJobs, String lcContact, String matureContact, String internationalApplicants, String internationalContact) {
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

    public CourseDB() {

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

    public boolean addCourse() {
        //   boolean inserted = false;

        Connection c = DatabaseHelper.getConnection();
        String template = "INSERT INTO coursecards (code,level,duration,points,courseName,courseType,location,contactEmail,telephone,courseURL,department,leavingCert,matureApplicants,internationalApplicants,modules,furtherStudies,potentialJobs,lcContact,matureContact,internationalContact) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        System.out.println("in model adding course");
        if (c != null) {
            try {
                PreparedStatement inserter = c.prepareStatement(template);
                inserter.setString(1, this.code);
                inserter.setInt(2, this.level);
                inserter.setString(3, this.duration);
                inserter.setInt(4, this.points);
                inserter.setString(5, this.courseName);
                inserter.setString(6, this.courseType);
                inserter.setString(7, this.location);
                inserter.setString(8, this.contactEmail);
                inserter.setInt(9, this.telephone);
                inserter.setString(10, this.courseURL);
                inserter.setString(11, this.department);
                inserter.setString(12, this.leavingCert);
                inserter.setString(13, this.matureApplicants);
                inserter.setString(14, this.internationalApplicants);
                inserter.setString(15, this.modules);
                inserter.setString(16, this.furtherStudies);
                inserter.setString(17, this.potentialJobs);
                inserter.setString(18, this.lcContact);
                inserter.setString(19, this.matureContact);
                inserter.setString(20, this.internationalContact);

                int i = inserter.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.out.println("Error on find all " + ex);
                return false;
            }

        }
        return true;
    }

    public ArrayList<Course> findAllCourses() {

        System.out.println(" find all courses");
        ArrayList<Course> allCourses = new ArrayList<Course>();

        Connection c = DatabaseHelper.getConnection();

        String template = "SELECT * FROM coursecards;";

        if (c != null) {
            try {
                PreparedStatement inserter = c.prepareStatement(template);
                ResultSet resultSet = inserter.executeQuery();

                while (resultSet.next()) {
                    Course course = new Course();

                    course.setCourseCardsID(resultSet.getInt("courseCardsID"));
                    course.setCode(resultSet.getString("code"));
                    course.setLevel(resultSet.getInt("level"));
                    course.setDuration(resultSet.getString("duration"));
                    course.setPoints(resultSet.getInt("points"));
                    course.setCourseName(resultSet.getString("courseName"));
                    course.setCourseType(resultSet.getString("courseType"));
                    course.setLocation(resultSet.getString("location"));
                    course.setContactEmail(resultSet.getString("contactEmail"));
                    course.setTelephone(resultSet.getInt("telephone"));
                    course.setCourseURL(resultSet.getString("courseURL"));
                    course.setDepartment(resultSet.getString("department"));
                    course.setLeavingCert(resultSet.getString("leavingCert"));
                    course.setMatureApplicants(resultSet.getString("matureApplicants"));
                    course.setInternationalApplicants(resultSet.getString("internationalApplicants"));
                    course.setModules(resultSet.getString("modules"));
                    course.setFurtherStudies(resultSet.getString("furtherStudies"));
                    course.setPotentialJobs(resultSet.getString("potentialJobs"));
                    course.setLcContact(resultSet.getString("lcContact"));
                    course.setMatureContact(resultSet.getString("matureContact"));
                    course.setInternationalContact(resultSet.getString("internationalContact"));

                    allCourses.add(course);

                }

                System.out.println(inserter);
                inserter.close();
                c.close();
            } catch (SQLException ex) {
                System.out.println("Error on find all " + ex);
            }

        }
        return allCourses;
    }

    public boolean deleteCourseByCourseID(String dCourseCardsID) {
        //   boolean inserted = false;

        Connection c = DatabaseHelper.getConnection();
        String template = "DELETE FROM coursecards WHERE courseCardsID = ?";
        if (c != null) {
            try {
                PreparedStatement inserter = c.prepareStatement(template);
                inserter.setString(1, dCourseCardsID);
                int i = inserter.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.out.println("Error on find all " + ex);
                return false;
            }

        }
        return true;
    }

    public boolean updateCourse() {
        //   boolean inserted = false;

        Connection c = DatabaseHelper.getConnection();
        String template = "UPDATE coursecards SET code = ?, level = ?, duration = ?,points = ?, courseName = ?, courseType = ?, location = ?, contactEmail = ?, telephone = ?, courseURL = ?, department = ?, leavingCert = ?, matureApplicants = ?, internationalApplicants = ?, modules = ?, furtherStudies = ?, potentialJobs = ?, lcContact = ?, matureContact = ?, internationalContact = ? WHERE courseCardsID = ?";
        if (c != null) {
            try {
                PreparedStatement inserter = c.prepareStatement(template);
                inserter.setString(1, this.code);
                inserter.setInt(2, this.level);
                inserter.setString(3, this.duration);
                inserter.setInt(4, this.points);
                inserter.setString(5, this.courseName);
                inserter.setString(6, this.courseType);
                inserter.setString(7, this.location);
                inserter.setString(8, this.contactEmail);
                inserter.setInt(9, this.telephone);
                inserter.setString(10, this.courseURL);
                inserter.setString(11, this.department);
                inserter.setString(12, this.leavingCert);
                inserter.setString(13, this.matureApplicants);
                inserter.setString(14, this.internationalApplicants);
                inserter.setString(15, this.modules);
                inserter.setString(16, this.furtherStudies);
                inserter.setString(17, this.potentialJobs);
                inserter.setString(18, this.lcContact);
                inserter.setString(19, this.matureContact);
                inserter.setString(20, this.internationalContact);
                inserter.setInt(21, this.courseCardsID);
                System.out.println("update course::" + inserter);
                int i = inserter.executeUpdate();
                return true;
            } catch (SQLException ex) {
                System.out.println("Error on update " + ex);
                return false;
            }

        }
        return true;
    }

    public Course findCourseByCourseID(int courseCardsID) {

        Course course = null;
        System.out.println(" find all course by ID");
        Connection c = DatabaseHelper.getConnection();

        String template = "SELECT * FROM coursecards where courseCardsID = ?";

        if (c != null) {
            try {
                PreparedStatement inserter = c.prepareStatement(template);
                inserter.setInt(1, courseCardsID);
                ResultSet resultSet = inserter.executeQuery();
                System.out.println(inserter);
                while (resultSet.next()) {
                    course = new Course();
                    course.setCourseCardsID(resultSet.getInt("courseCardsID"));
                    course.setCode(resultSet.getString("code"));
                    course.setLevel(resultSet.getInt("level"));
                    course.setDuration(resultSet.getString("duration"));
                    course.setPoints(resultSet.getInt("points"));
                    course.setCourseName(resultSet.getString("courseName"));
                    course.setCourseType(resultSet.getString("courseType"));
                    course.setLocation(resultSet.getString("location"));
                    course.setContactEmail(resultSet.getString("contactEmail"));
                    course.setTelephone(resultSet.getInt("telephone"));
                    course.setCourseURL(resultSet.getString("courseURL"));
                    course.setDepartment(resultSet.getString("department"));
                    course.setLeavingCert(resultSet.getString("leavingCert"));
                    course.setMatureApplicants(resultSet.getString("matureApplicants"));
                    course.setInternationalApplicants(resultSet.getString("internationalApplicants"));
                    course.setModules(resultSet.getString("modules"));
                    course.setFurtherStudies(resultSet.getString("furtherStudies"));
                    course.setPotentialJobs(resultSet.getString("potentialJobs"));
                    course.setLcContact(resultSet.getString("lcContact"));
                    course.setMatureContact(resultSet.getString("matureContact"));
                    course.setInternationalContact(resultSet.getString("internationalContact"));

                }
                inserter.close();
                c.close();
            } catch (SQLException ex) {
                System.out.println("Error on find all " + ex);
            }

        }
        return course;
    }
}
