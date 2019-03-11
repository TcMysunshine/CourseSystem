package com.nju.Model;


import lombok.Data;

@Data
public class CourseShowModel {
    private String courseEncoding;

    private String courseName;

    private String courseConcreteInformation;

    private String courseConcreteRequest;

    private Integer courseConcreteCredit;

    private String courseConcreteClassroom;

    private String courseConcreteTime;
    private String teacherName;

    public String getCourseEncoding() {
        return courseEncoding;
    }

    public void setCourseEncoding(String courseEncoding) {
        this.courseEncoding = courseEncoding;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseConcreteInformation() {
        return courseConcreteInformation;
    }

    public void setCourseConcreteInformation(String courseConcreteInformation) {
        this.courseConcreteInformation = courseConcreteInformation;
    }

    public String getCourseConcreteRequest() {
        return courseConcreteRequest;
    }

    public void setCourseConcreteRequest(String courseConcreteRequest) {
        this.courseConcreteRequest = courseConcreteRequest;
    }

    public Integer getCourseConcreteCredit() {
        return courseConcreteCredit;
    }

    public void setCourseConcreteCredit(Integer courseConcreteCredit) {
        this.courseConcreteCredit = courseConcreteCredit;
    }

    public String getCourseConcreteClassroom() {
        return courseConcreteClassroom;
    }

    public void setCourseConcreteClassroom(String courseConcreteClassroom) {
        this.courseConcreteClassroom = courseConcreteClassroom;
    }

    public String getCourseConcreteTime() {
        return courseConcreteTime;
    }

    public void setCourseConcreteTime(String courseConcreteTime) {
        this.courseConcreteTime = courseConcreteTime;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
